/**
 * This program performs a JUnit testing of a Line class.
 * Filename: LineTest.java
 * Created date: 9/27/2019
 */
package com.st.junit.linetest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;

/**
 * @author chiayang
 *
 */
public class LineTest{
	
	Line line1 = new Line(0,0,1,1);
	Line line2 = new Line(0,0,2,5);
	
	
	// Constructor to initialize variables.
	public LineTest() {		
		
	}
		
	@Before
	public void setUp() {		
	}
	
	@Test
    public void testGetSlope() {	

    	//Line line1 = new Line(0,0,1,1);		

		double actualLine1 = line1.getSlope();
		System.out.println("Slope:  " + actualLine1);		
		 
	    double expectedLine1 = 1.0;
	    
	 
	    assertEquals("The slope should be 1", expectedLine1, actualLine1, 0.0001);
	}   

	@Test
    public void testGetDistance() {	

    	//Line line1 = new Line(0,0,1,1);
				
		double actualLine1 = line1.getDistance();
		System.out.println("Distance:  " + actualLine1);
		 
	    double expectedLine1 = 1.4142;
	 
	    assertEquals("The distance should be 1.4142", expectedLine1, actualLine1, 0.0001);
	}   

	@Test
    public void testParallelTo() {	
    	
		boolean actualLine1 = line1.parallelTo(line2);
		System.out.println("Parallel:  " + actualLine1);
		 
	    boolean expectedLine1 = false;
	 
	    assertEquals("Parallel should be true", expectedLine1, actualLine1);		
	}  
	    
	@After
    public void tearDown() {
        // test method
    }            
}
