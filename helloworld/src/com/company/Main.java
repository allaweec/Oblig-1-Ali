package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Oppgave 2:

        Scanner spm = new Scanner (System.in);
        System.out.println("Klarer du dette? Svar med True/False");
        boolean svar = spm.nextBoolean();


        boolean jegKlarerDette=svar;

        if (jegKlarerDette==true) {
            System.out.println("Bra Jobba!");
        }
        else {
           System.out.println("du e dritt, lær dæ java");
        }
    }
}
