package oppg2;

public class Apartment extends Property {

    private double publicDebt, rent;
    private int floor;

    public Apartment(String address, String ownersName, int squareMeters,
                     int cadastralUnitNumber, int propertyUnitNumber, double publicDebt, double rent, int floor) {
        super(address, ownersName, 0, squareMeters, cadastralUnitNumber, propertyUnitNumber);
        this.publicDebt = publicDebt;
        this.rent = rent;
        this.floor = floor;
    }

    @Override
    public void printAllBids() {
        System.out.println("Bud gitt for LEILIGHET " + getAddress() + ", husleie = " + getRent() +
                ", felles gjeld = " + getPublicDebt() + ", gnr = " + getCadastralUnitNumber() + ", bnr = " + getPropertyUnitNumber() +
                ", floor = " + getFloor() + ":"
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

    public double getPublicDebt() {
        return publicDebt;
    }

    public double getRent() {
        return rent;
    }

    public int getFloor() {
        return floor;
    }

    @Override
    public String toString() {
        return "LEILIGHET " + getAddress() + ", husleie = " + getRent() +
                ", felles gjeld = " + getPublicDebt() + ", gnr = " + getCadastralUnitNumber() + ", bnr = " + getPropertyUnitNumber() +
                ", floor = " + getFloor();
    }
}
