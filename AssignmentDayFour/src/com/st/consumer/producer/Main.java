/**
 * This program tests producer and consumers in a threading process.
 * Filename: Main.java
 * Created date: 9/27/2019
 */
package com.st.consumer.producer;

/**
 * @author chiayang
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Coin coin = new Coin();
		Producer p1 = new Producer(coin, 1);
		Consumer c1 = new Consumer(coin, 1);
		p1.start(); 
		c1.start();		
	}
}
