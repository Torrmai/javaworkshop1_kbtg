package com.example.hellores.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class UsersController {
   //@Autowired
    private List<UsersResponse> data = Arrays.asList(new UsersResponse("xxx","xxx","xxx",1,"xxx","a")
                                                            ,new UsersResponse("yyy","yyy","yyy",2,"xxx","b"));
    private int currId = data.size();

    @GetMapping("/users")
    public List<UsersResponse> getAllUsers(){
        return data;
    }
    @GetMapping("/users/{id}")
    public UsersResponse getUsersByID(@PathVariable String id){
        int _id = 0;
        UsersResponse tmp;
        try{
            _id = Integer.parseInt(id);
            tmp = data.get(_id-1);
        }
        catch (NumberFormatException e){
            tmp = new UsersResponse();
        }
        catch (IndexOutOfBoundsException e){
            tmp = new UsersResponse();
        }
        return tmp;
    }
    private boolean checkNull(UsersResponse req){
        return req.getWebsite().isEmpty() || req.getPhone().isEmpty() || req.getName().isEmpty()
                || req.getEmail().isEmpty() || req.getEmail().isEmpty();
    }
    @PostMapping("/users")
    public UsersResponse postUserID(@RequestBody UsersResponse req){
        if(checkNull(req)){
            return new UsersResponse();
        }
        UsersResponse tmp = new UsersResponse(req.getWebsite(), req.getPhone(),req.getName(),currId+1, req.getEmail(), req.getUsername());
        try{
            this.data.add(new UsersResponse(req.getWebsite(), req.getPhone(),req.getName(),currId+1, req.getEmail(), req.getUsername()));
            return data.get(data.size() -1);
        }
        catch (Exception e){
            System.out.println(data.size());
        }
        return tmp;
    }
}
