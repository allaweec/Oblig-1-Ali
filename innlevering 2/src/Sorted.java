import java.util.Scanner;

// Obligatorisk øving 2, oppgave 5, Exercise 7.19 (Sorted?)

public class Sorted {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements on your list: ");
        int listLength = input.nextInt();
        int[] list = new int[listLength];

        System.out.print("Enter " + listLength + " numbers with Space or Enter between each number: ");
        for (int i = 0; i < listLength; i++) {
            list[i] = input.nextInt();
        }

        if (isSorted(list))
            System.out.println("The list is already sorted");
        else
            System.out.println("The list is not sorted");
    }

    public static boolean isSorted (int[] list) {
        for (int i = 1; i < list.length; i++) {

            if (list[i - 1] <= list[i]){
                continue;
            } else
                return false;
        }
        return true;
    }
}