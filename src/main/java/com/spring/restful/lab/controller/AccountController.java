package com.spring.restful.lab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.restful.lab.model.Account;
import com.spring.restful.lab.service.AccountService;

/**
 * @author pbonansea
 *
 */
@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;

    /**
     * Method that save an account object.
     * @param account User object
     * @return Account object saved
     */
    @RequestMapping(method = RequestMethod.POST, value = "/account")
    @Transactional
    public Account save(@RequestBody final Account account) {

        return accountService.save(account);

    }

}
