package com.spring.restful.lab.model;

import lombok.Data;

import org.springframework.data.annotation.Id;

/**
 * @author pbonansea
 *
 */
@Data
public class User {

    @Id
    private String id;

    private String userName;

    private String userPwd;

}
