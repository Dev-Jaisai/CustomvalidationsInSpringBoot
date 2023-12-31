package com.customannotation.repo;

import com.customannotation.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee,Long> {

       Employee findByEmail(String email);

}
