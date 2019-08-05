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
 * Time:11:40
 */
@CommandMeta(
        name = "QTZH",
        desc = "启停账号",
        group = "账号信息"
)
@AdminCommand
public class AccountStatusSetCommand extends AbstractCommand {

    @Override
    public void execute(Subject subject) {

    }
}
