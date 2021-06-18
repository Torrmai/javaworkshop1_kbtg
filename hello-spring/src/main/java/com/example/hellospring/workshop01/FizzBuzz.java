package com.example.hellospring.workshop01;

public class FizzBuzz {
    private int inp;
    public FizzBuzz(int test_case) {
        this.inp = test_case;
    }

    public String genRes() {
        genFizz divis3 = new genFizz();
        genBuzz divis5 = new genBuzz();
        String rtn = "";
        if(inp % 3 == 0){
            rtn += "Fizz";
        }
        if(inp % 5 == 0){
            rtn += "Buzz";
        }
        if("".equals(rtn)){
            rtn += String.valueOf(inp);
        }
        return rtn;
    }
}
class genBuzz{
    public String isMod5(int inp){
        if(inp%5 == 0){
            return "Buzz";
        }
        else return "";
    }
}
class genFizz{
    public String isMod3(int inp){
        if(inp%3 == 0){
            return "Fizz";
        }
        else return "";
    }
}
class Check15{
    public String isMod15(int inp){
        if(inp%15 == 0){
            return "FizzBuzz";
        }
        else return "";
    }
}