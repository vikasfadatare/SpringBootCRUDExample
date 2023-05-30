# SpringBootCRUDExample
 We are going to learn about the CRUD operations in Springboot and MySQL with implementation

- Create
- Read or Retrieve
- Update
- Delete

The new table required in database

`CREATE SCHEMA springbootcrudapi DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci;`

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


