package com.example.employee.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.employee.domain.Employee;
import com.example.employee.service.EmployeeService;
import org.springframework.web.server.ResponseStatusException;


@RestController
public class EmployeeController {

    @Autowired
    private  EmployeeService employeeService;

    @GetMapping("/")
    public String home() {
      return "Hello Employee";
    }

    @GetMapping("/employees")
  public Iterable<Employee> findAllEmployees() {
    return this.employeeService.findAllEmployees();
  }

  @RequestMapping(value="/employees/{id}" , method=RequestMethod.GET)
  @ResponseBody
  
  public Employee findEmployee(@PathVariable Integer id) {
    return this.employeeService.findEmployee(id).orElseThrow(
      () -> new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found with id " + id));
    //  return employee;
  }

  @PostMapping("/employees")
  public Employee addOneEmployee(@RequestBody Employee employee) {
    //System.out.println("here");
    return this.employeeService.addOneEmployee(employee);
  }

  @PutMapping("/employees/{id}")
  public Employee updateOneEmployee(@PathVariable Integer id, @RequestBody Employee employee) {
    return this.employeeService.updateOneEmployee(id, employee);
  }

  @DeleteMapping("/employees/{id}")
  public void deleteOneEmployee(@PathVariable Integer id) {
     this.employeeService.deleteOneEmployee(id);
  }

  @ExceptionHandler(RuntimeException.class)
  public final ResponseEntity<Exception> handleAllExceptions(RuntimeException ex) {
      return new ResponseEntity<Exception>(ex, HttpStatus.INTERNAL_SERVER_ERROR);
  }


}
