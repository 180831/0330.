package com.cashsystem.service;

import com.cashsystem.dao.AccountDao;
import com.cashsystem.entity.Account;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:Light_Long
 * Date:2019-08-04
 * Time:16:28
 */
public class AccountService {

    private AccountDao accountDao;

    public AccountService() {
        this.accountDao = new AccountDao();
    }

    public Account login(String username, String password) {
        return this.accountDao.login(username,password);
    }

    public Account Register() {

        return this.accountDao.Register();
    }
}
