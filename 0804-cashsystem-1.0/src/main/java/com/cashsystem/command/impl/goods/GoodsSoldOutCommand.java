package com.cashsystem.command.impl.goods;

import com.cashsystem.command.annotation.AdminCommand;
import com.cashsystem.command.annotation.CommandMeta;
import com.cashsystem.command.impl.AbstractCommand;
import com.cashsystem.command.impl.Subject;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:Light_Long
 * Date:2019-08-04
 * Time:11:42
 */
@CommandMeta(
        name = "SJSP",
        desc = "下架商品",
        group = "商品信息"
)
@AdminCommand
public class GoodsSoldOutCommand extends AbstractCommand {
    @Override
    public void execute(Subject subject) {

    }
}
