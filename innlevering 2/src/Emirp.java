// Obligatorisk øving 2, oppgave 3, Exercise 6.27 (Emirps)

public class Emirp {

    public static void main(String[] args) {
        printEmirps(100);
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    static int reversal(int number) {                // PS! Fant formelen for å reversere tall på google.
        int reversedNumber = 0;
        int temp;

        while (number > 0) {
            temp = number % 10;
            reversedNumber = reversedNumber * 10 + temp;
            number = number / 10;
        }
        return reversedNumber;
    }

    static boolean isPalindrome(int number) {
       return (reversal(number) != number);
    }

    public static void printEmirps(int numberOfEmirps) {
        int count = 0;
        int emirpCheck = 0;

        while (count < numberOfEmirps) {
            if (isPrime(emirpCheck) && isPrime(reversal(emirpCheck)) && isPalindrome(emirpCheck)) {
                System.out.print(emirpCheck + " ");
                emirpCheck++;
                count++;

                if (count % 10 == 0) {
                    System.out.print("\n");
                }

            } else {
                emirpCheck++;
            }
        }
    }
}