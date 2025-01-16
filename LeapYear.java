/* Write a Program to check leap year using if-else.*/
package Demo;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		// Create a Scanner object for user input
		Scanner scanner = new Scanner(System.in);

		// Input The Year 
		System.out.print("Enter a year: ");
		int year = scanner.nextInt();

		// Check if the year is a leap year
		if (year % 4 == 0) 
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					System.out.println(year + " is a leap year.");
				} else {
					System.out.println(year + " is not a leap year.");
				}
			} else {
				System.out.println(year + " is a leap year.");
			}
		else {
		
		System.out.println(year + " is not a leap year.");
	}

	// Close the scanner
	scanner.close();
}


}

//Enter a year:2000
//2000 is a leap year


