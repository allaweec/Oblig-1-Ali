package Oppg1;

import java.util.Date;

public class Transactions {

    private Date date;
    private char type;

    private double amount, balance;
    private String description;

    public Transactions(char type, double amount, double balance, String description) {
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
        date = new Date();
    }

    public String toString() {
        return "Type: " + type +
                "\n Amount: " + amount +
                "\n Balance: " + balance +
                "\n Description: " + description +
                "\n Transaction Date: " + date + "\n\n";
    }

}
