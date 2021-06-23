package com.example.hellores.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
public class EmployeeService {
    @Autowired
    private customRandom random;
    @Autowired
    private EmployeeRepository repo;

    public EmployeeResponse getID(int id) {
        Employee rtnData;
        EmployeeResponse res;
        int num = random.nextInt(10);
        try {
            rtnData = repo.getById(id);
            res = new EmployeeResponse(rtnData.getFirstName()+num,rtnData.getLastName(),rtnData.getId());
        }
        catch (EntityNotFoundException e){
            res = new EmployeeResponse();
        }
        return res;
    }
}
