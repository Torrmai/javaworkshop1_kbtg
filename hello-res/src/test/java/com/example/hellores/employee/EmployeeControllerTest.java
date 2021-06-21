package com.example.hellores.employee;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class EmployeeControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;
    @Test
    public void callApiWithPathVariable(){
        EmployeeResponse res = restTemplate.getForObject("/employee/123",EmployeeResponse.class);
        assertEquals("Chanawat",res.getFname());
        assertEquals("Ton",res.getLname());
        assertEquals(123,res.getId());
    }
    @Test
    public void callApiWithParam(){
        EmployeeResponse exp = new EmployeeResponse("Chanawat","Ton",69);
        EmployeeResponse res = restTemplate.getForObject("/employee?id=69",EmployeeResponse.class);
        assertEquals("Chanawat",res.getFname());
        assertEquals("Ton",res.getLname());
        assertEquals(69,res.getId());
        assertEquals(exp,res);
    }
}