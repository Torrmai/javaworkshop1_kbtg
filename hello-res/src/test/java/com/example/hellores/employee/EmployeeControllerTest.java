package com.example.hellores.employee;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class EmployeeControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;
    @Autowired
    private EmployeeRepository repo;
    @MockBean
    private customRandom random;


    @Test
    public void callApiWithPathVariableAndDatabase(){
        when(random.nextInt(anyInt())).thenReturn(5);
        repo.save(new Employee("Chanawat","Ton"));
        EmployeeResponse res = restTemplate.getForObject("/employee/1",EmployeeResponse.class);
        assertEquals("Chanawat5",res.getFname());
        assertEquals("Ton",res.getLname());
        assertEquals(1,res.getId());
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
    @Test
    public void testPostApi(){
        EmployeeResponse exp = new EmployeeResponse("Test","Ja",999);
        EmployeeRequest test = new EmployeeRequest("Test","Ja");
        EmployeeResponse res = restTemplate.postForObject("/employee",test,EmployeeResponse.class);
        assertEquals("Test",res.getFname());
        assertEquals("Ja",res.getLname());
        assertEquals(999,res.getId());
        assertEquals(exp,res);
    }
}