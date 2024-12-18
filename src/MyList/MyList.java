package src.MyList;

import java.util.ArrayList;

class MyList<T extends Comparable<T>> {
    // Declare private field
    ArrayList<T> list = new ArrayList<>();

    // Add item to arraylist
    public void add(T listItem) {
        list.add(listItem);
    }

    // Return largest value in array list
    public T largest() {
        // Keep track of largest value
        T largestValue = list.get(0);

        // Iterate through each item in arraylist
        for (int i = 1; i < list.size() - 1; i++) {
            // Swap largestValue if current value is larger
            if(largestValue.compareTo(list.get(i)) < 0)
                largestValue = list.get(i);
        }

        return largestValue;
    }

    // Return smallest value
    public T smallest() {
        // Keep track of smallest value
        T smallestValue = list.get(0);

        // Iterate through each item in arraylist
        for (int i = 1; i < list.size() - 1; i++) {
            // Swap smallestValue if current value is smaller
            if(smallestValue.compareTo(list.get(i)) > 0)
                smallestValue = list.get(i);
        }

        return smallestValue;
    }

    public String toStrong() {
        String array = "";

        for (T listItem : list) {
            array += listItem + ", ";
        }

        return array;
    }
}
