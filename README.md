# Universal DB Access

[![CI - Universal DB Backend](https://github.com/satya66123/universal-db-access/actions/workflows/ci.yml/badge.svg)](https://github.com/satya66123/universal-db-access/actions/workflows/ci.yml)

A backend-focused repository demonstrating how the **same business logic**
can be implemented using **different databases and languages**, while keeping
the API behavior and output consistent.

This project is designed with a **remote contract / part-time engineering**
workflow in mind — clean structure, clear responsibilities, and verified builds.

---

## 🔧 Tech Stack

### Backend
- Java (layered architecture: Controller → Service → Repository)
- PHP (service + repository pattern)

### Databases
- MySQL (relational model using JOIN queries)
- MongoDB (document-based model)

### DevOps & CI
- Docker (Java & PHP)
- Docker Compose
- Kubernetes manifests (structure-level)
- GitHub Actions CI (automatic verification on every commit)

---

## 📦 Use Case

**Order Management – Fetch all orders for a given user with product details**

Conceptual endpoint:
GET /users/{userId}/orders


The response structure remains **identical** across:
- Java + MySQL
- Java + MongoDB
- PHP + MySQL
- PHP + MongoDB

Only the **data access layer changes**.

---

## 🗄️ Database Design

### MySQL (Relational)
- Normalized tables:
  - users
  - orders
  - order_items
  - products
- Data fetched using JOIN queries
- Strong consistency and clear relationships

### MongoDB (Document)
- Orders stored as documents
- Order items embedded inside orders
- Reduced need for joins
- Optimized for read-heavy access patterns

---

## 🔄 MySQL vs MongoDB

| Aspect        | MySQL                          | MongoDB                       |
|---------------|--------------------------------|--------------------------------|
| Data Model    | Normalized tables              | Embedded documents             |
| Relationships | Foreign keys + JOINs           | Document nesting               |
| Query Style   | SQL JOIN queries               | Document traversal             |
| Schema        | Strict                          | Flexible                       |
| Best Fit      | Transactional systems          | Read-heavy systems             |

---

## 🧱 Backend Architecture

Both Java and PHP implementations follow the same structure:

Controller
↓
Service
↓
Repository


This mirrors **real-world backend systems** and remote contract development
practices.

---

## ⚙️ DevOps & CI Notes

- Dockerfiles and docker-compose are included for deployment readiness
- Kubernetes manifests demonstrate production-style structure
- GitHub Actions CI runs automatically on every push and pull request

> DevOps configurations are provided for **architectural clarity**  
> and were **not executed locally** as part of this repository.

---

## 🎯 Why This Repository

This project demonstrates:
- Strong SQL (JOINs) and NoSQL modeling
- Ability to switch databases without changing business logic
- Java and PHP backend flexibility
- Clean, review-friendly code
- CI-verified commits (green checks)

---

## 🚀 Suitable For

- Remote contract roles
- Remote part-time backend roles
- Backend-heavy full-stack positions
- SQL vs NoSQL interview discussions

---

## 📌 Notes

- Focus is on clarity and correctness, not feature count
- Code is intentionally kept simple and readable
- Commit history reflects incremental, professional development

---

## ✅ Project Completion Status

- [x] Repository structure finalized  
- [x] Java backend implementation  
- [x] PHP backend implementation  
- [x] MySQL relational design with JOINs  
- [x] MongoDB document-based design  
- [x] Consistent API output across databases  
- [x] DevOps configuration (Docker, Compose, Kubernetes)  
- [x] GitHub Actions CI enabled and verified  
- [x] Documentation completed  
- [x] Repository frozen for review  

✔ **Project completed and review-ready**
