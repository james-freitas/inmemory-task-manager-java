# 📌 Task Manager API

A simple **Spring Boot REST API** for managing tasks **without a database**. Tasks are stored **in-memory** using a `ConcurrentHashMap`. 🚀

---

## 🌟 Features

✅ Create a task  
✅ Retrieve all tasks  
✅ Get a task by ID  
✅ Update a task  
✅ Delete a task  
✅ Lightweight and fast (No DB needed!)

---

## 🛠️ Tech Stack

- **Java 23+**
- **Spring Boot 3+**
- **Spring Web**

---

## 🚀 Getting Started

### 1️⃣ Clone the Repository
```sh
 git clone https://github.com/your-username/task-manager-api.git
 cd task-manager-api
```

### 2️⃣ Run the Application
```sh
 mvn spring-boot:run
```

The API will start at **`http://localhost:8080`**

---

## 📖 API Endpoints

### 📌 Create a Task
```http
POST /tasks
```
#### Request Body (JSON)
```json
{
  "title": "Learn Spring Boot",
  "description": "Study REST API development",
  "status": "Pending"
}
```
#### Response
```json
{
  "id": 1,
  "title": "Learn Spring Boot",
  "description": "Study REST API development",
  "status": "Pending"
}
```

---

### 📌 Get All Tasks
```http
GET /tasks
```
#### Response
```json
[
  {
    "id": 1,
    "title": "Learn Spring Boot",
    "description": "Study REST API development",
    "status": "Pending"
  }
]
```

---

### 📌 Get a Task by ID
```http
GET /tasks/{id}
```
#### Example
```http
GET /tasks/1
```
#### Response
```json
{
  "id": 1,
  "title": "Learn Spring Boot",
  "description": "Study REST API development",
  "status": "Pending"
}
```

---

### 📌 Update a Task
```http
PUT /tasks/{id}
```
#### Request Body (JSON)
```json
{
  "title": "Learn Spring Boot",
  "description": "Completed the tutorial",
  "status": "Done"
}
```
#### Response
```json
{
  "id": 1,
  "title": "Learn Spring Boot",
  "description": "Completed the tutorial",
  "status": "Done"
}
```

---

### 📌 Delete a Task
```http
DELETE /tasks/{id}
```
#### Example
```http
DELETE /tasks/1
```
#### Response
```json
"Task deleted"
```

---

## 📌 Next Steps

🔹 Add validation using `@Valid`  
🔹 Integrate OpenAPI/Swagger for API documentation  
🔹 Add unit tests with JUnit & Mockito

---

## 🤝 Contributing
Feel free to fork this repository and submit a pull request. All contributions are welcome! 😊

---

## 📜 License
This project is licensed under the **MIT License**. Feel free to use and modify it! 🎉

---

## ⭐ Show Some Love!
If you found this project useful, please ⭐ **star this repository** on GitHub! ❤️

