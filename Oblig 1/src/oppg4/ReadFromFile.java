package oppg4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFromFile {

    public static void main(String[] args) {

        Scanner fileReader = loadFile("src\\oppg4\\SomeFile");
        ArrayList<String> fileToString = new ArrayList<>();
        while (fileReader.hasNext()) {
            fileToString.add(fileReader.next());
        }

        fileReader = loadFile("src\\oppg4\\SomeFile");;
        ArrayList<String> linesCounter = new ArrayList<>();
        while (fileReader.hasNextLine()) {
            linesCounter.add(fileReader.nextLine());
        }

        System.out.println("Characters: " + countCharactersInArrayList(fileToString));
        System.out.println("Words: " + fileToString.size());
        System.out.println("Lines: " + linesCounter.size());

    }

    private static Scanner loadFile(String path) {
        try {
            return new Scanner(new File(path));
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        return null;
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