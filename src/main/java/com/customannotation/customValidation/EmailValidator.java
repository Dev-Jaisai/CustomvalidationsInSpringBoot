package com.customannotation.customValidation;

import com.customannotation.entity.Employee;
import com.customannotation.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EmailValidator implements ConstraintValidator<UniqEmail,String> {

    @Autowired
    EmployeeRepo employeeRepo;
    @Override
    public boolean isValid(String email, ConstraintValidatorContext constraintValidatorContext) {
        Employee employeeEmail = employeeRepo.findByEmail(email);

        return employeeEmail==null;
    }
}
