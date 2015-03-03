package com.spring.restful.lab.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.restful.lab.model.User;
import com.spring.restful.lab.repository.UserRepository;

/**
 * Class user service.
 * @author pbonansea
 *
 */
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    /**
     * Method that save a user object.
     * @param user User object
     * @return User object saved
     */
    public User save(final User user) {

        return userRepository.save(user);

    }

}