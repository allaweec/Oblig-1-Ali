package com.company;

import java.util.Scanner;

public class Celsiusconverter {
    public static void main(String[] args) {
        System.out.println ("Gjør om fahrenheit til celsius");
        System.out.print ("Skriv inn fahrenheit: ");
        Scanner input = new Scanner(System.in);
        double fahrenheit = input.nextDouble();
        double celsius = (5.0/9)*(fahrenheit-32);
        System.out.println ("Celsius: " + celsius);
    }
}
