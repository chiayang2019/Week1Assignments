/**
 * 
 */
package com.ss.assignmentthree;

/**
 * @author chiayang
 *
 */
public class Triangle implements ShapeInterface {
	
	private double base;
	private double height;
	
	Triangle(double b, double h){
		base = b;
		height = h;
	}

	@Override
	public double calculateArea() {
		double area = (base * height) / 2;
		return area;
	}

	@Override
	public void display() {
		System.out.println("The area of the Triangle is " + calculateArea());
	}
}
