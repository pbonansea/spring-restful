package com.spring.restful.lab.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.restful.lab.model.Account;

/**
 * 
 * @author pbonansea
 *
 */
@Repository
public class AccountDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public Account save(final Account account) {

        account.setId((Long)sessionFactory.getCurrentSession().save(account));

        return account;

    }

}
