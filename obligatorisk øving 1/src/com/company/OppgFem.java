import java.util.Scanner;

// Oppgave 5 - Sammenlign Priser

public class OppgFem {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("This program will compare prices if you shop in two different stores");

        System.out.print("Enter the name of the product: ");
            String prodName = input.nextLine();
            String prodNameLower = prodName.toLowerCase();

        System.out.print("Enter the name of the first store: ");
            String store1 = input.nextLine();
        System.out.print("Enter the name of the second store: ");
            String store2 = input.nextLine();

        System.out.print("Enter the weight of the " + prodNameLower + " from " + store1 + " (in kg): ");
            double weight1 = input.nextDouble();
        System.out.print("and the price: ");
            double price1 = input.nextDouble();

        System.out.print("Enter the weight of the " + prodNameLower + " from " + store2 + " (in kg): ");
            double weight2 = input.nextDouble();
        System.out.print("and the price: ");
            double price2 = input.nextDouble();

        double pricePrKilo1 = price1/weight1;
        double pricePrKilo2 = price2/weight2;

        double priceDiff1 = pricePrKilo2-pricePrKilo1;
        double priceDiff2 = pricePrKilo1-pricePrKilo2;

        if (pricePrKilo1 < pricePrKilo2) {
            System.out.println("The " + prodNameLower + " from " + store1 + " is cheaper then the one from " + store2);
            System.out.println("The difference in price is " + priceDiff1 + " per kilo");
        }else if (pricePrKilo1 > pricePrKilo2) {
            System.out.println("The " + prodNameLower + " from " + store2 + " is cheaper then the one from " + store1);
            System.out.println("The difference in price is " + priceDiff2 + " per kilo");
        }else if (pricePrKilo1 == pricePrKilo2) {
            System.out.println("The " + prodNameLower + " from " + store1 + " and " + store2 + " have the same price");
        }else {
            System.out.println("ERROR!");
        }
    }
}
