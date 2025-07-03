package Encapsulation;

abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
        }
    }

    public abstract double calculateInterest();
}

interface Loanable {
    boolean applyForLoan(double amount);
    double calculateLoanEligibility();
}

class SavingsAccount extends BankAccount implements Loanable {
    private double interestRate;

    public SavingsAccount(String accountNumber, String holderName, double balance, double interestRate) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double calculateInterest() {
        return getBalance() * interestRate / 100;
    }

    public boolean applyForLoan(double amount) {
        return amount <= calculateLoanEligibility();
    }

    public double calculateLoanEligibility() {
        return getBalance() * 2;
    }
}

class CurrentAccount extends BankAccount implements Loanable {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, String holderName, double balance, double overdraftLimit) {
        super(accountNumber, holderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public double calculateInterest() {
        return 0;
    }

    public boolean applyForLoan(double amount) {
        return amount <= calculateLoanEligibility();
    }

    public double calculateLoanEligibility() {
        return getBalance() + overdraftLimit;
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        BankAccount[] accounts = new BankAccount[2];
        accounts[0] = new SavingsAccount("SA1001", "Alice", 50000, 4);
        accounts[1] = new CurrentAccount("CA2001", "Bob", 30000, 20000);

        for (BankAccount account : accounts) {
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Holder Name: " + account.getHolderName());
            System.out.println("Balance: " + account.getBalance());
            System.out.println("Interest: " + account.calculateInterest());

            if (account instanceof Loanable) {
                double loanEligibility = ((Loanable) account).calculateLoanEligibility();
                System.out.println("Loan Eligibility: " + loanEligibility);
                boolean approved = ((Loanable) account).applyForLoan(40000);
                System.out.println("Loan Approved: " + approved);
            }

            System.out.println();
        }
    }
}
