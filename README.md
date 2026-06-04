# E-Commerce Order System

A **production-grade microservices** application built to demonstrate real-world distributed system concepts, especially **Saga Pattern**, event-driven architecture, and complex business workflows.

---

## 🎯 Project Objective

This project is designed to strengthen my understanding of **distributed systems** and showcase production-ready microservices architecture. The goal is to simulate a complete e-commerce order lifecycle — from cart to order confirmation — while handling failures gracefully using the **Saga Pattern**.

---

## 🏗️ Architecture

### Services (Planned)

| Service                | Port   | Status      | Responsibility |
|------------------------|--------|-------------|----------------|
| **user-service**       | 8081   | ✅ Done     | Authentication, User Management, JWT |
| **product-service**    | 8082   | 🔄 In Progress | Product Catalog & Pricing |
| **inventory-service**  | 8083   | 🔄 Planned  | Stock Reservation & Release |
| **order-service**      | 8084   | 🔄 Planned  | Order Management + Saga Orchestration |
| **payment-service**    | 8085   | 🔄 Planned  | Payment Processing |
| **notification-service**| 8086  | 🔄 Planned  | Email/SMS Notifications |

### Key Architectural Patterns

- **Choreography-based Saga Pattern** for distributed transactions
- **Event-Driven Architecture** using Kafka
- **Outbox Pattern** for reliable event publishing
- **CQRS** (planned)
- **Circuit Breaker, Retry & Rate Limiting** using Resilience4j
- **Distributed Locking** with Redis
- **JWT Authentication** with cross-service token propagation
- **Database per Service** principle

---

## 🛠️ Tech Stack

- **Backend**: Java 25, Spring Boot 3.5.9
- **Build Tool**: Maven (Multi-module)
- **Database**: PostgreSQL (one per service)
- **Cache & Locking**: Redis
- **Message Broker**: Apache Kafka (planned)
- **API Documentation**: OpenAPI / Swagger UI
- **Security**: Spring Security + JWT
- **Resilience**: Resilience4j
- **Containerization**: Docker & Docker Compose
- **Others**: Lombok, MapStruct, Feign Client, BigDecimal

---

## 📊 Current Progress

**Overall Completion: ~15%**

### Completed:
- Multi-module Maven project structure
- Root POM configuration
- `user-service` setup with:
  - PostgreSQL integration
  - Redis configuration
  - Basic Spring Boot setup
  - JWT-ready security foundation

### In Progress:
- Full JWT Security implementation (SecurityConfig, JwtFilter, etc.)
- User management APIs

---

## 🚀 How to Run (Local)

1. Clone the repository
2. Start PostgreSQL:
   ```bash
   docker run --name postgres-ecommerce -e POSTGRES_USER=postgres -e POSTGRES_PASSWORD=postgres -e POSTGRES_DB=user_db -p 5432:5432 -d postgres:16

---

## Author
- [Mavishnu KJ](http://www.linkedin.com/in/mavishnu-kj)

## Related Projects
- Full Spring Boot application: [Employee Management System](https://github.com/Mavishnu-KJ/employeeManagementSystem)
- Payment Wallet System : [payment-wallet-system](https://github.com/Mavishnu-KJ/payment-wallet-system)
