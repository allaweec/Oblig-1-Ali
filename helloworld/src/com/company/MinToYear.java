package com.company;

import java.util.Scanner;

public class MinToYear {
    public static void main(String[] args) {
        System.out.print("Skriv inn minutter for å gjøre om til år og dager: ");
        Scanner input = new Scanner(System.in);

        int minutes = input.nextInt();
        int years = minutes/525600;
        int restDays = (minutes/1440)%365;



        System.out.println(years + " År");
        System.out.println(restDays + " Dager");

    }
}
