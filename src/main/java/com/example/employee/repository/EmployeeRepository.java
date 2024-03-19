package com.example.employee.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.employee.domain.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
  
}
