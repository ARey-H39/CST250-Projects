package src.CustomerEntry;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create scanner to read user input
        Scanner input = new Scanner(System.in);

        // Declare variables
        String name, address, phoneNumber;
        int customerNumber;
        boolean mailingList;

        // Ask for user inputs
        System.out.print("What is the name of the customer?: ");
        name = input.nextLine();

        System.out.print("What is the customer's address?: ");
        address = input.nextLine();

        System.out.print("What is the customer's phone number?: ");
        phoneNumber = input.nextLine();

        System.out.print("Input customer's number: ");
        customerNumber = input.nextInt();

        System.out.print("Is this customer on the mailing list? (true/false): ");
        mailingList = input.nextBoolean();

        System.out.println();

        // Create a customer object with all user inputs
        Customer customer1 = new Customer(name, address, phoneNumber,
                customerNumber, mailingList);

        // Display object
        System.out.println(customer1);
    }
}
