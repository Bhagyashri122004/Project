/* Write a program to check candidate eligible for voting or not*/

package Demo;

import java.util.Scanner;

public class CandidateVote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        // Input the age of the candidate
	        System.out.print("Enter your age: ");
	        int age = scanner.nextInt();

	        // Check if the candidate is eligible to vote
	        if (age >= 18) {
	            System.out.println("You are eligible to vote.");
	        } else {
	            System.out.println("You are not eligible to vote. You need to be at least 18 years old.");
	        }
	        //close the scanner
	        scanner.close();
	    }
	
}

/* 1.Enter your age:22
 *You are eligible to vote.
 *2.Enter your age:9
 *You are not eligible to vote. You need to be at least 18 years old.
 */

