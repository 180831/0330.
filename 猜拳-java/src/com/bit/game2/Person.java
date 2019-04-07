package com.bit.game2;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:Light_Long
 * Date:2019-04-06
 * Time:18:08
 */

public class Person {

    private int sorce;
    private String name;

    public Person(String name){
        this.name = name;
    }

    public int getSorce() {
        return sorce;
    }

    public void addSorce() {
        this.sorce++;
    }

    public String getName() {
        return name;
    }

    public String fist(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入出的招数：石头，剪刀，布");
        String str = scanner.nextLine();
        return str;
    }

}
