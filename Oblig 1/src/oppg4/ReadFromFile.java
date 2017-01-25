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
    }

    private static void getNumberOfWordsInString (String s) {

    }

}
