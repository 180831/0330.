package com.cashsystem.entity;

import com.cashsystem.common.AccountStatus;
import com.cashsystem.common.AccountType;
import lombok.Data;
//自动提供当前类的get/set方法等（配套@Data）
/**
 * Created with IntelliJ IDEA
 * Description:
 * User:Light_Long
 * Date:2019-08-04
 * Time:10:14
 */
@Data
//自动提供当前类的get/set方法等
public class Account {

    private Integer id;
    private String username;
    private String password;
    private String name;
    private AccountType accountType;
    private AccountStatus accountStatus;


}
