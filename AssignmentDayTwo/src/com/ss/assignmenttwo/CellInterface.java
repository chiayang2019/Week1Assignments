/**
 * 
 */
package com.ss.assignmenttwo;

/**
 * @author chiayang
 * This page creates a cell interface with a method to find the
 * max value and location cell 
 */

public interface CellInterface {	
	
	static Cell findHighestValue(double[][] doubles) {
		
        Cell highestCell = new Cell(-1, -1, Double.MIN_VALUE);        
        for (int row = 0; row < doubles.length; row++) {
        	
            for (int column = 0; column < doubles[row].length; column++) {
            	
                double value = doubles[row][column];                
                if (value > highestCell.getValue()) {
                    highestCell = new Cell(row, column, value);
                }                
            }            
        }
        
        return highestCell;
    }
}