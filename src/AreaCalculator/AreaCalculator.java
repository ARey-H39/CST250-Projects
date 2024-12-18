package src.AreaCalculator;

import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
        boolean run = true;
        while (run) run = displayMenu();
    }

    private static boolean displayMenu() {
        Scanner in = new Scanner(System.in);
        System.out.println("Area calculator");
        System.out.println("1. Calculate area of circle");
        System.out.println("2. Calculate ares of rectangle");
        System.out.println("3. Calculate ares of cylinder");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        switch (in.nextInt()) {
            case 1:
                circleCalculator();
                break;
            case 2:
                rectangleCalculator();
                break;
            case 3:
                cylinderCalculator();
                break;
            case 4:
                return false;
            default:
                System.out.println("Invalid choice");
        }
        return true;
    }

    private static void circleCalculator() {
        double radius;
        Scanner input = new Scanner(System.in);

        // Accept user inputs
        System.out.println("\nCalculate area of circle.");
        System.out.print("Radius: ");
        radius = input.nextDouble();
        // Print area of circle
        System.out.println("The area of the circle is " + Area.getArea(radius) + "\n");
    }

    private static void rectangleCalculator() {
        double width, length;
        Scanner input = new Scanner(System.in);

        // Accept user inputs
        System.out.println("\nCalculate ares of rectangle.");
        System.out.print("Width: ");
        width = input.nextDouble();
        System.out.print("Length: ");
        length = input.nextDouble();
        // Print area of rectangle
        System.out.println("The area of the rectangle is " + Area.getArea(width, length) + "\n");
    }

    private static void cylinderCalculator() {
        double radius;
        float height;
        Scanner input = new Scanner(System.in);

        // Accept user inputs
        System.out.println("\nCalculate area of cylinder.");
        System.out.print("Radius: ");
        radius = input.nextDouble();
        System.out.print("Height: ");
        height = input.nextFloat();
        // Print area of cylinder
        System.out.println("The area of the cylinder is " + Area.getArea(radius, height) + "\n");
    }
}
