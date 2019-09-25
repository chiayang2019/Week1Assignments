/**
 * 
 */
package com.ss.assignmentthree;

/**
 * @author chiayang
 *
 */
public class Circle implements ShapeInterface {
	
	private double radius;
	
	Circle(double r){
		radius = r;
	}

	@Override
	public double calculateArea() {
		double area = 3.1416 * radius * radius;
		return area;
	}

	@Override
	public void display() {
		System.out.println("The area of the circle is " + calculateArea());
	}
}
