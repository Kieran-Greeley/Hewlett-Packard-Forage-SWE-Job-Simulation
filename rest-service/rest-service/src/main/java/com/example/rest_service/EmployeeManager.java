package com.example.rest_service;

public class EmployeeManager {
    private Employees employees;

    // Constructor
    public EmployeeManager() {
        this.employees = new Employees();

        // Hard-coded example employees
        Employee emp1 = new Employee("001", "Kieran", "Greeley", "kieran.greeley@gmail.com", "Software Engineer");
        Employee emp2 = new Employee("002", "Jane", "Smith", "jane.smith@gmail.com", "Product Manager");
        Employee emp3 = new Employee("003", "Michael", "Scott", "michael.scott@gmail.com", "Regional Manager");
        Employee emp4 = new Employee("007", "James", "Bond", "james.bond@gov.uk", "Spy");

        employees.addEmployee(emp1);
        employees.addEmployee(emp2);
        employees.addEmployee(emp3);
        employees.addEmployee(emp4);
    }

    // Getter method for Employees instance
    public Employees getEmployees() {
        return employees;
    }
}
