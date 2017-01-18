

import java.util.Scanner;

// Oppgave 4 - Finn Ukedag

public class OppgFire {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Find out the day of the year with this program");

        System.out.print("Enter year: ");
        int year = input.nextInt();

        System.out.print("Enter month (1-12): ");
        int m = input.nextInt(); // Month

        if (m==1) {
            m = m + 12;
            year--;
        } else if (m==2) {
            m = m + 12;
            year--;
        }

        System.out.print("Enter day of the month: ");
        int q = input.nextInt();

        int k = year%100; // Year of the Century
        int j = year/100; // Century

        int h = ((q+((26*(m+1))/10)+k+(k/4)+(j/4)+5*j)%7); // Formelen fra boka

        switch (h) {
            case 0:
                System.out.println("The day is Saturday");
                break;
            case 1:
                System.out.println("The day is Sunday");
                break;
            case 2:
                System.out.println("The day is Monday");
                break;
            case 3:
                System.out.println("The day is Tuesday");
                break;
            case 4:
                System.out.println("The day is Wednesday");
                break;
            case 5:
                System.out.println("The day is Thursday");
                break;
            case 6:
                System.out.println("The day is Friday");
                break;
            default:
                System.out.println("ERROR! Invalid data given, please try again!");
        }

    }
}