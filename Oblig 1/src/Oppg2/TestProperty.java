package Oppg2;

import java.util.ArrayList;
import java.util.Scanner;

public class TestProperty {

    public static void main(String[] args) {

        //test();
        ArrayList<Property> salesObject = new ArrayList<>();
        setupAndBid(salesObject);

        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print(
                    "Eiendomsutforskeren:\n" +
                    "1 - Vis alle tilgjengelige eiendommer\n" +
                    "2 - gnr og bnr bud søk\n" +
                    "3 - Vis alle bud\n" +
                    "Ditt valg: "
            );

            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    for (int i = 0; i < salesObject.size(); i++) {
                        System.out.println("#" + (i+1) + " " + salesObject.get(i));
                    }
                    System.out.print("\n");
                    break;

                case 2:
                    System.out.print("Gnr: ");
                        int gnr = input.nextInt();
                    System.out.print("Bnr: ");
                        int bnr = input.nextInt();

                    for (int i = 0; i < salesObject.size(); i++) {
                        if (gnr == salesObject.get(i).getCadastralUnitNumber() && bnr == salesObject.get(i).getPropertyUnitNumber()) {
                            salesObject.get(i).printAllBids();
                            System.out.print("\n");
                        }
                    }
                    break;

                case 3:
                    for (int i = 0; i < salesObject.size(); i++) {
                        salesObject.get(i).printAllBids();
                        System.out.print("\n");
                    }
                    break;

                default:
                    System.out.println("Feil input\n");

            }

        }
    }

    private static void setupAndBid(ArrayList<Property> salesObject) {
        salesObject.add(new DetachedHouse("Martha Støvers vei 18", "Per", 2300000,340,
                20, 410, DetachedHouse.SINGEL_FAMILY));
        salesObject.add(new DetachedHouse("Høglia 4", "Bob", 1600000, 220,
                25, 370, DetachedHouse.DUPLEX));
        salesObject.add(new DetachedHouse("Rønvika 14", "Carl", 3400000, 680,
                49, 240, DetachedHouse.SINGEL_FAMILY));
        salesObject.add(new Apartment("Bjørndalslia 2", "Per", 220, 25,400,
                2000, 12000,4));
        salesObject.get(0).newBid("Clarke", 2000000, "41383838", 12);
        salesObject.get(0).newBid("Lars", 2300000, "41383890", 12);
        salesObject.get(0).newBid("Erik", 2600000, "41349438", 12);
        salesObject.get(1).newBid("Anders", 1900000, "91849387", 64);
        salesObject.get(1).newBid("Magnus", 2100000, "41383833", 64);
        salesObject.get(1).newBid("Joakim", 1700000, "41388747", 64);
        salesObject.get(2).newBid("Marte", 4000000, "41375938", 38);
        salesObject.get(2).newBid("Alex", 3400000, "41438843", 38);
        salesObject.get(2).newBid("Ahmed", 3800000, "41574833", 38);
        salesObject.get(3).newBid("Dimitri", 12000, "41381843", 24);
        salesObject.get(3).newBid("Rose", 13000, "41778987", 24);
        salesObject.get(3).newBid("Knut", 11500, "41098356", 24);
    }

    private static void test() {
        //Dette er kopiert rett fra oppgaven:

        // Oppretter et enebolig objekt
        DetachedHouse eb1 = new DetachedHouse("Marihandstien 2", "Ole Joan Olsen", 1100000, 204,
                23, 400, DetachedHouse.SINGEL_FAMILY);

        // Legger inn etpar bud
        eb1.newBid("Ole Pedersen", 2400000, "90522355", 24);
        eb1.newBid("John McIntosh", 2500000, "90822655", 12);

        // Lister alle bud
        eb1.printAllBids(); // printAllBids må OVERRIDES for hvert type salgsobjekt
        // salgsobjekt = Property, DetachedHouse eller Apartment
    }
}
