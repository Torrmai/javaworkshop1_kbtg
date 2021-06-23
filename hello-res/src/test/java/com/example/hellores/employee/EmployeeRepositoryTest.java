package com.example.hellores.employee;

import javafx.beans.binding.When;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@DataJpaTest
public class EmployeeRepositoryTest {
    @MockBean
    private EmployeeRepository repo;

    @Test
    public  void foundWithID1(){
        when(repo.getById(1)).thenReturn(new Employee("Test","Test"));
        Employee employee = repo.getById(1);
        assertEquals(0,employee.getId());
        assertEquals("Test",employee.getFirstName());
        assertEquals("Test",employee.getLastName());
    }
}