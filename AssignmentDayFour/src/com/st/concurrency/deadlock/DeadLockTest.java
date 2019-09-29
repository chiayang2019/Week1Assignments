/**
 * This program tests deadlock multithreading processes.
 * Filename: DeadLockTest.java
 * Created date: 9/27/2019
 * 
 * Comments:
 * Running 'as is' will result in a deadlock.
 * To resolve deadlock, switch the process order on one of the thread.
 */
package com.st.concurrency.deadlock;

/**
 * @author chiayang
 */
public class DeadLockTest {
 
    public static void main(String[] args) {  	
        
        final ProcessOne processOne = new ProcessOne();
        final ProcessTwo processTwo = new ProcessTwo();    
    
        // Thread1
        Runnable thread1 = new Runnable() {
        	
            public void run() {
            	
                synchronized (processTwo) {   
                	try {
                        // Adding delay so that both threads can start trying to
                        // lock resources
                        Thread.sleep(100);
                       
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                	
                    // Thread1 goes to b
                    synchronized (processOne) {                       
                        System.out.println("Process successfully executed in Thread 1.");
                    }
                }
            }
        };
 
        // Thread2
        Runnable thread2 = new Runnable() {
            public void run() {
            	
                synchronized (processOne) {
                	
                    // Thread2 goes to a
                    synchronized (processTwo) {
                    	System.out.println("Process successfully executed in Thread 2.");
                    }
                }
            }
        };
 
        new Thread(thread1).start();
        new Thread(thread2).start();        
    }    
}