# Hospital Management - API Module ![Build Status](https://github.com/MirnaGama/hospital-management-api/actions/workflows/maven.yml/badge.svg)

## About the project
Hospital Management API built in Spring Boot

### Prerequisites:
- Spring Boot 3.2.1 
- JDK 17
- Maven 4.0.0

### Features
- [X] R1 - Doctor Registration
- [X] R2 - List of Doctors
- [X] R3 - Doctor Update
- [X] R4 - Doctor Exclusion
- [X] R5 - Patient Registration
- [ ] R6 - List of Patients
- [ ] R7 - Patient Update
- [ ] R8 - Patient Exclusion
- [ ] R9 - Consultation Scheduling
- [ ] R10 - Consultation Cancellation

## API Documentation

### /doctors

#### POST - [**/api/v1.0/doctors**] - Adds a new doctor

- **Body:**
```
{   
    "name" (string, required),  
    "email" (string, required),  
    "crm" (string, required),  
    "telephone" (string, required), 
    "specialty" (string, required), 
    "address": {   
        "street" (string, required),
        "neighborhood" (string, required), 
        "zipCode" (string, required),  
        "city" (string, required),  
        "state" (string, required),
        "additionalDetails" (string, optional),  
        "houseNumber" (string, optional)
    } 
}
```

- **Responses:**

| Code  | Description |
| ------------- | ------------- |
| `201` | _Successfully created_ |
| `400` | _Validation Error_ |

#### GET - [**/api/v1.0/doctors**] - Get a list of doctors

- **Response Body Example:**
```
{
    "content": [
        {
            "name": "Test1",
            "email": "test1@gmail.com",
            "crm": "123456",
            "specialty": "ORTHOPEDICS"
        },
        {
            "name": "Test2",
            "email": "test2@gmail.com",
            "crm": "789101",
            "specialty": "ORTHOPEDICS"
        },
        {
            "name": "Test3",
            "email": "test3@gmail.com",
            "crm": "112131",
            "specialty": "ORTHOPEDICS"
        },
    ],
    "pageable": {
        "pageNumber": 0,
        "pageSize": 10,
        "sort": {
            "sorted": true,
            "unsorted": false,
            "empty": false
        },
        "offset": 0,
        "paged": true,
        "unpaged": false
    },
    "totalPages": 1,
    "totalElements": 3,
    "last": true,
    "sort": {
        "sorted": true,
        "unsorted": false,
        "empty": false
    },
    "number": 0,
    "size": 10,
    "first": true,
    "numberOfElements": 3,
    "empty": false
}
```

- **Request Parameters:**

| Key  | Description |
| ------------- | ------------- |
| `size` | _Number of records that should be returned_ |
| `sort` | _Sort by object attribute in descending order_ |
| `page` | _Page number_ |

- **Responses:**

| Code  | Description |
| ------------- | ------------- |
| `200` | _Successful operation_ |


#### PUT - [**/api/v1.0/doctors**] - Updates an existing doctor

- **Body:**
```
{   
    "id" (number, required),
    "name" (string, optional), 
    "telephone" (string, optional),  
    "address": {   
        "street" (string, optional),
        "neighborhood" (string, optional), 
        "zipcode" (string, optional),  
        "city" (string, optional),  
        "state" (string, optional),
        "additionalDetails" (string, optional),  
        "houseNumber" (string, optional),
    } 
}
```

- **Responses:**

| Code  | Description |
| ------------- | ------------- |
| `200` | _Successful operation_ |
| `400` | _Validation Error_ |


#### DELETE - [**/api/v1.0/doctors/{id}**] - Deactivates an existing doctor

- **Response Body Example:**
```
{
    "id": 2,
    "name": "DEACTIVATED USER TEST",
    "email": "test@gmail.com",
    "crm": "12456",
    "telephone": "(81) 99999999",
    "specialty": "ORTHOPEDICS",
    "active": false,
    "address": {
        "street": "TEST STR.",
        "neighborhood": "TEST NEIGHBORHOOD",
        "zipCode": "12345678",
        "city": "TEST CITY",
        "state": "ST",
        "additionalDetails": null,
        "houseNumber": null
    }
}
```

- **Request Parameters:**

| Key  | Description |
| ------------- | ------------- |
| `id` | _Unique identifier of the doctor who will be deactivated_ |

- **Responses:**

| Code  | Description |
| ------------- | ------------- |
| `200` | _Successful operation_ |
| `400` | _Validation Error_ |

### /patients

#### POST - [**/api/v1.0/patients**] - Adds a new patient

- **Body:**
```
{   
    "name" (string, required),  
    "email" (string, required),  
    "cpf" (string, required),  
    "telephone" (string, required), 
    "address": {   
        "street" (string, required),
        "neighborhood" (string, required), 
        "zipCode" (string, required),  
        "city" (string, required),  
        "state" (string, required),
        "additionalDetails" (string, optional),  
        "houseNumber" (string, optional)
    } 
}
```

- **Responses:**

| Code  | Description |
| ------------- | ------------- |
| `201` | _Successfully created_ |
| `400` | _Validation Error_ |

