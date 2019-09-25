/**
 * 
 */
package com.ss.assignmenttwo;

/**
 * @author chiayang
 * Assignment 2 of Week 1 Day 1.
 * This program prints out dash lines and asterisks using loops. 
 */

public class AssignmentTwoTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {		
			
		// First for loop to print a dash line with space.
		for (int k = 0; k < 5 ; k++){
			System.out.print("-" + " ");			
		}	
			
		System.out.print('\n');		
		
		// Second for loop to print asterisks.
		for (int i = 0 ; i < 4 ; i++){
			
			for (int j = 4; j > i ; j--){
				System.out.print("*");
			}
			
			System.out.print('\n');			
		}				
	}
}