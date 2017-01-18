import java.util.Scanner;

// Obligatorisk øving 2, oppgave 4, Exercise 6.31 (Credit number verification)

public class CreditNumberVerification {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a credit card number between 13 and 16 digits: ");
        long number = input.nextLong();
        String numberConverted = Long.toString(number);

        if (numberConverted.length() >= 13 && numberConverted.length() <= 16 ) {

            if (isValid(number))
                System.out.println("The credit card number is valid!");
            else
                System.out.println("The credit card number is invalid!");

        } else if (numberConverted.length() > 16) {
            System.out.println("Credit card number is invalid (too long)!");
        } else if (numberConverted.length() < 13) {
            System.out.println("Credit card number is invalid (too short)!");
        }
    }

    public static boolean isValid(long number) {

        if ((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0)
            if (prefixMatched(number, 4) || prefixMatched(number, 5) || prefixMatched(number, 6) || prefixMatched(number, 37))
            return true;

        return false;
    }

    public static int sumOfDoubleEvenPlace(long number) {

        int sum = 0;
        long temporaryNumber;
        while (number > 0) {
            number /= 10;
            temporaryNumber = (number % 10) * 2;
            number /= 10;
            sum = sum + getDigit((int) temporaryNumber);
        }
        return sum;
    }

    public static int getDigit (int number) {
        int sum;
        int rest;

        if (number >= 10) {
            rest = number % 10;
            number /= 10;
            sum = rest + number;
        } else {
            sum = number;
        }
        return sum;
    }

    public static int sumOfOddPlace(long number) {
        int sum = 0;
        long temporaryNumber;
        while (number > 0) {
            temporaryNumber = number % 10;
            number /= 100;
            sum = sum + (int)temporaryNumber;
        }
        return sum;
    }

    public static boolean prefixMatched(long number, int d) {
        if (d >= 10 && d < 100) {
            if (getPrefix(number, 2) == d)
                return true;

        } else if (d < 10) {
            if (getPrefix(number, 1) == d)
                return true;
        }
        return false;
    }



    public static int getSize(long d) {
        String converted = Long.toString(d);
        return converted.length();
    }

    public static long getPrefix(long number, int k) {

        if (k < getSize(number))
            return (long) (number / Math.pow(10, getSize(number) - k) );

        return number;
    }
}