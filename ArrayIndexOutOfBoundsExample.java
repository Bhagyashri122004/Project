package Demo;

public class ArrayIndexOutOfBoundsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare an array with 5 elements
        int[] numbers = {10, 20, 30, 40, 50}; 

        try {
            
        	// Attempt to access an invalid index (index 10 is out of bounds)
            System.out.println("Accessing element at index 10: " + numbers[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            
        	// Catch and handle the exception   	
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            
        	// This block will always execute    	
            System.out.println("This is the finally block, it always executes.");
        }

	}

}

/* output:-
Exception caught: Index 10 out of bounds for length 5
This is the finally block, it always executes.
*/