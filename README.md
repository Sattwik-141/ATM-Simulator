#  ATM Simulator

A Java-based **ATM (Automated Teller Machine) Simulator** that demonstrates the core functionality and workflow of an ATM through a simple interactive application.

The project was developed to practice **Java programming, Object-Oriented Programming (OOP), control flow, input handling, and application design** by simulating common ATM operations.

---

## 📌 Overview

The ATM Simulator recreates the basic interaction between a user and an ATM machine.

Users can interact with the application to perform banking-related operations such as checking their balance and carrying out transactions, depending on the available options in the application.

The project focuses on implementing the **logic behind ATM operations** while maintaining a simple and easy-to-understand Java structure.

---

## ✨ Features

* 🏦 ATM-style banking interface
* 🔐 User authentication / PIN-based access
* 💰 Balance enquiry
* 💵 Cash withdrawal
* 💳 Cash deposit
* 🔄 Transaction handling
* 🔑 PIN-related functionality
* ✅ Input validation
* ⚠️ Handling of invalid inputs and transaction conditions
* 🧩 Object-Oriented Programming based implementation

---

## 🛠️ Technologies Used

* **Java**
* **Object-Oriented Programming (OOP)**
* **Java Collections**
* **Exception / Input Handling**
* **IntelliJ IDEA**

---

## 🧠 OOP Concepts Demonstrated

This project provides practical implementation of fundamental Object-Oriented Programming concepts in Java.

### Encapsulation

Data and related operations are organized within classes, helping control how account-related information is accessed and modified.

### Abstraction

The application separates the implementation of ATM operations from the way users interact with the system.

### Inheritance

Classes can be organized using inheritance where common functionality is shared between related classes.

### Polymorphism

The project demonstrates how Java can use common interfaces or parent-class references to work with different implementations.

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

Make sure you have the following installed:

* **Java JDK 8 or later**
* **IntelliJ IDEA** or another Java-compatible IDE

You can verify your Java installation using:

```bash
java -version
```

---

## ▶️ Running the Project

### Using IntelliJ IDEA

1. Clone the repository:

```bash
git clone https://github.com/Sattwik-141/ATM-Simulator.git
```

2. Open the project in **IntelliJ IDEA**.

3. Open the `src` directory.

4. Locate the Java class containing the `main()` method.

5. Run the application using IntelliJ IDEA's **Run** option.

---

## 💡 How It Works

The application follows a basic ATM workflow:

```text
Start
  │
  ▼
User Authentication
  │
  ▼
ATM Menu
  │
  ├── Check Balance
  │
  ├── Deposit
  │
  ├── Withdraw
  │
  ├── PIN / Account Operations
  │
  └── Exit
  │
  ▼
End
```

The application processes the user's selected operation, validates the input, updates the relevant account information, and returns the user to the ATM menu until they choose to exit.

---

## 🎯 Learning Objectives

This project was created to strengthen understanding of:

* Java fundamentals
* Classes and objects
* OOP principles
* Conditional statements
* Loops and control flow
* Methods and modular programming
* User input handling
* Data validation
* Basic banking transaction logic
* Designing a small real-world simulation

---

## 🔮 Future Improvements

Possible improvements that can make the simulator more realistic and scalable include:

* [ ] Multiple user/account support
* [ ] Persistent data storage using a database
* [ ] Transaction history / mini statement
* [ ] Money transfer between accounts
* [ ] Daily withdrawal limits
* [ ] Improved authentication and security
* [ ] GUI using Java Swing or JavaFX
* [ ] Unit testing with JUnit
* [ ] Better exception handling
* [ ] Database integration using JDBC/MySQL

---

## 👨‍💻 Author

**Sattwik Bishnu**

GitHub: [Sattwik-141](https://github.com/Sattwik-141)

---

## 📄 License

This project is intended primarily as an educational and learning project.

Feel free to explore, modify, and improve the code for learning purposes.
