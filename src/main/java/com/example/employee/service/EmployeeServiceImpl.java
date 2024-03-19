package com.example.employee.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;


import com.example.employee.domain.Employee;
import com.example.employee.repository.EmployeeRepository;

public class EmployeeServiceImpl implements EmployeeService {

     @Autowired
    private  EmployeeRepository employeeRepository;

    public Iterable<Employee> findAllEmployees() {
    return this.employeeRepository.findAll();
  }


  public Optional<Employee> findEmployee( Integer id) {
    return this.employeeRepository.findById(id);
  }


  public Employee addOneEmployee( Employee employee) {
    //System.out.println("here");
    return this.employeeRepository.save(employee);
  }


  public Employee updateOneEmployee( Integer id,  Employee employee) {
    employee.setId(id);
    return this.employeeRepository.save(employee);
  }

  public void deleteOneEmployee( Integer id) {
     this.employeeRepository.deleteById(id);
  }


}
