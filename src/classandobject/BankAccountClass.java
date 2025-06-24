package classandobject;

import java.util.Scanner;

class BankAccount {
    String accountHolder;
    String accountNumber;
    double balance;

    void setDetails(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    void displayAccountDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

public class BankAccountClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount();

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Account Number: ");
        String number = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double initialBalance = sc.nextDouble();

        account.setDetails(name, number, initialBalance);

        int choice;
        do {
            System.out.println("\n--- ATM Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Balance");
            System.out.println("4. Account Details");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double dep = sc.nextDouble();
                    account.deposit(dep);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double wit = sc.nextDouble();
                    account.withdraw(wit);
                    break;
                case 3:
                    account.displayBalance();
                    break;
                case 4:
                    account.displayAccountDetails();
                    break;
                case 5:
                    System.out.println("Thank you for using the ATM.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 5);
    }
}
