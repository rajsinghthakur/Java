import java.util.ArrayList;
import java.util.List;

class Account {
    private int accountNumber;
    private String name;
    private double balance;
    private String accountType;
    private String branch;

    public Account(int accountNumber, String name, double balance, String accountType, String branch) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
        this.accountType = accountType;
        this.branch = branch;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountType() {
        return accountType;
    }

    public String getBranch() {
        return branch;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (balance - amount < (accountType.equals("savings") ? 5000 : 1000)) {
            System.out.println("Withdrawal not allowed. Minimum balance requirement not met.");
            return false;
        }
        balance -= amount;
        return true;
    }

    public void displayDetails() {
        System.out.println("Account Details:");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
        System.out.println("Account Type: " + accountType);
        System.out.println("Branch: " + branch);
    }
}

class Bank {
    private List<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void createAccount(int accountNumber, String name, double balance, String accountType, String branch) {
        if (accountType.equalsIgnoreCase("savings") && balance < 5000) {
            System.out.println("Savings account requires a minimum opening balance of 5000.");
            return;
        } else if (accountType.equalsIgnoreCase("current") && balance < 1000) {
            System.out.println("Current account requires a minimum opening balance of 1000.");
            return;
        }

        Account account = new Account(accountNumber, name, balance, accountType, branch);
        accounts.add(account);
        System.out.println("Account created successfully.");
    }

    public void displayAccountDetails(int accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                account.displayDetails();
                return;
            }
        }
        System.out.println("Account not found.");
    }

    public void displayTotalMoneyDeposited() {
        double total = 0;
        for (Account account : accounts) {
            total += account.getBalance();
        }
        System.out.println("Total Money Deposited in the Bank: " + total);
    }

    public void deposit(int accountNumber, double amount) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                account.deposit(amount);
                System.out.println("Deposited " + amount + " into account " + accountNumber +
                        ". New balance: " + account.getBalance());
                return;
            }
        }
        System.out.println("Account not found.");
    }

    public void withdraw(int accountNumber, double amount) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                if (account.withdraw(amount)) {
                    System.out.println("Withdrawn " + amount + " from account " + accountNumber +
                            ". New balance: " + account.getBalance());
                }
                return;
            }
        }
        System.out.println("Account not found.");
    }
}

public class BankAc {
    public static void main(String[] args) {
        Bank bank = new Bank();

        bank.createAccount(1001, "John Doe", 7000, "savings", "Main Branch");
        bank.createAccount(1002, "Jane Smith", 1500, "current", "Downtown Branch");

        bank.displayAccountDetails(1001);
        bank.displayAccountDetails(1002);

        bank.displayTotalMoneyDeposited();

        bank.deposit(1001, 2000);
        bank.withdraw(1002, 500);

        bank.displayAccountDetails(1001);
        bank.displayAccountDetails(1002);
    }
}
