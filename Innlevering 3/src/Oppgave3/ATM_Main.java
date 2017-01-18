package Oppgave3;

import java.util.Scanner;

public class ATM_Main {

    public static void main(String[] args) {

        java.util.Scanner input = new java.util.Scanner(System.in);

        Account[] accounts = new Account[10];
        for (int i = 0; i < accounts.length; i++) {
           accounts[i] = new Account(i, 100);
        }
        runATM(input, accounts);
    }

    private static void runATM (Scanner input, Account[] account) {
        int choice;

        while (true) {
            System.out.print("Enter an ID: ");
            int id = input.nextInt();

            if (id >= 10) {
                System.out.println("Incorrect ID, try again.");
                continue;
            }

            do {
                System.out.println("Main menu \n 1: Check Balance \n 2: Withdraw \n 3: Deposit \n 4: Exit \n");
                System.out.print("Your choice: ");
                choice = input.nextInt();

                if (choice >= 5 || choice == 0) {
                    System.out.println("Wrong input, try again");
                }

                switch (choice) {
                    case 1:
                        System.out.println("The balance for Bank ID " + id + " is " + account[id].getBalance() + "\n");
                        break;
                    case 2:

                        System.out.print("Enter an amount to withdraw: ");
                        double withdrawAmount = input.nextDouble();

                        account[id].withdraw(withdrawAmount);
                        System.out.println(withdrawAmount + " successfully withdrawn from Bank ID " + id + "\n");

                        break;
                    case 3:

                        System.out.print("Enter an amount to deposit: ");
                        double depositAmount = input.nextDouble();

                        account[id].deposit(depositAmount);
                        System.out.println(depositAmount + " successfully deposited to Bank ID " + id + "\n");
                        break;
                }

            } while (choice != 4);
        }
    }
}