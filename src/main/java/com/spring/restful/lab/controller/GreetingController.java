package com.spring.restful.lab.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.restful.lab.model.Greeting;
import com.spring.restful.lab.service.GreetingService;

/**
 * Rest controller greeting.
 * @author pbonansea
 *
 */
@RestController
public class GreetingController {

    /**
     * Template static value.
     */
    private static final String TEMPLATE = "Hello, %s!";

    /**
     * Counter final value.
     */
    private final AtomicLong counter = new AtomicLong();

    @Autowired
    private GreetingService greetingService;

    /**
     * Rest service method taht return a greeting model object.
     * @param name Name param value
     * @return Greeting object
     */
    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") final String name) {

        return new Greeting(counter.incrementAndGet(),
                String.format(TEMPLATE, name));
    }

    /**
     * Rest service that create a new greeting model object.
     * @param greeting Greeting model object
     * @return New greeting model object
     */
    @RequestMapping(method = RequestMethod.POST, value = "/greeting")
    public Greeting addGreeting(@RequestBody final Greeting greeting) {

        return greetingService.save(greeting.getContent());

    }

}
