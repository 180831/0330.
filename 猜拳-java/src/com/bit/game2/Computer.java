package com.bit.game2;

import sun.plugin.com.event.COMEventHandler;

import java.util.Random;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:Light_Long
 * Date:2019-04-06
 * Time:18:08
 */
public class Computer {
    private int sorce;
    private String name;

    public Computer(String name){
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

        Random random = new Random();
        int n = random.nextInt(3)+1;  //[1,3]  [0,3)-->[1,3]
        String str = null;
        switch(n){
            case 1:
                System.out.println(name+"出石头");
                str = "石头";
                break;
            case 2:
                System.out.println(name+"出剪刀");
                str = "剪刀";
                break;
            case 3:
                System.out.println(name+"出布");
                str = "布";
                break;
        }
        return str;
    }


}
