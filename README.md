# spring-boot-mysql-graphqql

Steps to run application
 1. All tables auto created on application started 
 2. Run Application.
 3. Create Student.
> Add POST request in POSTMAN - 
> http://localhost:8090/graphql


QUERY 

```
mutation saveStudent($input: StudentInput!) {
  saveStudent(student: $input) {
    id,
    studentId,
    firstName,
    lastName,
    phoneNumber,
    age,
    gender,
    email,
    address { 
        id,
        addressLine1 ,
        addressLine2,
        city,
        state,
        country,
        pinCode
    }
  }
}
```

GRAPHQL VARIABLES

```
{
    "input": {
    	"id": 1,
        "studentId": "User001",
        "firstName": "Rahul",
        "lastName": "Bhawar",
        "phoneNumber": 95610,
        "age": 28,
        "gender": "MALE",
        "email": "bhawar.rahul7@gmail.com",
        "address": {
        	"id": 1,
            "addressLine1": "At Post ",
            "addressLine2": "Belura",
            "city": "Beed",
            "state": "MH",
            "country": "India",
            "pinCode": 431122
        }
    }
}
```
4. Fetach Data after student created 
> URL (POST)- http://localhost:8090/graphql 

Query 

```
 {
   getAllStudent {
      id
      studentId
      firstName
      age
      gender
      address {
          id
          city
          country
      }
   }
}
```
Result
```
{
    "data": {
        "getAllStudent": [
            {
                "id": "1",
                "studentId": "User001",
                "firstName": "Rahul",
                "age": 28,
                "gender": "MALE",
                "address": {
                    "id": "1",
                    "city": "Beed",
                    "country": "India"
                }
            }
        ]
    }
}
```
