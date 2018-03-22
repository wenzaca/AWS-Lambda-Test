# Lambda Example Test

This project is a test for using Lambda from AWS

## AWS Lambda - How TO
### Create Function 
1. Select Author from scratch
2. Insert Name to the function, in this case I have used "myFunctionTest" as the name, so if this were changed the user must change it in the class ValidateCPF class
3. Select Runtime as Java 8 
4. Select an existent or create a new role

### Function Code
You can insert a Java code into the S3 or upload a Zip o Jar file in the Lambda Management

### Test
After that the user should write it CPF (Brazilian document) and it name as the Json below
```
   {
     "firstName": "Lucas"
     "secondName": "Silva"
     "cpf": "92071312007"
   }
```
This Json can be used as a test example, in the Drop Down box ("Select a test example...").
After that there will be a validation in the inserted CPF and if it exist a message will be returned to the user.
