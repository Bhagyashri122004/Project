package demo;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        // User input
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        // Check if the number is a perfect number
	        if (isPerfectNumber(number)) {
	            System.out.println(number + " is a perfect number.");
	        } else {
	            System.out.println(number + " is not a perfect number.");
	        }

	        scanner.close();
	    }

	    // Method to check if a number is perfect
	    public static boolean isPerfectNumber(int num) {
	        if (num <= 1) {
	            return false; // Perfect numbers are greater than 1
	        }

	        int sum = 0;

	        // Find and sum up all divisors of the number
	        for (int i = 1; i <= num / 2; i++) {
	            if (num % i == 0) {
	                sum += i;
	            }
	        }

	        // Return true if the sum of divisors equals the number
	        return sum == num;

	}

}


/* 1.Enter a Number:28
28 is a perfect number 
2.Enter a number:5
5 is not perfect number
*/
