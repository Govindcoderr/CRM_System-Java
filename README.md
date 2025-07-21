
### ✅ Final `README.md

```markdown
# 📊 CRM System (Java + MySQL + JDBC)

A console-based **Customer Relationship Management (CRM)** system built in Java using **JDBC** and **MySQL**. It allows users to manage customer records with basic operations like Add, View, Search, Update, and Delete. All data is stored in a MySQL database.

---

## 🚀 Features

- ➕ Add new customers
- 👁️ View all customers
- 🔍 Search for customer by ID
- ✏️ Update customer name
- ❌ Delete customer by ID
- 🔌 Uses MySQL via JDBC
- 💬 Console-based menu system

---

## 🧰 Technologies Used

- Java (JDK 8+)
- JDBC (Java Database Connectivity)
- MySQL Server
- IntelliJ IDEA (or any Java IDE)
- MySQL Connector/J (JDBC driver)

---

## 📁 Project Structure

```

com.crm/
├── Customer.java        # Customer model class
├── DBConnection.java    # JDBC connection manager
├── CRMSystem.java       # Business logic (CRUD)
└── Main.java            # Entry point, console interface

````

---

## ⚙️ How to Run This Project on Any Device

### ✅ Step 1: Install Prerequisites

- Java JDK (https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- MySQL Server (https://dev.mysql.com/downloads/mysql/)
- IntelliJ IDEA (https://www.jetbrains.com/idea/download/)
- MySQL Workbench (optional)

---

### ✅ Step 2: Clone the Repository

```bash
git clone https://github.com/<your-username>/crm-java-mysql.git
cd crm-java-mysql
````

---

### ✅ Step 3: Create MySQL Database and Table

Login to MySQL (terminal or Workbench), then run:

```sql
CREATE DATABASE crm_db;

USE crm_db;

CREATE TABLE customers (
    id INT PRIMARY KEY,
    name VARCHAR(100),
    email VARCHAR(100),
    phone VARCHAR(20),
    address VARCHAR(200)
);
```

---

### ✅ Step 4: Download MySQL JDBC Driver

1. Download: [https://dev.mysql.com/downloads/connector/j/](https://dev.mysql.com/downloads/connector/j/)
2. Extract the ZIP
3. Locate: `mysql-connector-java-8.0.xx.jar`

---

### ✅ Step 5: Add the JAR to IntelliJ

1. Open IntelliJ
2. Go to `File → Project Structure → Libraries`
3. Click `+ → Java`
4. Select `mysql-connector-java-8.0.xx.jar`
5. Click OK → Apply → OK

---

### ✅ Step 6: Configure DBConnection.java

Edit this file:

```java
private static final String URL = "jdbc:mysql://localhost:3306/crm_db";
private static final String USER = "root";           // your MySQL username
private static final String PASSWORD = "your_pass";  // your MySQL password
```

---

### ✅ Step 7: Run the Project

1. Open `Main.java`
2. Right-click → Run
3. Console menu will appear:

```
--- CRM MENU ---
1. Add Customer
2. View Customers
3. Search Customer
4. Update Customer
5. Delete Customer
6. Exit
```

---

## 🧪 Troubleshooting

| ❌ Error                    | ✅ Solution                                  |
| -------------------------- | ------------------------------------------- |
| `No suitable driver found` | Add `.jar` to Project Structure > Libraries |
| `Access denied`            | Check username/password                     |
| `Can't connect to DB`      | Check if MySQL is running on port 3306      |

---

## 🔮 Future Plans

* Add admin login system
* Create GUI (Swing / JavaFX)
* Export customer records to Excel or PDF
* Create web version using Spring Boot
* Build mobile version with Flutter

---

## 🙋‍♂️ About the Developer

**👨‍💻 Govind Rajpurohit**
📍 Kota, Rajasthan
📧 [govindrajpurohit.dev@gmail.com](mailto:govindrajpurohit.dev@gmail.com)
🌐 [Portfolio](https://govindrajpurohit.netlify.app)
🔗 Java Developer | Tech Enthusiast | Entrepreneur

---

## 📄 License

This project is licensed under the [MIT License](https://opensource.org/licenses/MIT) — you are free to use, modify, and distribute.

---

## 🤝 Support

If you find this project helpful, please ⭐ the repository and feel free to contribute!

```
