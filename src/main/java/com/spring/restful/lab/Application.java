package com.spring.restful.lab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;

/**
 * @author pbonansea
 *
 */
@ComponentScan
@EnableMongoRepositories
@Import(RepositoryRestMvcConfiguration.class)
@EnableAutoConfiguration
public class Application {

    /**
     * @param args Application arguments
     */
    public static void main(final String[] args) {

        SpringApplication.run(Application.class, args);

    }

    /**
     * Return app name.
     * @return App name
     */
    public String getName() {
        return "spring-restful-lab";
    }

}
