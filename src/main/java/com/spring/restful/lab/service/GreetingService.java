package com.spring.restful.lab.service;

import org.springframework.stereotype.Service;

import com.spring.restful.lab.model.Greeting;

/**
 * Class service greeting.
 * @author pbonansea
 *
 */
@Service
public class GreetingService {

    /**
     * Service method to add a new greeting.
     * @param content Content value
     * @return Greeting New Greeting object
     */
    public Greeting save(final String content) {

        return new Greeting(1, content);

    }

}
