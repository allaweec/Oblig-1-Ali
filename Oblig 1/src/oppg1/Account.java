package oppg1;

import java.util.ArrayList;
import java.util.Date;

public class Account {

    private String name;
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated;
    private ArrayList<Transactions> transactions;

    public Account() {
        dateCreated = new Date();
    }

    public Account(String name, int id, double initialBalance) {
        this.name = name;
        this.id = id;
        this.balance = initialBalance;
        dateCreated = new Date();
        transactions = new ArrayList<Transactions>();
    }

    public Account(String name, int id, double initialBalance, double annualInterestRate) {
        this.name = name;
        this.id = id;
        this.balance = initialBalance;
        this.annualInterestRate = annualInterestRate;
        dateCreated = new Date();
        transactions = new ArrayList<Transactions>();
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate / 100;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public Date getDate() {
        return dateCreated;
    }

    public double getMonthlyIntrestRate() {
        return annualInterestRate / 12;
    }

    public double getMonthlyIntrest() {
        return balance * (annualInterestRate / 12);
    }

    public String getName() {
        return name;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public ArrayList<Transactions> getTransactions() {
        return transactions;
    }

    public void withdraw(double amount) {
        balance -= amount;
        transactions.add(new Transactions('W', amount, balance, "Withdrew " + amount));
    }

    public void deposit(double amount) {
        balance += amount;
        transactions.add(new Transactions('D',amount,balance,"Deposited " + amount));
    }

}
