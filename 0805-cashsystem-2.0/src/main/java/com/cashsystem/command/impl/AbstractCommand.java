package com.cashsystem.command.impl;

import com.cashsystem.service.AccountService;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:Light_Long
 * Date:2019-08-04
 * Time:11:43
 */
public abstract class AbstractCommand implements Command{

    //启动所有的服务
    public AccountService accountService;

    public AbstractCommand() {
        this.accountService = new AccountService();
    }
}
