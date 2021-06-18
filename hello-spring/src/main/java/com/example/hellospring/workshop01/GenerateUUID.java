package com.example.hellospring.workshop01;

import java.util.Random;

public class GenerateUUID {
    public String get(String name){
        String id="";
        Random rand = new Random();
        int randNum = rand.nextInt(10);
        id = "XYZ"+name+randNum;
        return id;
    }
}
