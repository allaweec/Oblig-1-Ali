package com.company;

import java.util.Scanner;


public class Oppgave4 {
    public static void main(String[] args) {
        System.out.println("Tast inn et tall");
            Scanner input = new Scanner(System.in);
                String tall1 = input.nextLine();

        System.out.println("+,-,*,/ ?");
            String operator = input.nextLine();

        System.out.println("Tast inn det andre tallet");
            String tall2 = input.nextLine();



        if (operator.equals("+")) {
            System.out.println(Double.parseDouble(tall1)+Double.parseDouble(tall2));
        }
        else if (operator.equals("-")) {
            System.out.println(Double.parseDouble(tall1)-Double.parseDouble(tall2));
        }
        else if (operator.equals("*")) {
            System.out.println(Double.parseDouble(tall1)*Double.parseDouble(tall2));
        }
        else {
            System.out.println(Double.parseDouble(tall1)/Double.parseDouble(tall2));
        }

    }
}
