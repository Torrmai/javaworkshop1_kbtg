package com.example.hellores.employee;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @GetMapping("/employee/{id}")
    public EmployeeResponse getEmployeeByID(@PathVariable String  id){
        int _id=0;
        try {
            _id = Integer.valueOf(id);
        }
        catch (Exception e){
            _id = 0;
        }
        return new EmployeeResponse("Chanwat","Ton",_id);

    }
}
