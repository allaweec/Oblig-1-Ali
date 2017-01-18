package com.company;


import java.util.Scanner;

public class time {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Skriv inn din vekt i KG: ");
        double w = input.nextDouble();
        System.out.print("Skriv inn din høyde i meter: ");
        double h = input.nextDouble();



        double bmi = w/(h*h);

        if (bmi < 18.5) {
            System.out.println("Du er undervektig");
        }else if (bmi <= 25.0) {
            System.out.println("Du er normal");
        }else if (bmi <= 30.0) {
            System.out.println("Du er overvektig");
        }else {
            System.out.println("Fedme!");
        }

    }
}
