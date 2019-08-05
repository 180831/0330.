package com.cashsystem.command.impl.common;

import com.cashsystem.command.annotation.AdminCommand;
import com.cashsystem.command.annotation.CommandMeta;
import com.cashsystem.command.annotation.CustomerCommand;
import com.cashsystem.command.annotation.EntranceCommand;
import com.cashsystem.command.impl.AbstractCommand;
import com.cashsystem.command.impl.Subject;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:Light_Long
 * Date:2019-08-04
 * Time:11:41
 */

@CommandMeta(
        name = "GYXT",
        desc = "关于系统",
        group = "公共命令"
)
@AdminCommand
@CustomerCommand
@EntranceCommand
public class AboutCommand extends AbstractCommand {
    @Override
    public void execute(Subject subject) {
        System.out.println("****************************");
        System.out.println("*****基于字符界面的收银台系统***");
        System.out.println("*****作者：林鑫***************");
        System.out.println("*****时间：2019-08-04********");
        System.out.println("****************************");
    }
}
