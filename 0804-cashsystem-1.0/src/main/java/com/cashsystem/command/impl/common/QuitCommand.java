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
        name = "TCXT",
        desc = "退出系统",
        group = "公共命令"
)
@AdminCommand
@CustomerCommand
@EntranceCommand
public class QuitCommand extends AbstractCommand {
    @Override
    public void execute(Subject subject) {
        System.out.println("退出系统，欢迎下次使用！");
        this.scanner.close();
        System.exit(0);

    }
}
