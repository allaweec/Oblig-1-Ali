package oppg2;

public class DetachedHouse extends Property {

    public static final int SINGEL_FAMILY = 1;
    public static final int TERRACED = 2;
    public static final int DUPLEX = 3;
    private int type;

    public DetachedHouse(String address, String ownersName, double valuation,
                         int squareMeters, int cadastralUnitNumber, int propertyUnitNumber, int type) {
        super(address, ownersName, valuation, squareMeters, cadastralUnitNumber, propertyUnitNumber);
        this.type = type;
    }

    @Override
    public void printAllBids() {
        System.out.println(
                "bud gitt for ENEBOLIG " + getAddress() + ", takst = " + getValuation() + ", gnr = " + getCadastralUnitNumber()
                + ", bnr = " + getPropertyUnitNumber() + ", type = " + getTypeAsString() + ":"
        );

        System.out.println("Bud gitt\t\t\t\t\t\tBud Frist\t\t\t\t\t\tNavn\t\t\tTlf\t\t\t\t\tBeløp");
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

    protected String getTypeAsString() {
        if (type == 1)
            return "Frittstående";
        else if (type == 2)
            return "Rekke";
        else if (type == 3)
            return "Tomanns";
        else
            return "Feil ved systemet, vennligst kontakt " + getOwnersName();
    }

    @Override
    public String toString() {
        return "ENEBOLIG " + getAddress() + ", takst = " + getValuation() + ", gnr = " + getCadastralUnitNumber()
                + ", bnr = " + getPropertyUnitNumber() + ", type = " + getTypeAsString();
    }
}
