package com.example.rest_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.rest_service.Employee;
import com.example.rest_service.EmployeeManager;


@RestController
@RequestMapping("/employees")

public class EmployeeController {
    @Autowired
    private final EmployeeManager employeeManager;

    public EmployeeController(EmployeeManager employeeManager) {
        this.employeeManager = employeeManager;
    }

    // GET all employees
    @GetMapping
    public Employees getAllEmployees() {
        return employeeManager.getEmployees();
    }

    // POST new employee
    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee) {
        employeeManager.getEmployees().addEmployee(employee);
        return employee;
    }
}
