/*
	Class: Polygon.java
	Written by: Sasha Murray
	Date: Oct 7, 2021
	Description: a polygon class
*/

package GeometryProject;

public class Polygon {
	
	private double sideLength;
	private int numSides;
	
	public Polygon() {
		this(1, 3);
	}
	
	public Polygon(double sideLength, int numSides) {
		this.sideLength = sideLength;
		this.numSides = numSides;
	}
	
	// Method name: getApothem
	// Parameters: none
	// Return type: double
	// Description: finds the apothem of the polygon
	public double getApothem() {
		return sideLength/ (2 * Math.tan(Math.PI / numSides));
	}
	
	// Method name: getArea
	// Parameters: none
	// Return type: double
	// Description: finds the area of the polygon
	public double getArea() {
		return .5 * getApothem() * sideLength * numSides;
	}
	
	// Method name: getPerimeter
	// Parameters: none
	// Return type: double
	// Description: finds perimeter of the polygon
	public double getPerimeter() {
		return numSides * sideLength;
	}
	
	public String toString() {
		return String.format("Polygon[sideLength=%.2f, number of sides=%d, area=%.2f, perimeter=%.2f", 
								sideLength, numSides, getArea(), getPerimeter());
	}

	public double getSideLength() {
		return sideLength;
	}

	public void setSideLength(double sideLength) {
		this.sideLength = sideLength;
	}

	public int getNumSides() {
		return numSides;
	}

	public void setNumSides(int numSides) {
		this.numSides = numSides;
	}
	
}
