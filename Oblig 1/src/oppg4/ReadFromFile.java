package oppg4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFromFile {

    public static void main(String[] args) {

        Scanner fileReader = null;
        try {
            fileReader = new Scanner(new File("src\\oppg4\\SomeFile"));
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

        ArrayList<String> fileToString = new ArrayList<>();
        while (fileReader.hasNext()) {
            fileToString.add(fileReader.next());
        }

        System.out.println("Characters: " + countCharactersInArrayList(fileToString));
        System.out.println("Words: " + fileToString.size());

    }

    private static int getNumberOfWordsInString (String s) {
        String alphabet = "abcdefghijklmnopqrstuvwxyzæøå";

        int numberOfWords = 0;
        for (int i = 0; i < s.length(); i++) {
            if (alphabet.contains(Character.toString(s.toLowerCase().charAt(i)))) {
                numberOfWords++;
            }
        }
        return numberOfWords;
    }

    private static int countCharactersInArrayList(ArrayList<String> arrayList) {
        int numberOfWords = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            numberOfWords += getNumberOfWordsInString(arrayList.get(i));
        }
        return numberOfWords;
    }

}
