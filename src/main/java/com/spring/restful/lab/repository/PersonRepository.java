package com.spring.restful.lab.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.spring.restful.lab.model.Person;

/**
 * Class repository person.
 * @author pbonansea
 *
 */
@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface PersonRepository extends MongoRepository<Person, String> {

    /**
     * Find a person by last name.
     * @param name Last name
     * @return List<Person> list of person
     */
    List<Person> findByLastName(@Param("name") final String name);

}
