package com.example.hellores.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class EmployeeController {
    @Autowired
    private customRandom random;

    @GetMapping("/employee/{id}")
    public EmployeeResponse getEmployeeByID(@PathVariable String  id){
        int _id=0;
        try {
            _id = Integer.parseInt(id);//more thread safe
        }
        catch (NumberFormatException e){
            _id = 0;
        }
        Random random = new Random();
        int num = random.nextInt(10);
        return new EmployeeResponse("Chanawat"+num,"Ton",_id);

    }
    @GetMapping("/employee")
    public EmployeeResponse getEmployeeByID2(@RequestParam String  id) {
        int _id = 0;
        try {
            _id = Integer.parseInt(id);//more thread safe
        } catch (NumberFormatException e) {
            _id = 0;
        }
        return new EmployeeResponse("Chanawat", "Ton", _id);
    }

}