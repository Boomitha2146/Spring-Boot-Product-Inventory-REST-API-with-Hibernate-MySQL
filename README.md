# Spring-Boot-Product-Inventory-REST-API-with-Hibernate-MySQL

A production-grade backend REST API developed using Spring Boot, Hibernate (JPA), and MySQL to perform CRUD operations on Product Inventory data.

This project demonstrates end-to-end integration between:

Spring Boot REST Controller layer
Service layer business logic
Hibernate ORM persistence layer
MySQL relational database
Postman API testing workflow

The application exposes RESTful endpoints for:

Creating product records (POST)
Fetching all products (GET)
Fetching product by ID (GET)

Hibernate automatically maps Java Entity classes to MySQL tables using JPA annotations and manages schema updates dynamically via ddl-auto=update.

Tech Stack
Technology	                     Usage
Java	                       Programming Language
Spring Boot	                 Backend Framework
Spring Data JPA	             ORM Layer
Hibernate                    Persistence Implementation
MySQL	                       Relational Database
Maven	                       Build Tool
Postman	                     API Testing
IntelliJ IDEA	               Development IDE

API Endpoints
Method	Endpoint	Description
POST	/product/add	Add new product
GET	/product/all	Fetch all products
GET	/product/{id}	Fetch product by ID

Sample JSON Request (POST)
{
  "name": "Wireless Mouse",
  "category": "Electronics",
  "price": 899
}

Database Configuration
spring.datasource.url=jdbc:mysql://localhost:3306/bookdb
spring.datasource.username=root
spring.datasource.password=root123
spring.jpa.hibernate.ddl-auto=update

Key Features

Layered Architecture (Controller → Service → Repository)
RESTful API Design
Hibernate ORM Mapping
MySQL Integration
Automatic Table Creation
JSON Request/Response Handling
Postman API Validation

Use Case

Suitable for learning:
Spring Boot REST API development
Hibernate + MySQL integration

Backend CRUD implementation

API testing using Postman

Enterprise layered architecture design
