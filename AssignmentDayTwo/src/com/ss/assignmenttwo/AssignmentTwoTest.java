/**
 * 
 */
package com.ss.assignmenttwo;

/**
 * @author chiayang
 * Assignment 2 of week 1 day 2
 * This program locates the max number in a double 2D array.
 * @param a two-dimensional array
 * @return location object with maxValue at position (0,0) unless a larger value is found.
 */

public class AssignmentTwoTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		double [][] array = {{1.2,6.3},{2.1,3.0},{3.2,4.5}};
		
		Cell cell = CellInterface.findHighestValue(array);
		System.out.println("The position of the max value " + cell.getValue()
		        + " is at (" + cell.getRow() + ", " + cell.getColumn() + ")");
	}
}
