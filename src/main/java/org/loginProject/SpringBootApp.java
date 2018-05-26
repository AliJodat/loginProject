package org.loginProject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;




@SpringBootApplication
public class SpringBootApp extends SpringBootServletInitializer{

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringBootApp.class, args);
    }

}

