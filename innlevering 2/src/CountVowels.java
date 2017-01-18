import java.util.Scanner;

// Obligatorisk øving 2, oppgave 1, Exercise 5.49 (Count vowels)

public class CountVowels {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string (English letters): ");
        String string = input.nextLine().toUpperCase();

        int vowels = 0;
        int consonants = 0;
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        for (int i = 0; string.length() > i; i++) {

            char character = string.charAt(i);
            String characterToString = Character.toString(character);

            if (!alphabet.contains(characterToString)) {
                continue;
            } else if (character == 'A'|| character == 'E' || character == 'I' || character == 'O' || character == 'U') {
                vowels++;
            } else {
                consonants++;
            }
        }
        System.out.println("The number of vowels is: " + vowels);
        System.out.println("The number of consonants is: " + consonants);
    }
}