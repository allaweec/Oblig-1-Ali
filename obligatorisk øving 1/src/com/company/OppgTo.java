
import java.util.Scanner;

// Oppgave 2 - Krone eller Mynt

public class OppgTo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Velkommen til Krone eller Mynt spillet");

        int flip    = (int)(Math.random() * 2);

        System.out.print("Velg et tall, Krone(0) eller Mynt(1): ");
        int choice = input.nextInt();


        if (choice>=2) {
            System.out.println("Venligst velg Krone(0) eller Mynt(1), ingen andre tall!");
        }else if (choice==flip) {
            System.out.println("Datamaskinen flipper...");
            try {
                Thread.sleep(2500);                         // try-catch uttrykket er kopiert fra google
            } catch(InterruptedException ex) {              // Kilde: http://stackoverflow.com/questions/3342651/im-unable-to-use-thread-sleepx-or-wait-java-lang-interruptedexception-mus
                Thread.currentThread().interrupt();
            }
            System.out.println("Gratulerer, du vinner!");
        }else if (choice!=flip) {
            System.out.println("Datamaskinen flipper...");
            try {
                Thread.sleep(2500);
            } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            System.out.println("Desverre, du tapte!");
        }
    }
}
