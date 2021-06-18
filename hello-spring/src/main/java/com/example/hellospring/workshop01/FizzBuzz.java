package com.example.hellospring.workshop01;

public class FizzBuzz {
    private int inp;
    public FizzBuzz(int test_case) {
        this.inp = test_case;
    }

    public String genRes() {
        String rtn = String.valueOf(inp);
        if(inp % 3 == 0){
            rtn = "Fizz";
        }
        else if(inp % 5 == 0){
            rtn = "Buzz";
        }
        return rtn;
    }
}
