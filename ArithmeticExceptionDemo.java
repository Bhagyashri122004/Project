package Demo;

public class ArithmeticExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            int num1 = 10;
            int num2 = 0; // This will occurs ArithmeticException (division by zero)
            
            int result = num1 / num2; // Attempt to divide by zero
            System.out.println("Result: " + result);
        } 
		catch (ArithmeticException e)
		{
            System.out.println("Exception: Can not divided by zero");
        }

	}

}


/* Output :-
Exception: Can not divided by zero
*/