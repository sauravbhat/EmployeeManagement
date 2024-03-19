package com.example.employee.service;

import java.util.Optional;

import com.example.employee.domain.Employee;

public interface EmployeeService {

public Iterable<Employee> findAllEmployees() ;


  public Optional<Employee> findEmployee( Integer id) ;


  public Employee addOneEmployee( Employee employee) ;


  public Employee updateOneEmployee(Integer id,  Employee employee) ;


  public void deleteOneEmployee(Integer id) ;



}
