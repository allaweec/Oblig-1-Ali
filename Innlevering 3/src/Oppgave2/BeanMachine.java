package Oppgave2;

import java.util.Arrays;

public class BeanMachine {

    public static void main(String[] args) {

        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Enter the number of balls to drop: ");
        int numberOfBalls = input.nextInt();

        System.out.print("Enter the number of slots in the bean machine: ");
        int numberOfSlots = input.nextInt();

        int[] slotsCounter = new int[numberOfSlots];

        playBeanMachine(slotsCounter, numberOfBalls);
    }


    public static void playBeanMachine(int[] slotsCounter, int numberOfBalls) {
        int rightCount;

        for (int i = 0; i < numberOfBalls; i++) {
            rightCount = 0;

            for (int j = 0; j < slotsCounter.length - 1; j++) {

                int leftOrRight = (int) (Math.random() * 2);

                if (leftOrRight == 0) {
                    System.out.print("L");
                } else {
                    System.out.print("R");
                    rightCount++;
                }
            }

            slotsCounter[rightCount] += 1;
            System.out.print("\n");

        }

        displayFinalBuildup(slotsCounter);
    }

    public static void displayFinalBuildup(int[] slotsCounter) {

        String[][] finalBuildup = setupFinalBuildupArray(slotsCounter);

        for(int i = 0; i < finalBuildup.length; i++) {

            for(int j = 0; j < finalBuildup[i].length; j++)
                System.out.print(finalBuildup[i][j] + " ");

            System.out.print("\n");
        }
    }


    /**
    Denne metoden lager først en to-dimensjonal array som har høyden lik den høyeste verdien i int[] slotsCounter
    arrayen som da skal innholde alle "ballene".
    Metoden setter alle plassene i arrayen lik " " (Space) og deretter teller hvor mange av
    ballene som ligger i arrayen int[] slotsCounter legger inn en "O" for hver "ball" i int[] slotsCounter arrayen helt til
    alle plasseringene er tomme (== 0).
    */
    public static String[][] setupFinalBuildupArray(int[] slotsCounter) {

        String[][] finalBuildupArray = new String[highestValueInArray(slotsCounter)][slotsCounter.length];

        for (int i = 0; i < finalBuildupArray.length; i++) {
            for (int j = 0; j < finalBuildupArray[i].length; j++) {
                finalBuildupArray[i][j] = " ";
            }
        }

        for (int i = highestValueInArray(slotsCounter) - 1; i >= 0; i--) {
            for (int j = 0; j < slotsCounter.length; j++) {

                if (slotsCounter[j] > 0) {
                    finalBuildupArray[i][j] = "O";
                    slotsCounter[j]--;
                }
            }
        }
        return finalBuildupArray;
    }

    public static int highestValueInArray(int[] array) {
        return Arrays.stream(array).max().getAsInt(); // <-- Fant dette på google
    }

}