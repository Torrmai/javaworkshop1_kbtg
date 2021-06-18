package com.example.hellospring.workshop01;

public class FizzBuzz {
    private int inp;
    public FizzBuzz(int test_case) {
        this.inp = test_case;
    }

    public String genRes() {
        return String.valueOf(inp);
    }
}
