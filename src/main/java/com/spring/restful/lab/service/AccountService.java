package com.spring.restful.lab.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.restful.lab.dao.AccountDAO;
import com.spring.restful.lab.model.Account;

/**
 * @author pbonansea
 *
 */
@Service
public class AccountService {

    @Autowired
    private AccountDAO accountDAO;

    public Account save(final Account account) {

        return accountDAO.save(account);

    }

}
