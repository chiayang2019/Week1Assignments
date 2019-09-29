/**
 * This page creates a producer of the coins.
 * Filename: Producer.java
 * Created date: 9/27/2019
 */
package com.st.consumer.producer;

/**
 * @author chiayang
 *
 */
class Producer extends Thread {
	   
	private Coin coin;
	private int number;
	
	public Producer(Coin c, int number) {
	     
		coin = c;
	    this.number = number;
	} 
	   
	public void run() {
		for (int i = 0; i < 10; i++) {
			coin.put(i);
	        System.out.println("Producer #" + this.number + " put: " + i + " gold coins.");
	         
	        try {
	            sleep((int)(Math.random() * 100));
	        } catch (InterruptedException e) { }
		} 
	}
} 