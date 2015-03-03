package com.spring.restful.lab.model;

import lombok.Data;

import org.springframework.data.annotation.Id;

/**
 * @author pbonansea
 *
 */
@Data
public class Person {

    @Id
    private String id;

    private String firstName;

    private String lastName;

}
