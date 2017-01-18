package com.company;

import java.util.Scanner;


public class Oppgave3 {
    public static void main(String[] args) {
        System.out.println("Legg inn et tall");
            Scanner input = new Scanner (System.in);
                int tall1 = input.nextInt();

        System.out.println("så et tall du vil plusse det med");
            Scanner input2 = new Scanner (System.in);
                int tall2 = input2.nextInt();

        System.out.println(tall1+tall2);




    }
}
