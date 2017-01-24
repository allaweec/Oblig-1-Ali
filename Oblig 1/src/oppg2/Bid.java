package oppg2;

import java.util.GregorianCalendar;

public class Bid {

    private GregorianCalendar dateGiven, deadline;
    private float amount;
    private String name, telephone;

    public Bid(String name, String telephone, float amount, GregorianCalendar deadline) {
        this.name = name;
        this.telephone = telephone;
        this.amount = amount;

        dateGiven = new GregorianCalendar();
        this.deadline = deadline;

    }

    public GregorianCalendar getDateGiven() {
        return dateGiven;
    }

    public GregorianCalendar getDeadline() {
        return deadline;
    }

    public float getAmount() {
        return amount;
    }

    public String getName() {
        return name;
    }

    public String getTelephone() {
        return telephone;
    }

    public String toString() {
        return "Navn: " + name +
                "\nTel: " + telephone +
                "\nBeløp: " + amount +
                "\nBid Dato: " + dateGiven;
    }

}
