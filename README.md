# VaultPIN Banking System

[![Build Status](https://github.com/Nisanth-2025/VaultPIN-Banking-System/workflows/CI/badge.svg)](https://github.com/Nisanth-2025/VaultPIN-Banking-System/actions)
[![Java Version](https://img.shields.io/badge/Java-11%2B-blue.svg)](https://www.oracle.com/java/)
[![License](https://img.shields.io/badge/License-Proprietary-red.svg)](LICENSE)

A secure console-based banking management system built in Java featuring PIN-based authentication, account management, and transaction processing with professional CI/CD pipeline and code quality analysis.

## 🏗️ Technical Stack

- **Language**: Java 11+
- **Architecture**: Object-Oriented Programming with Package Structure
- **Security**: PIN-based authentication with account lockout
- **CI/CD**: GitHub Actions with multi-version testing

## 🚀 Key Features

- **Account Management**: Create accounts with secure 6-digit PIN setup
- **Authentication**: Multi-attempt login with automatic lockout protection
- **Banking Operations**: Deposit, withdraw, balance inquiry with validation
- **Transaction Processing**: Real-time balance updates with detailed receipts
- **Error Handling**: Comprehensive input validation and error management

## ⚡ Quick Start

```bash
# Clone and run
git clone https://github.com/Nisanth-2025/VaultPIN-Banking-System.git
cd VaultPIN-Banking-System

# Compile and execute
javac -d bin -cp src src/com/vaultpin/main/Bank.java src/com/vaultpin/**/*.java
java -cp bin com.vaultpin.main.Bank
```

## 📁 Project Structure

```
src/com/vaultpin/
├── account/    # Account creation and management
├── admin/      # Administrative functions  
├── main/       # Application entry point
├── ui/         # User interface components
└── user/       # Authentication and operations
```

## 💼 Professional Implementation

**Built with industry best practices:**
- Object-oriented design patterns
- Secure data handling with HashMap storage  
- Professional error handling and validation
- Clean code architecture for maintainability
- Comprehensive testing pipeline

## 📧 Contact

**Nisanth-2025** - nisanth252025@gmail.com

---