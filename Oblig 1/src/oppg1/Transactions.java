package oppg1;

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
                "\nAmount: " + amount +
                "\nBalance: " + balance +
                "\nDescription: " + description +
                "\nTransaction Date: " + date + "\n";
    }

}
