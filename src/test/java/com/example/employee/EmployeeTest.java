package com.example.employee;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

import com.example.employee.controller.EmployeeController;
import com.example.employee.domain.Employee;
import com.example.employee.service. EmployeeService;
import com.example.employee.service.EmployeeServiceImpl;
import com.example.employee.repository.EmployeeRepository;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class EmployeeTest {

    @Mock
    EmployeeRepository employeeRepository;

     @Mock
     public EmployeeService employeeService;

    @InjectMocks
    private EmployeeController controller = new EmployeeController();

   @LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate restTemplate;

    @BeforeEach
    void setOutput() {
        //repository.save(new Employee("as","ve",null,"as","as","as","as","as",null,"as"));
        
        System.out.println("initiating test");
    }

    @Test
	void contextLoads() throws Exception {
		assertTrue(employeeRepository!=null);
        assertTrue(employeeService!=null);
        assertTrue(controller!=null);
        
	}

    @DisplayName("test the home url with a rest call")
    @Test
	void greetingShouldReturnDefaultMessage() throws Exception {
		assertTrue(this.restTemplate.getForObject("http://localhost:" + port + "/",
				String.class).equals("Hello Employee"));

	}

    @DisplayName("test mock controller and repository")
    @Test
    void testAll() {
        Employee e = new Employee("as","ve",null,"as","as","as","as","as",null,"as");
        Employee e2 = controller.addOneEmployee(e);
        //System.out.println(e2.getDepartment());
        Iterable<Employee> emplist = controller.findAllEmployees();

        System.out.println(emplist.iterator());
        //assertTrue(emplist.iterator().hasNext());
        //Employee e1 = emplist.iterator().next();
        //assertEquals(e.getFirstName(), e1.getFirstName() );
    }

}
