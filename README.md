# **Spring Boot H2 Demo 🚀**

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

2.Navigate into the project directory:
   ```bash
       cd spring-boot-h2-demo
