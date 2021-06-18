package com.example.hellospring.workshop01;

import java.util.Random;

public class GenerateUUID extends testToogle {
    @Override
    public int getRandNum() {
        if (this.isTest){
            return rtn;
        }
       else {
           Random rand = new Random();
           rtn = rand.nextInt(10);
           return rtn ;
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
    protected static int rtn = 0;
    abstract int getRandNum();
    public static void toogle_test(int placeHolder){
        isTest = true;
        rtn = placeHolder;
    }
}
