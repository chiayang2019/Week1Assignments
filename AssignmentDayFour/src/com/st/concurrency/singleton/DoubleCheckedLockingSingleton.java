/**
 * This page implements a double checked locking Singleton.
 * Filename: DoubleCheckedLockingSingleton.java
 * Created Date: 9/27/2019  
 */
package com.st.concurrency.singleton;

/**
 * @author chiayang 
 */
public class DoubleCheckedLockingSingleton {
	
	private static volatile DoubleCheckedLockingSingleton _instance;
	
	private DoubleCheckedLockingSingleton() {
	      // Exists only to stop instantiation.
	}
	
	public static DoubleCheckedLockingSingleton getInstance() {
		
		if (_instance == null) { // Single checked 
			synchronized (DoubleCheckedLockingSingleton.class) { 
				if (_instance == null) { // Double checked 
					_instance = new DoubleCheckedLockingSingleton(); 
				} 
			} 
		}
		
		return _instance;
	}	
	
	// Method protected by singleton
	protected int demoMethod(int number) {
	   
		int x = number;
		x = x * 2;
		
		return x;      
	}
}
