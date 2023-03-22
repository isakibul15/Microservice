package com.sakib25.employeeservcie.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sakib25.employeeservcie.entity.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String> {
    Employee findEmployeeById(String userId);
}
