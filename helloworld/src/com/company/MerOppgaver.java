package com.company;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class MerOppgaver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Skriv inn ditt navn: ");
        String navn = input.nextLine();

        System.out.print("Skriv inn din alder: ");
        int alder = input.nextInt();


        System.out.println("Ditt navn: " + navn);
        System.out.println("Din alder: " + alder);

    }
}
