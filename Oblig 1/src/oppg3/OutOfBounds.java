package oppg3;

import java.util.Scanner;

public class OutOfBounds {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (1 + Math.random() * 1000);
        }

        while (true) {
            System.out.print("Enter index: ");
            int index = input.nextInt();

            try {
                System.out.println(array[index]);
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("Out of Bounds");
            }
        }
    }
}