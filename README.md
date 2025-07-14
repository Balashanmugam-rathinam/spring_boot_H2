# **Spring Boot H2  🚀**

A simple Spring Boot project that demonstrates how to use H2 as an embedded database, with Spring Security integrated for basic authentication. The project includes an in-memory H2 database, a REST API, and access to the H2 console for direct database management.

## **Table of Contents 📚**

1. [Features 🌟](#features)
2. [Technologies Used ⚙️](#technologies-used)
3. [Getting Started ⚡](#getting-started)
    - [Prerequisites 🛠](#prerequisites)
    - [Clone and Setup 📥](#clone-and-setup)
    - [Running the Application 🚀](#running-the-application)
4. [Accessing the H2 Console 🖥](#accessing-the-h2-console)
5. [API Endpoints 🧑‍💻](#api-endpoints)
    - [GET /api/users](#get-apiv1users)
    - [POST /api/register](#post-apiv1register)
6. [Database Schema 🗃](#database-schema)
7. [License 📜](#license)

---
## **Project Structure 🌟**
     ```bash
        spring-boot-H2/
    ├── src/
    │ ├── main/
    │ │ ├── java/
    │ │ │ └── com/
    │ │ │ └── securepay/
    │ │ │ ├── SpringBootH2DemoApplication.java
    │ │ │ └── config/
    │ │ │ └── SecurityConfig.java
    │ │ └── resources/
    │ │ ├── application.properties
    │ │ └── data.sql
    ├── .gitignore
    ├── mvnw
    ├── mvnw.cmd
    ├── pom.xml
    └── README.md

---
## **Features 🌟**

- **In-Memory H2 Database**: Uses an embedded in-memory H2 database, perfect for development and testing purposes. 💾
- **Spring Security 🔒**: Basic authentication with BCrypt password encoding for security.
- **H2 Console 🖥**: Provides an easy-to-use web interface for managing and interacting with the database.
- **REST API 💻**: Includes a basic REST API for user registration and retrieval.
- **Spring Boot Setup ⚡**: Clean and simple Spring Boot setup to get you started quickly.

---

## **Technologies Used ⚙️**

- **Spring Boot**: Framework for building Java-based web applications.
- **H2 Database**: Lightweight in-memory database for development.
- **Spring Security**: Authentication and authorization handling.
- **Spring Data JPA**: For database interaction via repositories.
- **BCrypt**: For securely encoding passwords.
- **Maven**: Dependency management and build tool.

---

## **Getting Started ⚡**

Follow these instructions to get a copy of this project running on your local machine for development and testing purposes.

### **Prerequisites 🛠**

Before setting up the project, make sure you have the following installed:

- **Java 17 or above**: Spring Boot 3.x requires JDK 17 or higher.
- **Maven**: A build tool for Java projects (you can install it [here](https://maven.apache.org/install.html)).
- **Git**: To clone the project from GitHub (install it from [Git official website](https://git-scm.com/)).

### **Clone and Setup 📥**

1. Clone the repository to your local machine:
   ```bash
   git clone https://github.com/your-username/spring_boot_H2.git

2. Navigate into the project directory:
   ```bash
       cd spring-boot-H2
3. Using Maven (if installed globally):
   ```bash
       mvn spring-boot:run
4. This will start the application on the default port 8080. You should see output like this:
   ```bash
       2025-07-15 12:34:56.789  INFO 12345 --- [  main] com.securepay.SpringBootH2DemoApplication  : Started SpringBootH2DemoApplication in 3.5 seconds (JVM running for 4.2)
5. Accessing the H2 Console 🖥
-> Once your application is running, you can access the H2 database console via your web browser.
   ```bash
       Open http://localhost:8080/h2-console.

-> The H2 console login screen will appear.

* JDBC URL: jdbc:h2:mem:testdb
* Username: sa
* Password: (Leave blank)

This will allow you to interact directly with your in-memory database.

## API Endpoints 🧑‍💻

### **GET /api/users**

This endpoint retrieves all users stored in the database.

#### Request:
    ```bash
        GET http://localhost:8080/api/users
#### SQL       
     ```bash
    [
      {
        "id": 1,
        "username": "john_doe",
        "role": "USER"
      },
      {
        "id": 2,
        "username": "admin",
        "role": "ADMIN"
      }
    ]

POST /api/register
This endpoint allows you to register a new user. The password will be encoded using BCrypt.

#### Request:
     ```bash
     POST http://localhost:8080/api/register


####Body (JSON):
 ```bash
   {
      "username": "new_user",
      "password": "password123"
   }

#### Response (201 Created):
 ```bash
{
  "id": 3,
  "username": "new_user",
  "role": "USER"
}
Database Schema 🗃
Users Table
id: Auto-incremented primary key.

username: User's login name (unique).

password: Encrypted password.

role: Role of the user (e.g., USER, ADMIN).

The Users table is created automatically at the start of the application using Hibernate DDL.


