package com.example.hellores.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class UsersController {
   //@Autowired
    private List<UsersResponse> data = Arrays.asList(new UsersResponse("xxx","xxx","xxx",1,"xxx","a"));

    @GetMapping("/users")
    public List<UsersResponse> getAllUsers(){
        return data;
    }
}
