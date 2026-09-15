#  ATM Simulator

A **Java-based ATM Simulator** with **MySQL database integration** that simulates essential ATM and banking operations.

The application uses **Java for the application logic and user interaction**, while **MySQL is used for persistent storage and retrieval of account information and transaction data**. Database operations are handled through **JDBC (Java Database Connectivity)**.

---

## 📌 Project Overview

The ATM Simulator is designed to replicate the basic workflow of an Automated Teller Machine.

Users can create and access their banking information and perform ATM operations. Instead of keeping account data only in program memory, the application connects to a **MySQL database**, allowing account information and balance-related data to be stored and retrieved persistently.

The application calculates and updates the user's balance based on the transactions performed.

### System Architecture

```text
              ┌─────────────────────┐
              │     ATM Simulator   │
              │        Java         │
              └──────────┬──────────┘
                         │
                         │ JDBC
                         ▼
              ┌─────────────────────┐
              │    MySQL Database   │
              │                     │
              │ Account Information │
              │ Transaction Data    │
              │ Balance Information │
              └─────────────────────┘
```

---

## ✨ Features

* 🔐 User/account authentication
* 📝 Account information creation and storage
* 💰 Balance enquiry
* 💵 Deposit functionality
* 💸 Withdrawal functionality
* 🔄 Balance calculation and updating
* 🗄️ Persistent data storage using MySQL
* 🔎 Retrieval of account information from the database
* 🔗 Java–MySQL connectivity using JDBC
* ⚠️ Input and transaction validation
* 🏦 ATM-style banking workflow

---

## 🛠️ Technologies Used

| Technology        | Purpose                                             |
| ----------------- | --------------------------------------------------- |
| **Java**          | Application logic and ATM functionality             |
| **MySQL**         | Persistent database storage                         |
| **JDBC**          | Connecting Java application with MySQL              |
| **SQL**           | Creating, retrieving, and updating database records |
| **IntelliJ IDEA** | Development environment                             |

---

## 🗄️ Database Integration

A major component of this project is the integration of **Java with MySQL**.

The application communicates with the database through **JDBC**, allowing Java code to execute SQL queries and retrieve or modify stored information.

### Database Operations

The application uses the database to:

1. Create/store account information.
2. Retrieve account information when required.
3. Retrieve the current balance.
4. Process deposits.
5. Process withdrawals.
6. Calculate the updated balance.
7. Store/update the resulting information in the database.

This makes the application more realistic than an ATM simulation that stores all information only in variables during runtime.

---

## 🔄 ATM Transaction Flow

A typical transaction follows this workflow:

```text
             Start
               │
               ▼
       User Authentication
               │
               ▼
          ATM Operations
               │
       ┌───────┼────────┐
       │       │        │
       ▼       ▼        ▼
    Deposit  Withdraw  Balance
       │       │        │
       └───────┼────────┘
               │
               ▼
       Retrieve/Update
       MySQL Database
               │
               ▼
       Updated Account
          Information
               │
               ▼
              End
```

---

## 💰 Balance Calculation

The balance is maintained using the account information stored in the database.

For a deposit:

```text
New Balance = Current Balance + Deposit Amount
```

For a withdrawal:

```text
New Balance = Current Balance - Withdrawal Amount
```

The updated balance is then persisted in the MySQL database so that the information is available in subsequent sessions.

---

## 🔗 Java + JDBC + MySQL

The database communication follows the general structure:

```text
Java Application
       │
       ▼
      JDBC
       │
       ▼
MySQL Database
       │
       ▼
 SQL Queries
       │
       ▼
Account / Transaction Data
```

JDBC acts as the bridge between the Java application and the MySQL database, allowing the application to execute SQL operations and process the returned data.

---

## 📂 Project Structure

```text
ATM-Simulator/
│
├── .idea/
│
├── src/
│   └── Java source files
│
├── .gitignore
├── atm_simulation.iml
└── README.md
```

---

## 🚀 Getting Started

### Prerequisites

Before running the project, make sure you have:

* **JDK 8 or later**
* **MySQL Server**
* **MySQL Workbench** (recommended)
* **IntelliJ IDEA** or another Java IDE
* **MySQL JDBC Driver**

---

### 1. Clone the Repository

```bash
git clone https://github.com/Sattwik-141/ATM-Simulator.git
```

```bash
cd ATM-Simulator
```

---

### 2. Set Up MySQL

Start your MySQL server and create the database required by the application.

For example:

```sql
CREATE DATABASE atm_simulation;
```

Then create the required tables according to the SQL queries/schema used by the project.

---

### 3. Configure Database Connection

Update the database connection details in the Java database connection code with your local MySQL configuration.

Typical configuration parameters include:

```text
Database URL
Username
Password
```

Make sure the credentials match your local MySQL installation.

> **Security:** Do not commit your actual database password or other credentials to GitHub.

---

### 4. Run the Application

Open the project in IntelliJ IDEA and run the Java class containing the `main()` method.

The application will start the ATM simulation and communicate with MySQL whenever account or balance information needs to be created, retrieved, or updated.

---

## 🧠 Concepts Demonstrated

This project provides practical experience with:

### Java Programming

* Classes and objects
* Methods
* Conditional statements
* Loops
* User input
* Exception handling
* Modular programming

### Database Management

* Relational databases
* SQL queries
* Data insertion
* Data retrieval
* Data updating
* Persistent storage

### JDBC

* Establishing database connections
* Executing SQL queries
* Retrieving query results
* Updating database records
* Connecting application logic with persistent data

---

## 🎯 Learning Objectives

The project was developed to gain practical experience in building a **database-driven Java application**.

Key learning outcomes include:

* Understanding how Java applications communicate with databases.
* Using JDBC to execute SQL queries from Java.
* Designing basic banking transaction logic.
* Maintaining account information persistently.
* Calculating and updating account balances.
* Handling user input and transaction validation.
* Understanding the relationship between application logic and database operations.

---

## 🔮 Future Improvements

Potential improvements include:

* [ ] Transaction history / mini statement
* [ ] Multiple account support
* [ ] Money transfer between accounts
* [ ] Daily withdrawal limits
* [ ] Improved exception handling
* [ ] Password/PIN hashing
* [ ] Database transaction management
* [ ] Better separation of database and business logic
* [ ] GUI improvements
* [ ] Unit testing with JUnit
* [ ] Deployment with a packaged database configuration

---

## 👨‍💻 Author

### Sattwik Bishnu

GitHub:
https://github.com/Sattwik-141

---

## 📄 Disclaimer

This project is an **educational ATM simulation** and is not intended for processing real banking transactions or sensitive financial information.
