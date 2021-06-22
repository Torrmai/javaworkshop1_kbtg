package com.example.hellores.users;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest(webEnvironment  = SpringBootTest.WebEnvironment.RANDOM_PORT)
class UsersControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;
    @Test
    public void getValidUsersTest(){
        UsersResponse expect = new UsersResponse("xxx","xxx","xxx",1,"xxx","a");
        UsersResponse res = restTemplate.getForObject("/users/1",UsersResponse.class);
        assertEquals(expect,res);
    }
    @Test
    public void getInvalidUsersTest(){
        UsersResponse expect = new  UsersResponse();
        UsersResponse res = restTemplate.getForObject("/users/abcd",UsersResponse.class);
        assertEquals(expect,res);
    }
    @Test
    public void getOutOfRangeUsersTest(){
        UsersResponse expect = new  UsersResponse();
        UsersResponse res = restTemplate.getForObject("/users/999999999",UsersResponse.class);
        assertEquals(expect,res);
    }
    @Test
    public void getOutOfRangeUsersTest02(){
        UsersResponse expect = new  UsersResponse();
        UsersResponse res = restTemplate.getForObject("/users/-1",UsersResponse.class);
        assertEquals(expect,res);
    }
    @Test
    public void postNullTest(){
        UsersRequest test = new UsersRequest();
        UsersResponse expect = new UsersResponse();
        UsersResponse res = restTemplate.postForObject("/users",test,UsersResponse.class);
        assertEquals(new UsersResponse(),res);
    }
    @Test
    public void postNotNullTest(){
        UsersRequest test = new UsersRequest("aaa","bbb","ccc","ddd","eee");
        UsersResponse expect = new UsersResponse("aaa","bbb","ccc",3,"ddd","eee");
        UsersResponse res = restTemplate.postForObject("/users",test,UsersResponse.class);
        assertEquals(expect,res);
    }
}