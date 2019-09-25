/**
 * 
 */
package com.ss.assignmenttwo;

/**
 * @author chiayang
 * This page creates Get and Set methods for the max value and cell location.
 */
public class Cell {
	
	private int row;
	private int column;
	private double value;
	
	// Constructor with three parameter.
	public Cell(int row, int column, double value) {
		this.row = row;
		this.column = column;
		this.value = value;		
	}

	public int getRow() {
        return row + 1;
    }

    public void setRow(int row) {
        this.row = row;
    }
    
    public int getColumn() {
        return column + 1;
    }

    public void setColumn(int col) {
        this.column = col;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }    
}
