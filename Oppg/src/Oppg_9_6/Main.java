package Oppg_9_6;


public class Main {

    public static void main(String[] args) {
        StopWatch timer = new StopWatch();
        int[] numbers = new int[200000];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) ((Math.random() * 100) + 1);
        }

        timer.start();
        sortArray(numbers);

        for (int i = 0; i < numbers.length; i++)
            System.out.println(numbers[i]);

        timer.stop();
        System.out.println(timer.getElapsedTime() + " ms");


    }

    public static void sortArray(int[] array) {
        for(int i = 0; i < array.length - 1; i++) {
            // Find the minimum in the list[i..list.length-1]
            int currentMin = array[i];
            int currentMinIndex = i;

            for(int j = i + 1; j < array.length; j++) {
                if(currentMin > array[j]) {
                    currentMin = array[j];
                    currentMinIndex = j;
                    }
                }

            // Swap list[i] with list[currentMinIndex] if necessary
            if(currentMinIndex != i) {
                array[currentMinIndex] = array[i];
                array[i] = currentMin;
                }
            }
        }
    }
