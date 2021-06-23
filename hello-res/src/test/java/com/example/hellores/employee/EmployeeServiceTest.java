package com.example.hellores.employee;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.mock.mockito.MockBean;

import javax.persistence.EntityNotFoundException;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
public class EmployeeServiceTest {
    @Mock
    private Random random;
    @Mock
    private EmployeeRepository repo;
    @Test
    public void foundEmployeeID1(){
        when(random.nextInt(10)).thenReturn(10);
        Employee mock = new Employee(1,"Test","Test2");
        when(repo.getById(1)).thenReturn(mock);
        EmployeeService empSer =new EmployeeService();
        empSer.setRand(random);
        empSer.setRepo(repo);
        EmployeeResponse res = empSer.getID(1);
        assertEquals(1,res.getId());
        assertEquals("Test10",res.getFname());
        assertEquals("Test2",res.getLname());
    }
    @Test
    public void employee100NotFound() {
        when(repo.getById(100)).thenThrow(EntityNotFoundException.class);
        EmployeeService service = new EmployeeService();
        service.setRepo(repo);
        service.setRand(random);
        EmployeeResponse result = service.getID(100);
        assertEquals(0, result.getId());
        assertNull(result.getFname());
        assertNull(result.getLname());
    }
}