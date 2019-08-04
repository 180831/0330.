package com.cashsystem.command.impl.account;

import com.cashsystem.command.annotation.AdminCommand;
import com.cashsystem.command.annotation.CommandMeta;
import com.cashsystem.command.impl.AbstractCommand;
import com.cashsystem.command.impl.Subject;
import com.sun.org.glassfish.external.statistics.impl.AverageRangeStatisticImpl;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:Light_Long
 * Date:2019-08-04
 * Time:11:39
 */
@CommandMeta(
        name = "CKZH",
        desc = "查看账户",
        group = "账号信息"
)
@AdminCommand
public class AccountBrowsCommand extends AbstractCommand {

    @Override
    public void execute(Subject subject) {
        System.out.println("查看账户");
    }
}
