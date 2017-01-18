package com.company;

import java.util.Scanner;

public class OppgaverITimen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sktiv inn den første setningen: ");
        String first = input.nextLine().toLowerCase();


        System.out.print("Skriv inn den ander setningen: ");
        String second = input.nextLine().toLowerCase();

        if (first.contains(second)) {
            System.out.println("Den andre setningen er en del av den første");
        }else{
            System.out.println("Den andre setningen er ikke en del av den første");
        }


    }
}
