package com.example.hellores.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Component
public class UserGateway {
    @Autowired
    private RestTemplate restTemplate;

    public List<UserModel> getAllUsers(){
        UserModel[] res = restTemplate.getForObject("https://jsonplaceholder.typicode.com/users",UserModel[].class);
        return Arrays.asList(res);
    }
    public UserModel getById(int id){
        UserModel res = restTemplate.getForObject("https://jsonplaceholder.typicode.com/users/"+id,UserModel.class);
        return res;
    }
}
