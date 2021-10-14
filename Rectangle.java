/*
	Class: Rectangle.java
	Written by: Sasha Murray
	Date: Oct 7, 2021
	Description: a rectangle class
*/

package GeometryProject;

public class Rectangle {
	
	private double length;
	private double width;
	
	public Rectangle() {
		this(0, 0);
	}
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	// Method name: getArea
	// Parameters: none
	// Return type: double
	// Description: finds the area of the rectangle
	public double getArea() {
		return length * width;
	}
	
	// Method name: getPerimeter
	// Parameters: none
	// Return type: double
	// Description: finds the perimeter of the rectangle
	public double getPerimeter() {
		return 2 * length + 2 * width;
	}
	
	public String toString() {
		return String.format("Rectangle[width=%.2f, length=%.2f, area=%.2f, perimeter=%.2f", width, length, getArea(), getPerimeter());
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
}
