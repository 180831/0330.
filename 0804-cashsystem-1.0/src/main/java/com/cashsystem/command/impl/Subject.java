package com.cashsystem.command.impl;

import com.cashsystem.entity.Account;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:Light_Long
 * Date:2019-08-04
 * Time:11:44
 */
public class Subject {

    private Account account;//账户

    public void setAccount(Account account) {
        this.account = account;
    }

    public Account getAccount() {
        return this.account;
    }
}
