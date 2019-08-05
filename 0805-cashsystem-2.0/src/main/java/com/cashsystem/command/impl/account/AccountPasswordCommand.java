package com.cashsystem.command.impl.account;

import com.cashsystem.command.annotation.AdminCommand;
import com.cashsystem.command.annotation.CommandMeta;
import com.cashsystem.command.impl.AbstractCommand;
import com.cashsystem.command.impl.Subject;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:Light_Long
 * Date:2019-08-04
 * Time:11:39
 */
@CommandMeta(
        name = "CZMM",
        desc = "重置密码",
        group = "账号信息"
)
@AdminCommand
public class AccountPasswordCommand extends AbstractCommand {

    @Override
    public void execute(Subject subject) {
        System.out.println("");
    }
}
