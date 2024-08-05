package com.example.rest_service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EmployeeManagerTest {

    private EmployeeManager employeeManager;

    @BeforeEach
    public void setUp() {
        employeeManager = new EmployeeManager();
    }

    @Test
    public void testAddEmployee() {
        Employee employee = new Employee("521", "John", "Doe", "john.doe@example.com", "Developer");

        employeeManager.getEmployees().addEmployee(employee);

        Employees employees = employeeManager.getEmployees();
        List<Employee> employeeList = employees.getAllEmployees();

        // Verify the employee was added successfully
        assertEquals(5, employeeList.size()); // Assuming there were initially 4 hard-coded employees
        assertTrue(employeeList.contains(employee));
    }
}
