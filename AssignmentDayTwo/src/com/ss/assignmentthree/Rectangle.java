/**
 * 
 */
package com.ss.assignmentthree;

/**
 * @author chiayang
 *
 */
public class Rectangle implements ShapeInterface {

	private double length;
	private double width;
	
	Rectangle(double l, double w){
		length = l;
		width = w;	
	}
	
	
	@Override
	public double calculateArea() {		
		double area = length * width;
		return area;		
	}
	
	
	@Override
	public void display() {
		System.out.println("The Area of the Rectangle:  " + calculateArea());
	}
}
