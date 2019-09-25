/**
 * 
 */
package com.ss.assignmentone;

/**
 * @author chiayang
 * Assignment 1 of Week 1 Day 1.
 * This program prints out asterisks and dash lines using loops. 
 */
public class AssignmentOneTest {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {		
		
		// First for loop to print asterisks.
		for (int i = 1; i < 5 ; i++){
			
			for (int j = 0; j < i ; j++){
				System.out.print("*");
			}
			
			System.out.print('\n');			
		}		
		
		// Second for loop to print a dash line with space.
		for (int k = 0; k < 4 ; k++){
			System.out.print("-" + " ");			
		}	
	}
}