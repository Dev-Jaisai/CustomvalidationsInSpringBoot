package com.customannotation.controller;

import com.customannotation.entity.Employee;
import com.customannotation.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/emp")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/add")
    public ResponseEntity<Employee> addEmployee(@Valid @RequestBody Employee employee){
        Employee employee1 = employeeService.addNewEmployee(employee);
        return ResponseEntity.ok(employee1);
    }
}
