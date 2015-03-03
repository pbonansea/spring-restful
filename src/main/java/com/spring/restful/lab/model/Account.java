package com.spring.restful.lab.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * Class account entity.
 * @author pbonansea
 *
 */
@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "accounts")
@JsonInclude(Include.NON_DEFAULT)
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name", nullable = false)
    @NonNull
    private String name;

    @Column(name = "airline_id")
    private String airlineId;

    @Column(name = "max_content_size")
    private String maxContentSize;

}
