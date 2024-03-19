
 Employee Management System
====================================================

Summary: Design and implement an Employee management RESTful microservice using Java, Spring Boot, Maven, JPA, and an in-memory DB (h2[]) or preferred RDBMS[postgresql] using all appropriate exception handling.  Ensure to properly test your codebase leveraging jUnit.  For simplicity of implementation, the endpoint can be publicly invoked.  Security protection Is plus.

Requested Operations: 
1. Retrieve all Employees - (“/employees”) - 
2. Get details of specific Employees -(“/employees/{id}”) - 
3. Delete an Employee - (“/employees/{id}”) - 
4. Create a new Employee - (“/employees”) - 
5. Update Employee details - (“/employees/{id}”) 


Employee Entity: 

FIRSTNAME 

LASTNAME 
EMAILADDRESS 
PHONE 
BIRTHDATE 
JOB-TITLE 
DEPARTMENT 
LOCATION 
STARTDATE 
EMPLOYEEID 
MANAGER-REPORTING 
 

The source code has been uploaded in github. there are five endpoints and they can be tested with the following curl command below.


POST - 

curl --location 'http://localhost:8080/employees' \
--header 'Content-Type: application/json' \
--header 'Accept: application/json' \
--data-raw '{
        "firstName": "Saurav",
        "lastName": "bhatta",
        "emailAddress": "sb@gmail.com",
        "phone": "1234567890",
        "dateOfBirth": "01/01/1990",
        "jobTitle": "manager",
        "department": "identity",
        "location": "ashburn",
        "startDate": "01/01/2020",
        "managerReporting": "Mr manager"
}'

Get all - 

curl --location 'http://localhost:8080/employees'

Get one - 

curl --location 'http://localhost:8080/employees/52'

Put - 

curl --location --request PUT 'http://localhost:8080/employees/52' \
--header 'Content-Type: application/json' \
--header 'Accept: application/json' \
--data-raw '{
        "firstName": "Saurav",
        "lastName": "thisischanged",
        "emailAddress": "sb@gmail.com",
        "phone": "1234567890",
        "dateOfBirth": "01/01/1990",
        "jobTitle": "manager",
        "department": "identity",
        "location": "ashburn",
        "startDate": "01/01/2020",
        "managerReporting": "Mr manager"
}'

Delete - 

curl --location --request DELETE 'http://localhost:8080/employees/2'

The swagger specification document is inside src/resources folder.

Some basic test cases been developed to check non null and the root url functioning properly. 
