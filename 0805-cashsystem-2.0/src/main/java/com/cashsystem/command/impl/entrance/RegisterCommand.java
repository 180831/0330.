package com.cashsystem.command.impl.entrance;

import com.cashsystem.command.annotation.CommandMeta;
import com.cashsystem.command.annotation.EntranceCommand;
import com.cashsystem.command.impl.AbstractCommand;
import com.cashsystem.command.impl.Subject;
import com.cashsystem.common.AccountStatus;
import com.cashsystem.common.AccountType;
import com.cashsystem.entity.Account;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:Light_Long
 * Date:2019-08-04
 * Time:11:41
 */
@CommandMeta(
        name = "ZC",
        desc = "注册",
        group = "入口命令"
)
@EntranceCommand
public class RegisterCommand extends AbstractCommand {
    @Override
    public void execute(Subject subject) {
        Account account = subject.getAccount();
        if(account != null) {
            System.out.println("您已经注册过了");
        }
        System.out.println("输入用户名：");
        String username = scanner.nextLine();
        System.out.println("输入密码：");
        String password = scanner.nextLine();
        System.out.println("输入真实姓名：");
        String name = scanner.nextLine();
        System.out.println("输入用户类型(1.管理员 2.用户)：");
        int type = scanner.nextInt();
        this.accountService.Register(username,password,name,type);

        /*if(account != null &&
                account.getAccountType() == AccountType.CUSTOMER) {
            System.out.println(account.getAccountType() + "注册成功");
            subject.setAccount(account);
        }else {
            System.out.println("注册失败");
        }*/
    }
}
