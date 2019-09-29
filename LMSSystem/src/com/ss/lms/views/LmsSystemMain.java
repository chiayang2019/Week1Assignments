/**
 * 
 */
package com.ss.lms.views;

//import java.io.FileInputStream;
//import java.io.IOException;
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
		
		//Scanner scanner = new Scanner(System.in);
		Scanner scannerTask = new Scanner(System.in);
		Scanner scannerCat = new Scanner(System.in);
		
		System.out.println("Welcome to the Library Management System!\n");
		
		// TODO: Add in method to allow user to continue after an invalid selection!
		
		//int c = 0;
		String conti = "Y";
		
		do {
			System.out.println("1. Book");
			System.out.println("2. Author");
			System.out.println("3. Publisher");
			
			try {
			//boolean selectCategory = false;
			System.out.println("\nSelect a category to continue (1, 2, 3):  ");		
			
			
			int number = Integer.parseInt(scannerCat.nextLine());		
			System.out.println("You selected choice #:  " + number + "\n");	
			
			// switch statement for menu selection 
			switch(number)
			{
			   // case statements
			   // values must be of same type of expression
			   case 1:
	
				   System.out.println("you chose book!");
				   break; // break is optional
			   
			   case 2:
	
				   System.out.println("you chose author!");
				   TaskMenu authorTask = new TaskMenu();
				   authorTask.getAuthorMenu();
				   break; // break is optional
				   
			   case 3:
	
				   System.out.println("you chose publisher!");
				   break; // break is optional   			      
			      
			   // We can have any number of case statements
			   // below is default statement, used when none of the cases is true. 
			   // No break is needed in the default case.
			   default : 
				   
				   System.out.println("Please enter in a valid selection!\n");
				  
				   break; // break is optional   	
			}
			
			//scannerCat.close();	
			} catch (Exception e) {
				
				System.out.println("Invalid selection!\n");
			
			}	
			
			System.out.println("\nWould you like to continue? (Y/N)\n");
			//Scanner scannerTask = new Scanner(System.in);
			conti = scannerTask.nextLine();		
			//scannerTask.close();
			//c++;
		} while(conti =="Y");			
		
		System.out.println("Good bye!");	
		scannerTask.close();
		scannerCat.close();
		
	}
}
