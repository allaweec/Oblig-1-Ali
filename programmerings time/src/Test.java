import java.util.Scanner;

public class Test {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Skriv inn antall timer: ");

        while (true) {
            int antallTimer = input.nextInt();

            System.out.println(beregnAvgift(antallTimer));
        }


    }

    static double beregnAvgift(int antallTimer) {
        int sum = 0;
        int antallDogn = antallTimer / 24;
        if (antallDogn >= 1) {
            antallTimer %= 24;
        }

        while (antallDogn <= 0) {
            sum += 180;
            antallDogn-= 1;
        }


        return sum;
    }
}
