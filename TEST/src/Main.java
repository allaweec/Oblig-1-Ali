import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        long number = 9388576018410706L;

        int sum = 0;
        long temporaryNumber;
        while (number > 0) {
            number /= 10;
            temporaryNumber = (number % 10) * 2;
            number /= 10;
            sum += getDigit((int) temporaryNumber);
        }
        System.out.println(sum);

        number = 9388576018410706L;
        sum = 0;
        temporaryNumber = 0;
        while (number > 0) {
            temporaryNumber = number % 10;
            number /= 100;
            sum = sum + (int)temporaryNumber;
        }
        System.out.println(sum);
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
}