package src.BubbleSort;

public class BubbleSort {
    // Show Iteration :: Bubble sort iteration counter
    private static int currentIteration;

    public static void main(String[] args) {
        // Declare array and assign values (unsorted)
        int[] array = {35, 43, 17, 10, 21, 29, 18, 39, 42, 14};

        // Display unmodified array
        System.out.println("Unsorted Array: " +
                displayArray(array, 0, array.length - 1));

        System.out.println("\n**Sorting array (Bubble Sort)**"); // Sort start message

        // Call recursive method to sort array using bubble sort
        bubbleSort(array, array.length);

        System.out.println("**Array sorted (Bubble Sort)**"); // Sort end message

        // Display sorted array
        System.out.println("\nSorted array: " +
                displayArray(array, 0, array.length - 1));
    }

    /**
     * Sort an array using bubble sort
     * @param array The array that will be sorted
     * @param arrayLength Length of array which will be used for recursion
     */
    public static void bubbleSort(int[] array, int arrayLength) {

        // Show Iteration :: Add count to iteration
        currentIteration += 1;

        // Show Iteration :: Display current iteration
        switch(currentIteration) {
            case 1:
                System.out.printf("%3dst Iteration: ", currentIteration);
                break;
            case 2:
                System.out.printf("%3dnd Iteration: ", currentIteration);
                break;
            case 3:
                System.out.printf("%3drd Iteration: ", currentIteration);
                break;
            default:
                System.out.printf("%3dth Iteration: ", currentIteration);
        }

        // Base case: Once the length of array is down to one,
        //            that means the array has been fully sorted
        if (arrayLength == 1) {
            // Show Iteration :: Display final iteration
            System.out.println(displayArray(array, 0, arrayLength - 1));
            return;
        }

        // Iterate through each index and compare it to the next index
        for (int i = 0; i < arrayLength - 1; i++) {
            // Compare values
            if(array[i] > array[i+1])
            {
                /* Swap values if current value is greater */

                // Set current value as temp
                int temp = array[i];
                // Set smaller value to current index
                array[i] = array[i + 1];
                // Move temp (larger) value to next index
                array[i + 1] = temp;
            }
        }

        // Show Iteration :: During each recall, display smaller array
        System.out.println(displayArray(array, 0, arrayLength - 1));

        // Recall method with smaller array
        // excluding the largest value that has already been sorted

        bubbleSort(array, arrayLength - 1);
    }

    /**
     * Display array as string
     * @param array The array that will be displayed
     * @param startIndex Index where array displayed will start
     * @param endIndex Index where array displayed will end
     * @return String containing all values in array as a list separated by commas
     */
    public static String displayArray(int[] array, int startIndex, int endIndex) {
        // Declare output variable
        String output = "";

        // Iterate through each value in array
        for (int i = startIndex; i <= endIndex; i++)
        {
            // Apply styling
            if (i == endIndex)
                // If reached last index, add value to string without comma
                output += array[i];
            else
                // Add value to string with comma separator
                output += array[i] + ", ";
        }

        // Return array as string
        return output;
    }
}
