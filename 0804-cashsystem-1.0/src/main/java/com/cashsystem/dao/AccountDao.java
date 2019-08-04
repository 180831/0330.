package com.cashsystem.dao;

import com.cashsystem.common.AccountStatus;
import com.cashsystem.common.AccountType;
import com.cashsystem.entity.Account;
import org.apache.commons.codec.digest.DigestUtils;

import java.lang.annotation.Retention;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:Light_Long
 * Date:2019-08-04
 * Time:16:30
 */
public class AccountDao extends BaseDao{
    //操作数据库
    public Account login(String username, String password) {
        Connection connection = null;   //连接数据库
        PreparedStatement preparedStatement = null; //预处理
        ResultSet resultSet = null; //返回结果
        Account account = null;

        try{
            //拿到连接
            connection = this.getConnection(true);
            String sql = "select id,uesername,password,name," +
                    "account_type,account_status from account where" +
                    "username = ? and password = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,username);
            preparedStatement.setString(2,DigestUtils.md5Hex(password));
            //加密密码
            resultSet = preparedStatement.executeQuery(sql);

            //返回结果集到resultSet
            if(resultSet.next()) {
                //解析resultSet 拿到对应的account
                account = this.extractAccount(resultSet);
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }

        return account;

    }

    public Account Register() {
        Account account = null;

        return account;
    }

    private  Account extractAccount(ResultSet resultSet) throws SQLException {
        Account account = new Account();

        account.setId(resultSet.getInt("id"));
        account.setUsername(resultSet.getString("username"));
        account.setPassword(resultSet.getString("password"));
        account.setName(resultSet.getString("name"));
        account.setAccountType(AccountType.valueOf(resultSet.getString("account_type")));
        account.setAccountStatus(AccountStatus.valueOf(resultSet.getString("account_status")));
        return account;

    }
}
