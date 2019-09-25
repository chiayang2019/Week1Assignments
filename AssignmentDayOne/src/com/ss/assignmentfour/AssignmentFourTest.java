/**
 * 
 */
package com.ss.assignmentfour;

/**
 * @author chiayang
 * Assignment 4 of Week 1 Day 1.
 * This program prints out dash lines and an asterisk triangle using loops. 
 */

public class AssignmentFourTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Second for loop to print dash lines with spaces.
 		for (int k = 0; k < 7 ; k++){
 			System.out.print("-" + " ");			
 		}     
 		
 		System.out.println();
 		
		int space=3;        
		
        for (int i = 1; i <= 5; i++) {
           
            //Print spaces in decreasing order.
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }

            //Print Triangle with asterisks.
            for (int k = 5 ; k > i; k--) {
                System.out.print("*");                
            }
            
            //Print Triangle with asterisks.
            for (int l = 4; l > i; l--) {
                System.out.print("*");                
            }
            
            space++;

            System.out.println();
        }
	}
}
