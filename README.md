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

There are some work needed on the test cases that will be continued work.
