package org.loginProject.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


/**
 * @author Ali
 * Create on 4/19/2018 11:00 AM
 */

@SpringBootApplication
@EnableAutoConfiguration
@EnableJpaRepositories("org.loginProject.repository.*")
public class SpringBootApp extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringBootApp.class);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringBootApp.class, args);
    }

}
