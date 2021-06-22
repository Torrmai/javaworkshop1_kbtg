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
}