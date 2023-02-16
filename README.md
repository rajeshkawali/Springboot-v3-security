# Springboot-v3-security
Springboot and Security updated in new version 3.0

## Welcome page
> GET URL : http://localhost:8282/api/v1/security/welcome


## Run the application and add user to login
> POST URL : http://localhost:8282/api/v1/security/addNewUser

```
{
    "username": "rajesh",
    "password": "password",
    "roles": "ROLE_ADMIN,ROLE_USER",
    "email":"rajesh@gmail.com"
}
```

## To add new employee
> POST URL : http://localhost:8282/api/v1/employee/addNewEmployee

```
{
  "id":1,
  "firstName":"Rajesh",
  "lastName":"Kawali",
  "gender":"MALE",
  "dateOfJoining":"2015-11-09",
  "age":35,
  "email":"rajesh@gmail.com",
  "phone":"9550955557",
  "salary":45000,
  "department":"software",
  "employmentHistory":[
    "Capgemini",
    "Diebold",
    "NCR"
  ]
}
```

## To get all employee
> GET URL : http://localhost:8282/api/v1/employee/all

## To get single employee using id
> GET URL : http://localhost:8282/api/v1/employee/1


## Note

**Please run this all api in separate incognito mode.**