package com.example.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.employee.service.*;



@SpringBootApplication
@EnableJpaRepositories(basePackages = { "com.example.employee" })
public class EmployeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeApplication.class, args);
		
	}

	@Bean
	public EmployeeService getEmployeeService(){
		return new EmployeeServiceImpl();
	}
}
