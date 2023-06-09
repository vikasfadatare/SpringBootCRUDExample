# SpringBootCRUDExample
 We are going to learn about the CRUD operations in Springboot and MySQL with implementation

✅ Create <br>
✅ Read or Retrieve <br>
✅ Update <br>
✅ Delete <br>

### Configure MySQL Database 

Let's first create a database and table in MySQL server using the below command:
```bash
`CREATE SCHEMA springbootcrudapi DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci;`
```

```bash
`CREATE TABLE springbootcrudapi.user (
  user_id VARCHAR(45) NOT NULL,
  first_name VARCHAR(45) NULL,
  last_name VARCHAR(45) NULL,
  username VARCHAR(45) NOT NULL,
  password VARCHAR(100) NOT NULL,
  phone VARCHAR(45) NULL,
  registration_date DATETIME NULL,
  updated_date DATETIME NULL,
  is_active BIT NOT NULL,
  role VARCHAR(45) NULL,
  lastlogin_date DATETIME NULL,
  PRIMARY KEY (user_id));`
```
### Use Proper HTTP Headers for Serialization Formats
Both client and server, need to know which format is used for the communication. The format has to be specified in the HTTP-Header.
Some common examples of content types are “text/plain”, “application/xml”, “text/html”, “application/json”, “image/gif”, and “image/jpeg”.
```bash
Content-Type: application/json
```

### Test Spring Boot CRUD REST APIs using Postman Client

### Get all user
URL - http://localhost:9095/api/user/users <br>
Request Method - GET

![Screenshot 2023-06-09 160442](https://github.com/vikasfadatare/SpringBootCRUDExample/assets/34856163/47365e77-d0ba-4ef5-a9b9-731d658cec1e)<br><br>

### Get single user
URL - http://localhost:9095/api/user/users/agro6d3d-aab4-4e4d-b672-9e1e0bf12304 <br>
Request Method - GET

![Screenshot 2023-06-09 160545](https://github.com/vikasfadatare/SpringBootCRUDExample/assets/34856163/ab076312-e50c-49a0-87ef-69bd1d87aab3)<br><br>

### Add user
URL - http://localhost:9095/api/user/users/add <br>
Request Method - POST

![Screenshot 2023-06-09 160736](https://github.com/vikasfadatare/SpringBootCRUDExample/assets/34856163/0f9fb5b0-bbf2-4a4d-8512-4a1b777618e1)<br><br>

### Delete user
URL - http://localhost:9095/api/user/users/delete/agro6861-115d-4f3a-a89c-318cd5e6ab49 <br>
Request Method - DELETE

![Screenshot 2023-06-09 160820](https://github.com/vikasfadatare/SpringBootCRUDExample/assets/34856163/b0b9dec0-90d7-4055-949a-db09fadcede0)<br><br>

Congratulations guys! We successfully built a Restful CRUD API using Spring Boot 3, Spring Data JPA, and MySQL database. If you have any doubts, do connect with me on [Linkdin](https://www.linkedin.com/in/vikas-fadatare/), I am happy to answer all.
