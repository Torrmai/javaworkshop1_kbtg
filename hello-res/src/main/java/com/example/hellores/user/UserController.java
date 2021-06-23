package com.example.hellores.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserGateway userGateway;
    @GetMapping("/user")
    public List<UserModel> getAllUser(){
        List<UserModel> getFrom = userGateway.getAllUsers();
        List<UserModel> rtn = new ArrayList<>();
        for (UserModel i :getFrom) {
            if(i.getId()%2 == 0){
                rtn.add(i);
            }
        }
        return rtn;
    }
}
