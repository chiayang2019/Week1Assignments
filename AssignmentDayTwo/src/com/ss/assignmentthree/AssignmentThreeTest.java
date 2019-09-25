/**
 * 
 */
package com.ss.assignmentthree;

/**
 * @author chiayang
 * Assignment 3 of week 1 day 2
 * This program implements the Shape interface. 
 */

public class AssignmentThreeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Rectangle rectangle = new Rectangle(5, 6);
		Circle circle = new Circle(10);
		Triangle triangle = new Triangle(10, 10);
		
		rectangle.display();
		circle.display();
		triangle.display();
	}
}
