package src.AreaCalculator;

public class Area {
    // Calculate area of circle
    public static double getArea(double radius) {
        return Math.PI * (radius * radius);
    }

    // Calculate area of rectangle
    public static double getArea(double width, double length) {
        return width * length;
    }

    // Calculate area of cylinder
    public static double getArea(double radius, float height) {
        return Math.PI * (radius * radius) * height;
    }
}
