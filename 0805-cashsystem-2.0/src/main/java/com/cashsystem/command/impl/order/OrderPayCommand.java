package com.cashsystem.command.impl.order;

import com.cashsystem.command.annotation.CommandMeta;
import com.cashsystem.command.annotation.CustomerCommand;
import com.cashsystem.command.impl.AbstractCommand;
import com.cashsystem.command.impl.Subject;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:Light_Long
 * Date:2019-08-04
 * Time:11:43
 */
@CommandMeta(
        name = "ZFDD",
        desc = "支付订单",
        group = "订单信息"
)
@CustomerCommand
public class OrderPayCommand extends AbstractCommand {
    @Override
    public void execute(Subject subject) {

    }
}
