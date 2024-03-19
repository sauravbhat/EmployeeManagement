package com.example.employee.domain;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {
 @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;
  
  private String firstName;
  private String lastName;
  
  @JsonFormat(pattern = "MM/dd/yyyy")
  private LocalDate dateOfBirth;

    private String  emailAddress;
    private String phone;
    private String jobTitle;
    private String department;
    private String location;

    @JsonFormat(pattern = "MM/dd/yyyy")
    private LocalDate startDate;

    private String managerReporting;

      // Hibernate expects entities to have a no-arg constructor,
  // though it does not necessarily have to be public.
  private Employee() {}
  
  public Employee(String firstName, String lastName, LocalDate dateOfBirth,
  String  emailAddress, String phone, String jobTitle,
  String department, String location, LocalDate startDate,
  String managerReporting) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.dateOfBirth = dateOfBirth;
    this.emailAddress=emailAddress;
    this.phone = phone;
    this.jobTitle = jobTitle;
    this.department = department;
    this.location = location;
    this.startDate = startDate;
    this.managerReporting = managerReporting;
  }

  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id=id;
  }
  
  public String getFirstName() {
    return this.firstName;
  }
  public String getLastName() {
    return this.lastName;
  }

  public LocalDate getDateOfBirth() {
    return this.dateOfBirth;
  }

    public String getEmailAddress() {
      return emailAddress;
    }

    public String getPhone() {
      return phone;
    }

    public String getJobTitle() {
      return jobTitle;
    }

    public String getDepartment() {
      return department;
    }

    public String getLocation() {
      return location;
    }

    public LocalDate getStartDate() {
      return startDate;
    }

    public String getManagerReporting() {
      return managerReporting;
    }



}
