package com.example.hellores.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @PostMapping("/employee")
    public EmployeeResponse createNewEmployee(@RequestBody EmployeeRequest request){
        return new EmployeeResponse(request.getFname(), request.getLname(), 999);
    }

}