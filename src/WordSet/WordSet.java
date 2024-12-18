package src.WordSet;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class WordSet {
    public static void main(String[] args) {
        // Declare variables
        String input;

        // Declare Set where each word will be stored
        Set<String> result = new TreeSet<>();

        // Start scanner
        Scanner keyboard = new Scanner(System.in);

        // Ask and allow input
        System.out.print("Enter any sentence: ");
        input = keyboard.nextLine();

        // Split words from string
        for(String word : input.split(" ")) {
            // Add each word to TreeSet
            result.add(word);
        }

        // Create iterator
        Iterator<String> it = result.iterator();

        // Print each word in ordered list
        System.out.print("\nOrdered list: ");
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
    }
}
