package com.example.hellores.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.persistence.EntityNotFoundException;
import java.util.Random;

@RestController
public class EmployeeController {
    @Autowired
    private customRandom random;
    @Autowired
    private EmployeeRepository repo;

    @GetMapping("/employee/{id}")
    public EmployeeResponse getEmployeeByID(@PathVariable String  id){
        int _id=0;
        Employee rtnData;
        EmployeeResponse res;
        try {
            _id = Integer.parseInt(id);//more thread safe
        }
        catch (NumberFormatException e){
            res = new EmployeeResponse();
        }
        int num = random.nextInt(10);
        try {
            rtnData = repo.getById(_id);
            res = new EmployeeResponse(rtnData.getFirstName()+num,rtnData.getLastName(),rtnData.getId());
        }
        catch (EntityNotFoundException e){
            res = new EmployeeResponse();
        }
        return res;

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