package com.cashsystem.command.impl;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:Light_Long
 * Date:2019-08-04
 * Time:11:44
 */
public interface Command {

    Scanner scanner = new Scanner(System.in);

    void execute(Subject subject);

}
