package src.MyList;

public class Main {
    public static void main(String[] args) {
        MyList<Double> listDoubles = new MyList<>();
        MyList<String> listStrings = new MyList<>();

        double[] numbers1 = {20.1, 45.2, 89,12, 17.7, 22.53, 55.8};
        String[] strings1 = {"one", "two", "three", "four", "five", "six"};

        for (double number : numbers1) listDoubles.add(number);
        for (String string : strings1) listStrings.add(string);

        System.out.println("MyList Type Double");
        System.out.println("------------------");
        System.out.println("ArrayList: " + listDoubles.toStrong());
        System.out.println("Largest Value: " + listDoubles.largest());
        System.out.println("Smallest Value: " + listDoubles.smallest());


        System.out.println("\nMyList Type String");
        System.out.println("-------------------");
        System.out.println("ArrayList: " + listStrings.toStrong());
        System.out.println("Largest Value: " + listStrings.largest());
        System.out.println("Smallest Value: " + listStrings.smallest());
    }
}
