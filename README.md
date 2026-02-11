# Universal DB Backend

This repository demonstrates how the **same backend business logic**
can be implemented using **different databases and languages** without
changing API behavior.

The focus is on **data modeling, repository design, and contract-style
backend development**, not framework-heavy demos.

---

## 🧩 Tech Stack

### Backend
- Java (Spring-style layered architecture)
- PHP (service + repository pattern)

### Databases
- MySQL (relational model with JOINs)
- MongoDB (document-based model)

### DevOps
- Docker (Java & PHP)
- Docker Compose
- Kubernetes manifests (deployment + services)

---

## 📦 Use Case

**Order Management – Fetch user orders with product details**

Endpoint concept:
GET /users/{userId}/orders


The response structure is **identical** across:
- MySQL implementation
- MongoDB implementation
- Java and PHP backends

Only the **data access layer changes**.

---

## 🗄️ Database Design

### MySQL (Relational)
- Normalized tables:
  - users
  - orders
  - order_items
  - products
- Data fetched using **JOIN queries**
- Strong consistency and referential integrity

### MongoDB (Document)
- Orders stored as documents
- Order items embedded inside order documents
- Reduced need for joins
- Optimized for read-heavy access

---

## 🔄 MySQL vs MongoDB Comparison

| Aspect            | MySQL                          | MongoDB                       |
|-------------------|--------------------------------|--------------------------------|
| Data Model        | Normalized tables              | Embedded documents             |
| Relationships     | Foreign keys + JOINs           | Document nesting               |
| Query Style       | SQL JOIN queries               | Document traversal             |
| Schema            | Strict                          | Flexible                       |
| Best Use Case     | Transactional systems          | Read-heavy / flexible models   |

---

## 🧱 Backend Architecture

Both Java and PHP implementations follow the same structure:

Controller (API layer)
↓
Service (Business logic)
↓
Repository (Database-specific logic)


This mirrors **remote contract and production backend workflows**.

---

## ⚙️ DevOps Notes

- Dockerfiles are provided for Java and PHP services
- docker-compose.yml shows how services can be wired together
- Kubernetes manifests demonstrate deployment structure

> These configurations are included for **deployment readiness and architectural clarity**.  
> They were **not executed locally** as part of this repository.

---

## 🎯 Why This Repository

This project is designed to demonstrate:
- Strong SQL (JOINs) and NoSQL modeling
- Ability to switch databases without changing business logic
- Java + PHP backend flexibility
- Clean, readable, review-friendly code
- Remote contract–style engineering practices
---

## 📌 Notes

- Focus is on correctness and clarity, not feature count
- Code is intentionally kept simple and readable
- Incremental commits reflect real-world collaboration


![CI](https://github.com/<your-username>/universal-db-backend/actions/workflows/ci.yml/badge.svg)
