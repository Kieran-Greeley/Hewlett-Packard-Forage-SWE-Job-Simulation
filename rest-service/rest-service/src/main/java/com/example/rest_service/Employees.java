package com.example.rest_service;

import java.util.ArrayList;
import java.util.List;

public class Employees {
    private List<Employee> employeeList;

    // Constructor
    public Employees() {
        this.employeeList = new ArrayList<>();
    }

    // Method to get all employees
    public List<Employee> getAllEmployees() {
        return employeeList;
    }

    // Method to add a new employee
    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }
}