/**
 * This page creates a consumer of the coins.
 * Filename: Consumer.java
 * Created date: 9/27/2019
 */
package com.st.consumer.producer;

/**
 * @author chiayang
 *
 */
public class Consumer extends Thread {
	private Coin coin;
	   private int number;
	   
	   public Consumer(Coin c, int number) {
	      coin = c;
	      this.number = number;
	   }
	   public void run() {
	      int value = 0;
	      for (int i = 0; i < 10; i++) {
	         value = coin.get();
	         System.out.println("Consumer #" + this.number + " got: " + value + " gold coins.");
	      }
	   }
	}