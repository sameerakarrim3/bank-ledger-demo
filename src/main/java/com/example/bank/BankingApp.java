package com.example.bank;

import java.math.BigDecimal;
import java.util.Scanner;

public class BankingApp {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("ZA-100042", new BigDecimal("1500.00"));

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Welcome to the Bank Ledger Demo");
            System.out.println("Account: " + account.getAccountNumber());

            while (true) {
                System.out.println("\n1) Deposit  2) Withdraw  3) Balance  4) History  0) Exit");
                System.out.print("Choose an option: ");
                String choice = scanner.nextLine().trim();

                if (choice.equals("0")) break;
                try {
                    switch (choice) {
                        case "1" -> {
                            System.out.print("Deposit amount: ");
                            account.deposit(new BigDecimal(scanner.nextLine().trim()));
                            System.out.println("Deposit recorded.");
                        }
                        case "2" -> {
                            System.out.print("Withdrawal amount: ");
                            account.withdraw(new BigDecimal(scanner.nextLine().trim()));
                            System.out.println("Withdrawal recorded.");
                        }
                        case "3" -> System.out.println("Balance: R" + account.getBalance());
                        case "4" -> printHistory(account);
                        default -> System.out.println("Please choose 1, 2, 3, 4, or 0.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Enter a valid amount, for example 25.50.");
                } catch (IllegalArgumentException e) {
                    System.out.println("Transaction not completed: " + e.getMessage());
                }
            }
            System.out.println("Goodbye.");
        }
    }

    private static void printHistory(BankAccount account) {
        if (account.getTransactions().isEmpty()) {
            System.out.println("No transactions yet.");
            return;
        }
        account.getTransactions().forEach(tx -> System.out.printf(
                "%s | %s | R%s | balance R%s%n",
                tx.timestamp(), tx.type(), tx.amount(), tx.balanceAfter()));
    }
}
