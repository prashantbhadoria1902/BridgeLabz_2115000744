import java.util.ArrayList;
import java.util.List;

class Bank {
    String name;
    List<Account> accounts;

    Bank(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    void openAccount(Customer customer, double initialBalance) {
        Account account = new Account(customer, this, initialBalance);
        accounts.add(account);
        customer.addAccount(account);
    }
}

class Customer {
    String name;
    List<Account> accounts;

    Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    void addAccount(Account account) {
        accounts.add(account);
    }

    void viewBalance() {
        for (Account account : accounts) {
            System.out.println("Account at " + account.bank.name + " Balance: " + account.balance);
        }
    }
}

class Account {
    Customer customer;
    Bank bank;
    double balance;

    Account(Customer customer, Bank bank, double balance) {
        this.customer = customer;
        this.bank = bank;
        this.balance = balance;
    }
}

public class BankAndAccount {
    public static void main(String[] args) {
        Bank bank = new Bank("State Bank Of India");
        Customer customer = new Customer("Prashant Bhadoria");

        bank.openAccount(customer, 1000.0);
        bank.openAccount(customer, 500.0);

        customer.viewBalance();
    }
}