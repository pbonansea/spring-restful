package com.spring.restful.lab.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.spring.restful.lab.model.User;

/**
 * @author pbonansea
 *
 */
public interface UserRepository extends MongoRepository<User, String> {

}
