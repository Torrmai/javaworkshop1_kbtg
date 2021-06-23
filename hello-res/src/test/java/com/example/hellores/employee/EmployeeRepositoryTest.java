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
    @Autowired
    private EmployeeRepository repo;

    @Test
    public  void foundWithID1(){
        Employee data = new Employee(1,"Test","Test");
        repo.save(data);
        Employee employee = repo.getById(1);
        assertEquals(1,employee.getId());
        assertEquals("Test",employee.getFirstName());
        assertEquals("Test",employee.getLastName());
    }
}