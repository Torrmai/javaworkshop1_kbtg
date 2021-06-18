package com.example.hellospring.workshop01;

public class FizzBuzz {
    private int inp;
    public FizzBuzz(int test_case) {
        this.inp = test_case;
    }

    public String genRes() {
        String rtn = "";
        rtn = genFizz.isMod3(inp) + genBuzz.isMod5(inp) + genKbtg.is7(inp);
        if("".equals(rtn)){
            rtn += String.valueOf(inp);
        }
        return rtn;
    }
}
class genBuzz{
    public static String isMod5(int inp){
        if(inp%5 == 0){
            return "Buzz";
        }
        else return "";
    }
}
class genFizz{
    public static String isMod3(int inp){
        if(inp%3 == 0){
            return "Fizz";
        }
        else return "";
    }
}
class genKbtg{
    public static String is7(int inp){
        if(inp == 7){
            return "KBTG basic java";
        }
        else return "";
    }
}