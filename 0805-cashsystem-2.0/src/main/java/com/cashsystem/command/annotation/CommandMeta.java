package com.cashsystem.command.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:Light_Long
 * Date:2019-08-04
 * Time:11:45
 */
@Retention(RetentionPolicy.RUNTIME)     //运用反射来获取类的注解
@Target(ElementType.TYPE)   //表示注解运行的范围--类上
public @interface CommandMeta {

    String name();  //DL
    String desc();  //登录
    String group(); //入口命令

}
