package com.example.hellospring.workshop01;

public class FizzBuzz {
    private int inp;
    public FizzBuzz(int test_case) {
        this.inp = test_case;
    }

    public String genRes() {
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
