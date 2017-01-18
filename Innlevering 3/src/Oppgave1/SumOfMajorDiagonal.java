package Oppgave1;

public class SumOfMajorDiagonal {

    public static void main(String[] args) {

        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Enter a 4x4 matrix row by row");
        double[][] matrix = new double[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++)
                matrix[i][j] = input.nextDouble();
        }
        System.out.println("The average of the major diagonal is " + averageMajorDiagonal(matrix, 4) );
    }

    public static double averageMajorDiagonal(double[][] matrix, int rows) {
        double sum = 0;
        for (int i = 0; i < rows; i++)
            sum += matrix[i][i];

        return sum/rows;
    }

}