/*
	Class: GeometryMain.java
	Written by: Sasha Murray
	Date: Oct 7, 2021
	Description: Calls methods from Rectangle and Polygon classes
*/

package GeometryProject;

import java.util.Scanner;

public class GeometryMain {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int c = 0;
		while (c != 3) {
			System.out.println("Enter '1' for rectangle, '2' for polygon, and '3' to quit.");
			c = s.nextInt();
			switch(c) {
				case 1:
					System.out.println("Enter the width");
					double w = s.nextDouble();
					System.out.println("Enter the length");
					double l = s.nextDouble();
					Rectangle r = new Rectangle(l, w);
					System.out.println(r + "\n");
					break;
				
				case 2:
					System.out.println("Enter the side length");
					double sideLength = s.nextDouble();
					System.out.println("Enter the number of sides");
					int n = s.nextInt();
					Polygon p = new Polygon(sideLength, n);
					System.out.println(p + "\n");
					break;
				
        case 3:
					break;
				
				default:
					System.out.println("Please enter 1, 2, or 3!");
			}
		}
		
		s.close();
	}
}
