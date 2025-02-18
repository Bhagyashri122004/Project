package Demo;

public class MultipleCatchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int ans=45/0;
			
		}
		
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(NullPointerException e)
		{
			System.out.println("Null pointer exception");
		}
		catch(NumberFormatException e)
		{
			System.out.println("NumberFormatException");	
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException");

		}
		catch(Exception e)
		{
			System.out.println("Global Exception");

		}
		finally
		{
			System.out.println("Finally block");
		}


	}

}



/* output:-
 java.lang.ArithmeticException: / by zero
Finally block
*/
