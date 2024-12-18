package src.TestScores;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create scanner
        Scanner keyboard = new Scanner(System.in);

        // Declare variables
        double[] testScores;
        int numTests;

        // Create an object of TestScore
        TestScores tests;

        // Ask for user input
        System.out.print("How many test scores will you type in: ");
        numTests = keyboard.nextInt();

        // Create an array based on user input
        testScores = new double[numTests];

        System.out.println("\n**Input test scores**");
        // Based on the array size, ask for that many inputs
        for (int i = 0; i < numTests; i++) {
            System.out.print("Test " + (i + 1) + ": ");

            testScores[i] = keyboard.nextDouble();
        }

        // Pass array to object
        tests = new TestScores(testScores);

        // Display average, and check for exceptions
        System.out.println("\n**Average Score**");
        try {
            System.out.println(tests.average());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
