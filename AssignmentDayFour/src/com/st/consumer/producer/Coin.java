/**
 * This page contains synchronized methods for determining the number of coins.
 * Filename: Coin.java
 * Created date: 9/27/2019
 */
package com.st.consumer.producer;

/**
 * @author chiayang
 *
 */
class Coin {
	   
	private int contents;
	private boolean available = false;
	   
	public synchronized int get() {
		
		while (available == false) {
			
			try {
				wait();
			} catch (InterruptedException e) {}
		}
		
		available = false;
		notifyAll();
		return contents;		
	}
	   
	public synchronized void put(int value) {
		
		while (available == true) {
		         
			try {
		            wait();
			} catch (InterruptedException e) { } 
		}
		      
		contents = value;
		available = true;
		notifyAll();		   
	}
}