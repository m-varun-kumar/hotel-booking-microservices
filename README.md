🏨 Hotel Booking Microservices System (Spring Boot + Spring Cloud)
🚀 Project Description
A complete Microservices-based Hotel Booking System built using Spring Boot & Spring Cloud following real-world enterprise architecture.

This system demonstrates service-to-service communication, API Gateway routing, service discovery using Eureka, and MySQL database integration — similar to production-level backend systems used in companies like Walmart, Google, and Amazon.

🧠 Architecture Overview


                    ┌────────────────────┐
                    │   Eureka Server    │
                    │ (Service Registry) │
                    └─────────┬──────────┘
                              │
        ┌─────────────────────┼─────────────────────┐
        │                     │                     │
        
 ┌─────────────┐     ┌─────────────┐       ┌─────────────┐
 │ API GATEWAY │────▶│ HOTEL-SVC   │       │ USER-SVC    │
 │  (8080)     │     │ (8081)      │       │ (8084)      │
 └──────┬──────┘     └─────────────┘       └─────────────┘
        │
        │
 ┌─────────────┐     ┌─────────────┐      ┌─────────────┐
 │ BOOKING-SVC │────▶│ PAYMENT-SVC │────▶ │NOTIFICATION │
 │  (8082)     │     │ (8083)      │      │   (8085)    │
 └─────────────┘     └─────────────┘      └─────────────┘



                MySQL Databases for each service
All services register with Eureka Server
Communication happens via API Gateway

🏗️ Microservices Implemented
Service	Port	Description
Eureka Server	8761	Service discovery
API Gateway	8080	Routes all requests
Hotel Service	8081	Hotel data management
Booking Service	8082	Booking operations
Payment Service	8083	Payment processing
User Service	8084	User management
Notification Service	8085	Sends notifications
🛠️ Tech Stack
💻 Backend
Java

Spring Boot

Spring Cloud

Spring Data JPA

REST APIs

Microservices Architecture

🗄️ Database
MySQL

Hibernate/JPA

🧰 Tools
IntelliJ IDEA Community

Postman

Git & GitHub

Maven

✨ Key Features
✔ Microservices architecture
✔ Eureka service discovery
✔ API Gateway routing
✔ Load balancing
✔ MySQL database per service
✔ REST API communication
✔ Spring Data JPA integration
✔ Production-level project structure
✔ Tested using Postman
✔ All services registered in Eureka

▶️ How to Run the Project
Step 1: Start Eureka Server
Run service-discovery project

Open:

http://localhost:8761
Step 2: Start Services (Order matters ⚠️)
Run one by one:

1. USER-SERVICE
2. HOTEL-SERVICE
3. BOOKING-SERVICE
4. PAYMENT-SERVICE
5. NOTIFICATION-SERVICE
6. API-GATEWAY (LAST)
Step 3: Test APIs via Gateway
Hotel API
GET http://localhost:8080/api/hotels
Booking API
POST http://localhost:8080/api/bookings
Payment API
POST http://localhost:8080/api/payments
📷 Eureka Dashboard
All microservices successfully registered and running:

API-GATEWAY – UP
HOTEL-SERVICE – UP
BOOKING-SERVICE – UP
PAYMENT-SERVICE – UP
USER-SERVICE – UP
NOTIFICATION-SERVICE – UP
