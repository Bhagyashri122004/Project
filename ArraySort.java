package Demo;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare and initialize the array
        int[] numbers = {45, 35, 56, 67, 78, 89, 78, 12, 20};

        // Print the original array
        System.out.println("Original array: " + Arrays.toString(numbers));

        // Sort the array in ascending order
        Arrays.sort(numbers);

        // Print the sorted array
        System.out.println("Sorted array in ascending order: " + Arrays.toString(numbers));

	}

}

/* output :-
 * Original array: [45, 35, 56, 67, 78, 89, 78, 12, 20]
Sorted array in ascending order: [12, 20, 35, 45, 56, 67, 78, 78, 89]
*/
