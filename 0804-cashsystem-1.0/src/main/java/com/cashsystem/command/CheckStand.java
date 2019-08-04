package com.cashsystem.command;

import com.cashsystem.command.impl.AbstractCommand;
import com.cashsystem.command.impl.Commands;
import com.cashsystem.command.impl.Subject;
import com.cashsystem.entity.Account;

/**
 * Created with IntelliJ IDEA
 * Description:Main函数方法调用
 * User:Light_Long
 * Date:2019-08-04
 * Time:15:03
 */
public class CheckStand extends AbstractCommand {

    public static void main(String[] args) {
        Subject subject = new Subject();
        new CheckStand().execute(subject);
    }

    @Override
    public void execute(Subject subject) {

        Commands.getCachedHelpCommands().execute(subject);
        while(true) {
            System.out.println(">>>");
            //dl
            String line = scanner.nextLine();
            String commandCode = line.trim().toUpperCase();
            Account account = subject.getAccount();
            if(account == null) {
                Commands.getEntranceCommand(commandCode).execute(subject);

            }else {
                switch (account.getAccountType()) {
                    case ADMIN:
                        Commands.getAdminCommand(commandCode).execute(subject);
                        break;
                    case CUSTOMER:
                        Commands.getCustomerCommand(commandCode).execute(subject);
                        break;
                    default:
                }
            }
        }
    }
}
