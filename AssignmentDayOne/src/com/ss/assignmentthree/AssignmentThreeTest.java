/**
 * 
 */
package com.ss.assignmentthree;

/**
 * @author chiayang
 * Assignment 3 of Week 1 Day 1.
 * This program prints out an asterisk triangle and dash lines using loops. 
 */

public class AssignmentThreeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {		
		
		int space=6;        

        for (int i = 1; i < 5; i++) {
           
            //Print spaces in decreasing order.
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }

            //Print Triangle with asterisks.
            for (int k = 1; k <= i; k++) {
                System.out.print("*");                
            }
            
            //Print Triangle with asterisks.
            for (int l = 2; l <= i; l++) {
                System.out.print("*");                
            }
            
            space--;

            System.out.println();
        }
        
        // Second for loop to print dash lines with spaces.
 		for (int k = 0; k < 7 ; k++){
 			System.out.print("-" + " ");			
 		}       
	}
}