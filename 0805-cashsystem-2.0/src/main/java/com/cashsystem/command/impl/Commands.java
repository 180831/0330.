package com.cashsystem.command.impl;

import com.cashsystem.command.annotation.AdminCommand;
import com.cashsystem.command.annotation.CommandMeta;
import com.cashsystem.command.annotation.CustomerCommand;
import com.cashsystem.command.annotation.EntranceCommand;
import com.cashsystem.command.impl.account.AccountBrowsCommand;
import com.cashsystem.command.impl.account.AccountPasswordCommand;
import com.cashsystem.command.impl.account.AccountStatusSetCommand;
import com.cashsystem.command.impl.common.AboutCommand;
import com.cashsystem.command.impl.common.HelpCommand;
import com.cashsystem.command.impl.common.QuitCommand;
import com.cashsystem.command.impl.entrance.LoginCommand;
import com.cashsystem.command.impl.entrance.RegisterCommand;
import com.cashsystem.command.impl.goods.GoodsBrowseCommand;
import com.cashsystem.command.impl.goods.GoodsPutAwayCommand;
import com.cashsystem.command.impl.goods.GoodsSoldOutCommand;
import com.cashsystem.command.impl.goods.GoodsUpdateCommand;
import com.cashsystem.command.impl.order.OrderBrowseCommand;
import com.cashsystem.command.impl.order.OrderPayCommand;

import java.util.*;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:Light_Long
 * Date:2019-08-04
 * Time:11:43
 */
public class Commands {

    public static final Map<String,Command> ADMIN_COMMANDS = new HashMap<>();
    public static final Map<String,Command> CUSTOMER_COMMANDS = new HashMap<>();
    public static final Map<String,Command> ENTRANCE_COMMANDS = new HashMap<>();

    //存放所有的命令的set
    private static final Set<Command> COMMANDS = new HashSet<>();
    private static final Command CACHED_HELP_COMMANDS;

    static {

        Collections.addAll(COMMANDS,
                new AccountBrowsCommand(),
                new AccountPasswordCommand(),
                new AccountStatusSetCommand(),
                new AboutCommand(),

                CACHED_HELP_COMMANDS = new HelpCommand(),
                new QuitCommand(),
                new LoginCommand(),
                new RegisterCommand(),
                new GoodsBrowseCommand(),
                new GoodsPutAwayCommand(),
                new GoodsSoldOutCommand(),
                new GoodsUpdateCommand(),
                new OrderBrowseCommand(),
                new OrderPayCommand());

        for(Command command : COMMANDS) {
            //利用反射来获取 将命令进行分类到不同的Map
            Class<?> cls = command.getClass();

            AdminCommand adminCommand = cls.getDeclaredAnnotation(AdminCommand.class);
            CustomerCommand customerCommand = cls.getDeclaredAnnotation(CustomerCommand.class);
            EntranceCommand entranceCommand = cls.getDeclaredAnnotation(EntranceCommand.class);
            CommandMeta commandMeta = cls.getDeclaredAnnotation(CommandMeta.class);

            if(commandMeta == null) {
                continue;
            }
            String commandKey = commandMeta.name();
            if(adminCommand != null) {
                ADMIN_COMMANDS.put(commandKey,command);
            }
            if(customerCommand != null) {
                CUSTOMER_COMMANDS.put(commandKey,command);
            }
            if(entranceCommand != null) {
                ENTRANCE_COMMANDS.put(commandKey,command);
            }
        }

    }

    //得到缓存的命令
    public static Command getCachedHelpCommands() {
        return CACHED_HELP_COMMANDS;
    }

    public static Command getAdminCommand(String commandKey) {
        return getCommand(commandKey,ADMIN_COMMANDS);
    }
    public static Command getCustomerCommand(String commandKey) {
        return getCommand(commandKey,CUSTOMER_COMMANDS);
    }
    public static Command getEntranceCommand(String commandKey) {
        return getCommand(commandKey,ENTRANCE_COMMANDS);
    }
    public static Command getCommand(String commandKey,
                              Map<String,Command> commandMap) {
        //遍历相应的Map,根据commandKey,得到相应的value值。
        return commandMap.getOrDefault(commandKey,CACHED_HELP_COMMANDS);
    }
}
