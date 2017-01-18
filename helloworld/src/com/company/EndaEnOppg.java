package com.company;

import java.util.Scanner;

public class EndaEnOppg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Skriv inn et tall under 30: ");
        int firstNumber = input.nextInt();
        System.out.print("Skriv inn enda et tall under 30: ");
        int secondNumber = input.nextInt();

        while (firstNumber > 30 || secondNumber > 30) {
            System.out.println("UNDER 30!!!");
            System.out.print("Skriv inn et tall under 30: ");
            firstNumber = input.nextInt();
            System.out.print("Skriv inn enda et tall under 30: ");
            secondNumber = input.nextInt();
        }



    }
}
