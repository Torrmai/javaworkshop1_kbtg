package com.example.hellospring.workshop01;

import java.util.Random;

public class GenerateUUID extends testToogle {
    @Override
    public int getRandNum() {
        if (this.isTest){
            return 7;
        }
       else {
           Random rand = new Random();
           int randInt = rand.nextInt(10);
           return randInt;
        }
    }

    public String get(String name){
        String id="";
        Random rand = new Random();
        int randNum = getRandNum();
        id = "XYZ"+name+randNum;
        return id;
    }
}
abstract class testToogle{
    protected static boolean isTest = false;
    abstract int getRandNum();
    public static void toogle_test(){
        isTest = true;
    }
}
