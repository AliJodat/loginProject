package org.loginProject.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author Ali
 * Create on 5/24/2018 8:44 PM
 */

@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {



    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .inMemoryAuthentication()
                    .withUser("user")
                    .password("1")
                    .roles("USER")
                    .and()
                .withUser("admin")
                    .password("12")
                    .roles("ADMIN","USER");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .authorizeRequests()
                    .antMatchers("/View/Login/Signup.jsp","/rest/**").permitAll()
                    .antMatchers("/View/admin/**").hasAnyRole("ADMIN")
                    .antMatchers("/View/user/**").hasAnyRole("USER")
                .anyRequest()
                .authenticated()
                .and()
                .formLogin()
                    .loginPage("/View/Login/Signin.jsp").permitAll().and()
                    .logout().permitAll();
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        web
                .ignoring()
                .antMatchers("/assets/**");
    }


}
