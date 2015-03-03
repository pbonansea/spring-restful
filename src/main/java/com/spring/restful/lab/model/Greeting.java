package com.spring.restful.lab.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Class entity greeting.
 * @author pbonansea
 *
 */
@Data
@AllArgsConstructor
public class Greeting {

    /**
     * Id property.
     */
    private long id;

    /**
     * Content property.
     */
    private String content;

}
