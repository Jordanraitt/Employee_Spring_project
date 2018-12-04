package com.example.EmployeeTrackingApp.controllers;

import com.example.EmployeeTrackingApp.models.Employee;
import com.example.EmployeeTrackingApp.repos.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping( name = "allEmployees")
    public List<Employee> allEmployees() {
        return employeeRepository.findAll();
    }

    @GetMapping( value = "{id}")
    public Optional<Employee> getEmployeeId(@PathVariable Long id) {
        return employeeRepository.findById(id);
    }

}
