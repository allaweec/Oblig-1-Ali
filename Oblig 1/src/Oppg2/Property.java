package Oppg2;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Property {

    private String address, ownersName;
    private double valuation;
    private int squareMeters, cadastralUnitNumber, propertyUnitNumber;
    protected ArrayList<Bid> bidList;

    public Property(String address, String ownersName, double valuation, int squareMeters, int cadastralUnitNumber, int propertyUnitNumber) {
        this.address = address;
        this.ownersName = ownersName;
        this.valuation = valuation;
        this.squareMeters = squareMeters;
        this.cadastralUnitNumber = cadastralUnitNumber;
        this.propertyUnitNumber = propertyUnitNumber;

        bidList = new ArrayList<>();

    }

    protected void newBid(String name, float amount, String tel, int deadline) {
        GregorianCalendar intToCalendar = new GregorianCalendar();
        intToCalendar.add(Calendar.HOUR_OF_DAY, deadline);
        bidList.add(new Bid(name, tel, amount, intToCalendar));
    }

    public String getLastBid() {
        return "Siste Bid:\n" + bidList.get(bidList.size() - 1);
    }

    public void printAllBids() {
        System.out.println(
                "Bud gitt for eiendommen " + getAddress() + ", takst = " + getValuation() + ", gnr = " + getCadastralUnitNumber()
                        + ", bnr = " + getPropertyUnitNumber() + ":"
        );
        System.out.println("Bud gitt\t\t\t\t\t\tBud Frist\t\t\t\t\t\tNavn\t\t\tTlf\t\t\tBeløp");

        for (int i = 0; i < bidList.size(); i++) {

            System.out.println(
                    bidList.get(i).getDateGiven().getTime() + "\t" +
                    bidList.get(i).getDeadline().getTime() + "\t" +
                    bidList.get(i).getName() + "\t\t\t" +
                    bidList.get(i).getTelephone() + "\t\t\t" +
                    bidList.get(i).getAmount()
            );
        }
    }

    public String getAddress() {
        return address;
    }

    public String getOwnersName() {
        return ownersName;
    }

    public double getValuation() {
        return valuation;
    }

    public int getSquareMeters() {
        return squareMeters;
    }

    public int getCadastralUnitNumber() {
        return cadastralUnitNumber;
    }

    public int getPropertyUnitNumber() {
        return propertyUnitNumber;
    }

    public ArrayList<Bid> getBidList() {
        return bidList;
    }
}
