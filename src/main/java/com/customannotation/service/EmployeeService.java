package com.customannotation.service;

import com.customannotation.entity.Employee;
import com.customannotation.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepo employeeRepo;

    public Employee addNewEmployee(Employee employee) {

        Employee save = employeeRepo.save(employee);

        return save;
    }
}
