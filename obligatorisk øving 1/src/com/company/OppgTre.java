package com.company;
import java.util.Scanner;

// Oppgave 3 - Stein, Saks, Papir

public class OppgTre {

    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Rock-Paper-Scissors game! Can you beat the computer?");
        int rock        = 0;
        int paper       = 1;
        int scissors    = 2;
        int choice  = 0;


        int win = 0;
        int tie = 0;
        int loss = 0;

       while (choice != 3) {

           System.out.println("Choose a number");
           System.out.println("Rock      - 0");
           System.out.println("Paper     - 1");
           System.out.println("Scissors  - 2");
           System.out.println("End game  - 3");
           System.out.print  ("Your choice: ");
           choice = input.nextInt();

           int comp = (int)(Math.random() * 3);

           if (choice >= 4) {
               System.out.println("Invalid choice! Please choose Rock(0), Paper(1) or Scissors(2)");
           } else if (choice == rock) {
               if (comp == rock) {
                   System.out.println("Rock!");
                   Thread.sleep(500);
                   System.out.println("Paper!");
                   Thread.sleep(500);
                   System.out.println("Scissors!\n");
                   Thread.sleep(1000);

                   System.out.println("You chose Rock!");
                   System.out.println("The computer chose Rock!");
                   System.out.println("TIE\n");
                   tie++;

               } else if (comp == paper) {
                   System.out.println("Rock!");
                   Thread.sleep(500);

                   System.out.println("Paper!");
                   Thread.sleep(500);

                   System.out.println("Scissors!\n");
                   Thread.sleep(1000);

                   System.out.println("You chose Rock!");
                   System.out.println("The computer chose Paper!");
                   System.out.println("LOSE\n");
                   loss++;

               } else if (comp == scissors) {
                   System.out.println("Rock!");
                   Thread.sleep(500);

                   System.out.println("Paper!");
                   Thread.sleep(500);

                   System.out.println("Scissors!\n");
                   Thread.sleep(1000);

                   System.out.println("You chose Rock!");
                   System.out.println("The computer chose Scissors!");
                   System.out.println("WIN\n");
                   win++;

               }
           } else if (choice == paper) {
               if (comp == rock) {
                   System.out.println("Rock!");
                   Thread.sleep(500);

                   System.out.println("Paper!");
                   Thread.sleep(500);

                   System.out.println("Scissors!\n");
                   Thread.sleep(1000);

                   System.out.println("You chose Paper!");
                   System.out.println("The computer chose Rock!");
                   System.out.println("WIN\n");
                   win++;

               } else if (comp == paper) {
                   System.out.println("Rock!");
                   Thread.sleep(500);

                   System.out.println("Paper!");
                   Thread.sleep(500);

                   System.out.println("Scissors!\n");
                   Thread.sleep(1000);

                   System.out.println("You chose Paper!");
                   System.out.println("The computer chose Paper!");
                   System.out.println("TIE\n");
                   tie++;

               } else if (comp == scissors) {
                   System.out.println("Rock!");
                   Thread.sleep(500);

                   System.out.println("Paper!");
                   Thread.sleep(500);

                   System.out.println("Scissors!\n");
                   Thread.sleep(1000);

                   System.out.println("You chose Paper!");
                   System.out.println("The computer chose Scissors!");
                   System.out.println("LOSE\n");
                   loss++;

               }

           } else if (choice == scissors) {

               if (comp == rock) {
                   System.out.println("Rock!");
                   Thread.sleep(500);

                   System.out.println("Paper!");
                   Thread.sleep(500);

                   System.out.println("Scissors!\n");
                   Thread.sleep(1000);

                   System.out.println("You chose Scissors!");
                   System.out.println("The computer chose Rock!");
                   System.out.println("LOSE\n");
                   loss++;

               } else if (comp == paper) {
                   System.out.println("Rock!");
                   Thread.sleep(500);

                   System.out.println("Paper!");
                   Thread.sleep(500);
                   System.out.println("Scissors!\n");
                   Thread.sleep(1000);

                   System.out.println("You chose Scissors!");
                   System.out.println("The computer chose Paper!");
                   System.out.println("WIN\n");
                   win++;

               } else if (comp == scissors) {
                   System.out.println("Rock!");
                   Thread.sleep(500);

                   System.out.println("Paper!");
                   Thread.sleep(500);

                   System.out.println("Scissors!\n");
                   Thread.sleep(1000);

                   System.out.println("You chose Scissors!");
                   System.out.println("The computer chose Scissors!");
                   System.out.println("TIE\n");
                   tie++;

               }
           }
           Thread.sleep(1000);
       }

        System.out.println("\n\n");
        System.out.println("Results:");
        System.out.println("Wins - " + win);
        System.out.println("Ties - " + tie);
        System.out.println("Losses - " + loss);



        }


    }

