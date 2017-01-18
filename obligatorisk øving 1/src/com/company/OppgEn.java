import java.util.Scanner;

// Oppgave 1 - Uttrykk

public class OppgEn {

    public static void main(String[] args) {

        System.out.println("Dette programmet vil finne gjennomsnittet av 3 tall");
        Scanner input = new Scanner(System.in);

        System.out.print("Skriv inn det første tallet: ");
            double firstNumber = input.nextDouble();

        System.out.print("Skriv inn det andre tallet: ");
            double secondNumber = input.nextDouble();

        System.out.print("Skriv inn det tredje tallet: ");
            double thirdNumber = input.nextDouble();

        double answer = (firstNumber + secondNumber + thirdNumber) / 3;

        System.out.print("Gjennomsnittet av de tre tallene er: " + answer);
    }
}
