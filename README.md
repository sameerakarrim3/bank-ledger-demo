# Bank Ledger Demo

A small Java command-line project that demonstrates core ideas used in banking software: validating transactions, preventing overdrafts, using `BigDecimal` for money, and keeping an in-memory transaction history.

> Learning project only. It is not production banking software and does not persist data or handle authentication.

## Requirements

- Java 17 or newer
- Maven

## Run

From this folder, run:

```bash
mvn compile
java -cp target/classes com.example.bank.BankingApp
```

## Try it

The demo starts with account `ZA-100042` and a balance of R1500.00. Choose an option to deposit, withdraw, view the balance, or print the transaction history. Enter `0` to exit.

## Project structure

```text
src/main/java/com/example/bank/
├── BankAccount.java
├── BankingApp.java
└── Transaction.java
```

## GitHub setup

Create an empty repository on GitHub (do not add a README there), then follow the commit and push commands in the project folder:

```bash
git init
git add .
git commit -m "Create bank ledger demo"
git branch -M main
git remote add origin https://github.com/YOUR-USERNAME/bank-ledger-demo.git
git push -u origin main
```
