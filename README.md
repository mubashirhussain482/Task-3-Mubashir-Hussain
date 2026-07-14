# 🏧 **Task-3-Mubashir-Hussain**

# **ATM System Using State Design Pattern (DecodeLabs_Java_P3)**

A Java console-based **ATM System** developed as part of the **DecodeLabs Java Internship**. This project simulates the basic operations of an Automated Teller Machine (ATM) while following **Object-Oriented Programming (OOP)** principles and implementing the **State Design Pattern**. The application provides secure transaction processing with proper input validation, encapsulation, and separation of concerns.

---

## 📌 Project Overview

The ATM System allows users to perform basic banking operations through a console interface. Users can insert a card, enter a PIN for authentication, check their account balance, deposit money, withdraw money, and eject their card. The application manages different stages of ATM operation using the **State Design Pattern**, ensuring that only valid actions can be performed in each state.

---

## ✨ Features

* 🏧 ATM simulation using a console interface
* 💳 Card insertion and ejection
* 🔐 PIN authentication
* 💰 Balance inquiry
* ➕ Deposit money
* ➖ Withdraw money
* 🔄 State-based transaction management
* ✅ Robust input validation
* ⚠ Exception prevention using `hasNextInt()` and `hasNextDouble()`
* 🔒 Secure encapsulation of bank account data
* 🧩 Separation of user interface and business logic

---

## 🛠 Technologies Used

* Java
* Object-Oriented Programming (OOP)
* State Design Pattern
* Scanner Class
* Exception Prevention using `hasNextInt()` and `hasNextDouble()`

---

## 📂 Project Structure

```text
Task-3-Mubashir-Hussain
│
├── BankAccount.java
├── ATMState.java
├── IdleState.java
├── HasCardState.java
├── AuthenticatedState.java
├── TransactionState.java
├── ATM.java
└── DecodeLabs_Java_P3.java
```

---

## 🏗 Object-Oriented Concepts Used

This project demonstrates the following OOP concepts:

* Encapsulation
* Abstraction
* Interfaces
* Classes and Objects
* Constructors
* Method Overriding
* Polymorphism
* Separation of Concerns

---

## 🔄 State Design Pattern

The application implements the **State Design Pattern** by representing each ATM stage as a separate state class implementing the common `ATMState` interface.

### States Implemented

* **Idle State**

  * Waits for the user to insert a card.

* **Has Card State**

  * Accepts and verifies the user's PIN.

* **Authenticated State**

  * Allows access to ATM transactions after successful PIN verification.

* **Transaction State**

  * Processes banking operations such as balance inquiry, deposit, and withdrawal.

---

## 🎮 How the ATM Works

1. The ATM starts in the **Idle State**.
2. The user inserts a card.
3. The user enters the PIN.
4. If the PIN is correct, the ATM moves to the **Authenticated State**.
5. The user can perform transactions:

   * Check Balance
   * Deposit Money
   * Withdraw Money
6. After completing transactions, the user can return to the authenticated menu or eject the card.
7. The ATM returns to the **Idle State** after the card is ejected.

---

## 🔄 State Transition Flow

```text
Idle State
      │
      ▼
Has Card State
      │
      ▼
Authenticated State
      │
      ▼
Transaction State
      │
      ▼
Authenticated State
      │
      ▼
Idle State
```

---

## ✅ Input Validation & Security

The application includes several validation techniques to improve reliability and user experience.

* Prevents invalid numeric input using `hasNextInt()`.
* Prevents invalid decimal input using `hasNextDouble()`.
* Clears invalid scanner input using `scanner.next()`.
* Rejects invalid deposit amounts.
* Prevents withdrawals greater than the available balance.
* Prevents negative account balances.
* Protects account data using private fields.
* Restricts invalid operations according to the current ATM state.

---

## 📋 Banking Operations

The ATM supports the following operations:

* Check Account Balance
* Deposit Money
* Withdraw Money
* Insert Card
* Enter PIN
* Eject Card

---

## 🚀 How to Run

### Clone the Repository

```bash
git clone https://github.com/your-username/Task-3-Mubashir-Hussain.git
```

### Open the Project

Open the project using any Java IDE such as:

* NetBeans
* IntelliJ IDEA
* Eclipse

### Run the Program

Compile and run:

```text
DecodeLabs_Java_P3.java
```

---

## 📖 Java Concepts Demonstrated

* Classes and Objects
* Constructors
* Encapsulation
* Interfaces
* Method Overriding
* Polymorphism
* State Design Pattern
* Input Validation
* Exception Prevention
* Conditional Statements
* Loops
* Separation of Concerns

---

## 👨‍💻 Author

**Mubashir Hussain**

BS Software Engineering
COMSATS University Islamabad, Attock Campus

---

## 📄 License

This project was developed for learning purposes as part of the **DecodeLabs Java Internship**.
