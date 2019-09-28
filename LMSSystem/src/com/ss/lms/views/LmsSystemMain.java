/**
 * 
 */
package com.ss.lms.views;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author chiayang
 *
 */
public class LmsSystemMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Initiates the welcome page for the LMS system.
		WelcomePage();
	}

	public static void WelcomePage(){	

		System.out.println("Welcome to the Library Management System!");			

		System.out.println("1. Book");
		System.out.println("2. Author");
		System.out.println("3. Publisher");
			
		
		System.out.print("Select a category to proceed:  ");	
		
		Scanner inputValue = new Scanner(System.in);
		
		//int number;	
		
		//number = inputValue.nextInt();
		
		// Print number out for testing purpose.
		//System.out.print(number);
		
		System.out.println();
		System.out.print("After scanner object " + inputValue.nextInt());	
		
		inputValue.close();		
	}
}
