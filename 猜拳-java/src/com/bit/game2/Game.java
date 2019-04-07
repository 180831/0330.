package com.bit.game2;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:Light_Long
 * Date:2019-04-06
 * Time:18:09
 */
public class Game {
    private Person person;
    private Computer computer;

    public Game(){
        person = new Person("林鑫");
        computer = new Computer("付欣");

    }


    public void playThreeTime() {

        int n = 0 ;

        while (n < 3) {

            String pfist = person.fist();
            String cfist = computer.fist();
            if(pfist.equals("石头") && cfist.equals("剪刀") ||
                    pfist.equals("剪刀") && cfist.equals("布") ||
                    pfist.equals("布") && cfist.equals("石头")){
                System.out.println(person.getName()+"赢了");
                person.addSorce();
                System.out.println(person.getSorce()+" : "+computer.getSorce());

            }
            else if (pfist.equals(cfist)) {

                System.out.println("平局！");
                System.out.println(person.getSorce()+" : "+computer.getSorce());
            }


            else {

                System.out.println(computer.getName()+"赢了");
                computer.addSorce();
                System.out.println(person.getSorce()+" : "+computer.getSorce());
            }
            n++;
        }

    }


    public void getResult() {
        System.out.println("最终比分：");
        if (computer.getSorce() == person.getSorce()) {
            System.out.println(person.getName() + " : "+computer.getName() +
                    " = "+ person.getSorce() + " : "+ computer.getSorce() + "平局！");
        }
        else{
            if(computer.getSorce() > person.getSorce()){

                System.out.println(person.getName() + " : "+computer.getName() +
                        " = "+ person.getSorce() + " : "+ computer.getSorce() +
                        computer.getName() + "赢了！");
            }
            else{
                System.out.println(person.getName() + " : "+computer.getName() +
                        " = "+ person.getSorce() + " : "+ computer.getSorce() +
                        person.getName() + "赢了！");
            }
        }

    }



    public void start(){
        while(true) {
            playThreeTime();
            getResult();

            System.out.println("是否继续？");
            Scanner scanner = new Scanner(System.in);
            String str = scanner.next();
            if (str.equals("是")) {
                continue;
            }else{
                break;
            }
        }

    }
}
