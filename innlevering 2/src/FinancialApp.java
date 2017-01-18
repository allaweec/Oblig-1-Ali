import java.util.Scanner;

// Obligatorisk øving 2, oppgave 2, Exercise 6.7 (Financial app: compute future investment value)

public class FinancialApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount invested: ");
        double investmentAmount = input.nextDouble();
        System.out.print("Enter the annual intrest rate (in %): ");
        double interestRate = input.nextDouble();

        System.out.println("Year\t\t\tInvest amount");
        for (int year = 1; year <= 30; year++)
            System.out.printf(year + "\t\t\t\t" + "%1.2f%n", futureInvestmentValue(investmentAmount,interestRate,year));
    }

    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
        return investmentAmount *  Math.pow((1 + monthlyInterestRate/1200), (years * 12));
    }
}