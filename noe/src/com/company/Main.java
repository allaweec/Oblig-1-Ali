package com.company;

public class Main {
    public static void main(String args[])
    {
        int arr[] = {1,2,3,4,5,6,7,8,0,0};
        System.out.println("Forskjell største / minste = " +
                arrayInfo(arr,8,1));
        System.out.println("Sum = " + arrayInfo(arr,8,2));
        System.out.println("Snitt = " + arrayInfo(arr,8,3));
    }

    private static int arrayInfo(int[] array, int elements, int parameter) {
        int sum = 0;
        for (int i = 0; i < elements; i++ ) {
            sum += array[i];
        }


        if (parameter==1) {

        } else if (parameter==2) {
            return sum;
        } else if (parameter==3) {
            return sum/elements;
        }
        return 0;
    }

}


