/**
 * 
 */
package com.ss.assignmentone;

import java.util.Scanner;

/**
 * @author chiayang
 * Assignment 1 of week 1 day 2
 * This program calculates the sum of some input numbers.
 */

public class AssignmentOneTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {		
		
		System.out.println("Please enter a number? (enter 0 to stop)  ");
		
		Scanner inputValue = new Scanner(System.in);
		
		int number;
		int sum = 0;
		
		do {
			number = inputValue.nextInt();
			sum = sum + number;
			
		} while (number != 0);

		System.out.println("Sum of all entered numbers is:  " + sum);
		inputValue.close();
	}
}
