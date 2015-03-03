package com.spring.restful.lab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.restful.lab.model.User;
import com.spring.restful.lab.service.UserService;

/**
 * Class user controller.
 * @author pbonansea
 *
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * Method that save an user object.
     * @param user User object
     * @return User object saved
     */
    @RequestMapping(method = RequestMethod.POST, value = "/user")
    @Transactional
    public User save(@RequestBody final User user) {

        return userService.save(user);

    }

}
