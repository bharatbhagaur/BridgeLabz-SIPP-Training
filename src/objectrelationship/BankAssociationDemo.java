package objectrelationship;

import java.util.ArrayList;


class Account {
 private static int nextAccountNumber = 1000;
 private int accountNumber;
 private double balance;
 private Bank bank;

 public Account(Bank bank, double initialDeposit) {
     this.accountNumber = nextAccountNumber++;
     this.balance = initialDeposit;
     this.bank = bank;
 }

 public int getAccountNumber() {
     return accountNumber;
 }

 public double getBalance() {
     return balance;
 }

 public Bank getBank() {
     return bank;
 }

 public void deposit(double amount) {
     if (amount > 0) {
         balance += amount;
     }
 }

 public void withdraw(double amount) {
     if (amount > 0 && amount <= balance) {
         balance -= amount;
     }
 }

 public void displayAccountInfo() {
     System.out.println("Account #" + accountNumber + " | Balance: $" + balance + " | Bank: " + bank.getName());
 }
}

class Customer {
 private String name;
 private ArrayList<Account> accounts;

 public Customer(String name) {
     this.name = name;
     accounts = new ArrayList<>();
 }

 public String getName() {
     return name;
 }

 public void addAccount(Account account) {
     accounts.add(account);
 }


public void viewBalance() {
     System.out.println("Customer: " + name);
     for (Account acc : accounts) {
         acc.displayAccountInfo();
     }
     System.out.println();
 }
}


class Bank {
 private String name;
 private ArrayList<Customer> customers;

 public Bank(String name) {
     this.name = name;
     customers = new ArrayList<>();
 }

 public String getName() {
     return name;
 }


 public void openAccount(Customer customer, double initialDeposit) {
     Account newAccount = new Account(this, initialDeposit);
     customer.addAccount(newAccount);

     if (!customers.contains(customer)) {
         customers.add(customer);
     }

     System.out.println("Account opened for " + customer.getName() + " at " + name);
 }

 
 public void displayCustomers() {
     System.out.println("Bank: " + name + " | Customers:");
     for (Customer c : customers) {
         System.out.println("- " + c.getName());
     }
     System.out.println();
 }
}


public class BankAssociationDemo {
 public static void main(String[] args) {

     Bank sbi = new Bank("State Bank of India");
     Bank hdfc = new Bank("HDFC Bank");


     Customer alice = new Customer("Alice");
     Customer bob = new Customer("Bob");

    
     sbi.openAccount(alice, 5000);
     sbi.openAccount(bob, 3000);
     hdfc.openAccount(alice, 10000);  

  
     alice.viewBalance();
     bob.viewBalance();

     
     sbi.displayCustomers();
     hdfc.displayCustomers();
 }
}
