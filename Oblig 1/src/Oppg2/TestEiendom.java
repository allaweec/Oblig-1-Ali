package Oppg2;

import java.util.ArrayList;
import java.util.Scanner;

public class TestEiendom {

    public static void main(String[] args) {

        //test();
        ArrayList<Eiendom> salesObject = new ArrayList<>();
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
                        System.out.println(i+1 + " - " + salesObject.get(i));
                    }
                    System.out.print("\n");
                    break;

                case 2:
                    System.out.print("Gnr: ");
                    int gnr = input.nextInt();
                    System.out.print("Bnr: ");
                    int bnr = input.nextInt();

                    for (int i = 0; i < salesObject.size(); i++) {
                        if (gnr == salesObject.get(i).getGnr() && bnr == salesObject.get(i).getBnr()) {
                            salesObject.get(i).skrivAlleBud();
                            System.out.print("\n");
                        }
                    }
                    break;

                case 3:
                    for (int i = 0; i < salesObject.size(); i++) {
                        salesObject.get(i).skrivAlleBud();
                        System.out.print("\n");
                    }
                    break;

                default:
                    System.out.println("Feil input\n");

            }

        }
    }

    private static void setupAndBid(ArrayList<Eiendom> salesObject) {
        salesObject.add(new Enebolig("Martha Støvers vei 18", "Per", 2300000,340,
                20, 410,Enebolig.FRITTSTAAENDE));
        salesObject.add(new Enebolig("Høglia 4", "Bob", 1600000, 220,
                25, 370, Enebolig.TOMANNS));
        salesObject.add(new Enebolig("Rønvika 14", "Carl", 3400000, 680,
                49, 240, Enebolig.FRITTSTAAENDE));
        salesObject.add(new Leilighet("Bjørndalslia 2", "Per", 220, 25,400,
                2000, 12000,4));
    }

    private static void test() {
        //Dette er kopiert rett fra oppgaven:

        // Oppretter et enebolig objekt
        Enebolig eb1 = new Enebolig("Marihandstien 2", "Ole Joan Olsen", 1100000, 204,
                23, 400, Enebolig.FRITTSTAAENDE);

        // Legger inn etpar bud
        eb1.nyttBud("Ole Pedersen", 2400000, "90522355", 24);
        eb1.nyttBud("John McIntosh", 2500000, "90822655", 12);

        // Lister alle bud
        eb1.skrivAlleBud(); // skrivAlleBud må OVERRIDES for hvert type salgsobjekt
        // salgsobjekt = Eiendom, Enebolig eller Leilighet
    }
}
