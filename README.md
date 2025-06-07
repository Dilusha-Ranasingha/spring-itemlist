# 🛍️ Item List Fullstack Web Application

A fullstack web application built using **Spring Boot (Java)** on the backend with PostgreSQL and Redis support, designed for managing item listings. Frontend is expected to be hosted at [https://itel.app/](https://itemlist-taupe.vercel.app/).

---

## 📦 Features

- ✅ Add, update, and delete item records
- 🌐 CORS configured to allow secure access from frontend
- 💾 PostgreSQL for data persistence
- ⚡ Redis for future caching capabilities
- 🐳 Dockerized with Docker Compose support
- 🛡️ Secure with environment variable-based secrets

---

## 🧠 Technologies Used

| Layer        | Technology        |
| ------------ | ----------------- |
| Backend      | Spring Boot (Java 17) |
| Database     | PostgreSQL        |
| Cache Layer  | Redis             |
| Deployment   | Docker & Docker Compose |
| Build Tool   | Maven             |
| Web Server   | Embedded Tomcat (via Spring Boot) |

---

## 🚀 Getting Started

### ✅ Prerequisites

- Docker & Docker Compose
- Java 17
- Maven 3.8+

---

### ⚙️ Environment Variables

Create a `.env` file or ensure the following are defined in your deployment environment:

```env
DATASOURCE_URL=jdbc:postgresql://localhost:5432/
DATASOURCE_USER=test
DATASOURCE_PASSWORD=1
FRONTEND_URL=https://itel.app/
