package com.example.hellores.employee;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    public EmployeeResponse getEmployeeByID(int id){
        return new EmployeeResPonse(id,"Chanawat","Ton");
    }
}
