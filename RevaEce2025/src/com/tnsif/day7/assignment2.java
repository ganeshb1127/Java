package com.tnsif.day7;

import java.util.Scanner;

public class assignment2 {
	 double radius;
	    String color;

	    void getInput() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the radius of the circle: ");
	        radius = scanner.nextDouble();
	        System.out.print("Enter the color of the circle: ");
	        color = scanner.next();
	    }

	    void calcArea() {
	        double area = 3.141 * radius*radius;
	        System.out.printf("The area of the %s circle with radius %.2f is %.2f%n", color, radius, area);
	    }


}
