package com.example.hellospring.workshop01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    @Test
    public void nonDivisibleBoth(){
        int test_case = 7;
        FizzBuzz test1 =new FizzBuzz(test_case);
        String res = test1.genRes();
        assertEquals(String.valueOf(test_case),res);
    }
    @Test
    public void nonDivisible5(){
        int test_case = 99;
        FizzBuzz test1 =new FizzBuzz(test_case);
        String res = test1.genRes();
        assertEquals("Fizz",res);
    }
    @Test
    public void nonDivisible3(){
        int test_case = 20;
        FizzBuzz test1 = new FizzBuzz(test_case);
        String res = test1.genRes();
        assertEquals("Buzz",res);
    }
    @Test
    public void Divisible15(){
        int test_case = 15;
        FizzBuzz test1 = new FizzBuzz(test_case);
        String res = test1.genRes();
        assertEquals("FizzBuzz",res);
    }
}