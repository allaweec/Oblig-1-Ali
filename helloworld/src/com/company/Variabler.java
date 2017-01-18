package com.company;

import java.util.Scanner;

public class Variabler {
    public static void main(String[] args) {
        // Deklarert en variabel av typen integer
        int arne;


        // Deklarere og initialisere variabler
        int berit = 4;


        //Konstant (kan ikke forandres)
        final double PI = 3.14145;


        double radius1 = 4;
        double radius2 = 2;

        double area1 = 2*PI*radius1*radius1;
        double area2 = 2*PI*radius2*radius2;

        System.out.println(area1);
        System.out.println(area2);

        //Datatyper

        //Numeriske

        //heltall
        byte b = 2; //8-bit
        short s = 3; //16-bit
        int i = 200; //32-bit
        long l = 300; //64-bit

        //flyttall
        float f = 4.6f; //32-bit
        double d = 7.9; //64-bit

        System.out.println(10.0/3);

        //int i = 1;

        /*
            i = i + 1;
            samme som
            i += 4; //Fungerer med -= og *= også
        */

        System.out.println(i++);   //Printer ut i, så plusser på en
        System.out.println(i);

        System.out.println(++i);   // Plusser på en så printer ut

        int mod = 10%2;            // Gir resten av 10/2
        System.out.println(mod);

        int pow = (int) Math.pow(2,2); // 2^2, (int) betyr at vi tvinger datatypen int
        System.out.println(pow);

        Scanner input = new Scanner(System.in);

        int myInt = input.nextInt(); // Programmet stopper her og helt til vi skriver noe og trykker Enter




    }
}
