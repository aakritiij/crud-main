# Spring Boot Student CRUD Application (EXP 5)

## 📌 Overview
This project demonstrates building RESTful APIs using Spring Boot with a layered architecture (Controller → Service → Repository) and basic CRUD operations. A minimal frontend UI is also included.

---

## ⚙️ Tech Stack
- Java (JDK 17+)
- Spring Boot
- Spring Data JPA
- H2 Database
- HTML, CSS, JavaScript (Basic UI)
- Maven

---

## 🚀 Features
- Create, Read, Update, Delete (CRUD) operations
- Layered architecture implementation
- Input validation using @Valid
- In-memory H2 database
- Basic frontend UI for interaction

---

## 📁 Project Structure
src/
 ├── main/
 │    ├── java/com/example/demo/
 │    │    ├── controller/
 │    │    ├── service/
 │    │    ├── repository/
 │    │    └── model/
 │    └── resources/
 │         ├── static/
 │         └── application.properties

---

## ▶️ How to Run

1. Clone the repository:
   git clone https://github.com/your-username/your-repo-name.git

2. Navigate to project:
   cd demo

3. Run the application:
   ./mvnw spring-boot:run

4. Open browser:
   http://localhost:8080

---

## 🔗 API Endpoints

- GET /students → Get all students
- POST /students → Add student
- PUT /students/{id} → Update student
- DELETE /students/{id} → Delete student

---

## 🧪 Example JSON

{
  "name": "John Doe",
  "email": "john@example.com"
}

---

## 💾 Database

- H2 in-memory database
- Console: http://localhost:8080/h2
- JDBC URL: jdbc:h2:mem:testdb

---

## 🎯 Outcome

- Implemented REST APIs using Spring Boot
- Applied layered architecture
- Performed CRUD operations successfully
- Built a minimal UI for interaction

---

## 👤 Author
Prateek Yadav