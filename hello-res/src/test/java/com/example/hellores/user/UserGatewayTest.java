package com.example.hellores.user;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class UserGatewayTest {
    @Autowired
    private UserGateway usrGtw;
    @Test
    public void testCall(){
        List<UserModel> users = usrGtw.getAllUsers();
        assertEquals(10,users.size());
    }
    @Test
    public void testByUser(){
        UserModel usr = usrGtw.getById(1);
        assertEquals(1,usr.getId());
    }
}