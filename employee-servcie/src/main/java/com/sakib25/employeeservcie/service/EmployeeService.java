package com.sakib25.employeeservcie.service;

import com.sakib25.employeeservcie.entity.Employee;
import com.sakib25.employeeservcie.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee findEmployeeById(String userId) {
        return employeeRepository.findEmployeeById(userId);
    }
}
