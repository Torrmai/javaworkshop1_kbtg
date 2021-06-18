package com.example.hellospring;

public class DemoOOP {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();

        if (employee1.equals(employee2)){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not equal");
        }
        //System.out.println(employee.toString());
    }
}
