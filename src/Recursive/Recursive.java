package src.Recursive;

import java.util.Scanner;

public class Recursive {
    public static void main(String[] args) {
        // Declare variables
        int arrayLength, searchValue;
        int[] array;

        // Create scanner
        Scanner keyboard = new Scanner(System.in);

        // Ask for and accept input for arrayLength
        System.out.print("Enter the length of the array: ");
        arrayLength = keyboard.nextInt();

        // Set length of array
        array = new int[arrayLength];

        // For each member of array, ask for and accept input
        System.out.println("\n**Input array values**");

        for(int i = 0; i < arrayLength; i++) {
            System.out.print("Value " + (i + 1) + ": ");
            array[i] = keyboard.nextInt();
        }

        // Ask for the value user is searching for
        System.out.print("\nSearch for: ");
        searchValue = keyboard.nextInt();

        // Search for value and output message based on result
        if (Member(array, searchValue, 0))
            System.out.println("\n**Search Result**"
                    + "\ntrue: Value " + searchValue + " was found in array.");
        else
            System.out.println("\n**Search Result**"
                    + "\nfalee: Value " + searchValue + " was not found in array.");

    }

    /**
     * Search value in array
     * @param array The array that will be searched
     * @param value The value that will be searched in the array
     * @param startIndex The index from where the array starts
     * @return true if the value was found in the array, false otherwise
     */
    public static boolean Member(int[] array, int value, int startIndex) {
        // Base case: return false if the method has searched every value
        //            and the value was not found
        if (startIndex >= array.length) return false;

        // Return true if the value was found
        if (array[startIndex] == value)
            return true;
        else
            // Recursion: Continue searching through the array
            return Member(array, value, startIndex + 1);
    }
}
