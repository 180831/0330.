package com.bit.game;

import java.util.Random;


/**
 * Created with IntelliJ IDEA
 * Description:
 * User:Light_Long
 * Date:2019-04-06
 * Time:14:45
 */
public class Computer {

    private int Sorce;
    private String name;

    public Computer( String name){

        this.name = name;
    }

    public int getSorce() {
        return Sorce;
    }

    public void AddSorce() {
        this.Sorce++;
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
