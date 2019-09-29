/**
 * This program tests the implementation of a double checked locking Singleton.
 * Filename: Main.java
 * Created Date: 9/27/2019  
 */
package com.st.concurrency.singleton;

/**
 * @author chiayang
 * @param an integer
 * @return value of an integer addition
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Not able to instantiate new objects of a Singleton class.
		// Create only a temporary variable from the Singleton getInstance method.
		DoubleCheckedLockingSingleton temp = DoubleCheckedLockingSingleton.getInstance();
		
		// Test 1
		System.out.println("Double Checked Locking Singleton Test 1:  " + temp.demoMethod(5));		
	}
}
