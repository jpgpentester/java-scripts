
/* Cit130_hw2_q1.java: Assignment# 2 Question 1 - CIT 130: Java Programming */

/*
	Author: Jose Paulo Garcia
	Due Date: 2/2/2015
*/

/* This program calculates and displays the equivalent of half-dollar, quarter, dime, and nickel to pennies. */


import java.util.Scanner;

public class Cit130_hw2_q1 {
	public static void main(String[] agrs) {

		int halfDollars;  //Variables
		int quarters;
		int dimes;
		int nickels;
		int pennies;

		halfDollars = 0;	//Initializing to zero
		quarters = 0;
		dimes = 0;
		nickels = 0;
		pennies = 0;

		Scanner numbers = new Scanner (System.in);

		//Prompts user for inputs
		System.out.println(" ");
		System.out.println("Calculating the Equivalent to Pennies: ");
		System.out.print("Please enter numbers of half-dollars, enter 0 if none (ex. 2): ");
		halfDollars = numbers.nextInt();
		System.out.print("Please enter numbers of quarters, enter 0 if none (ex. 2): ");
		quarters = numbers.nextInt();
		System.out.print("Please enter numbers of dimes, enter 0 if none (ex. 2): ");
		dimes = numbers.nextInt();
		System.out.print("Please enter numbers of nickels, enter 0 if none (ex. 2): ");
		nickels = numbers.nextInt();

		//Calculating and Finding the Equivalent to pennies
		pennies = halfDollars * 50 + quarters * 25 + dimes * 10 + nickels * 5;

		//Displaying Outputs
		System.out.println(" ");

		System.out.println("You entered " + halfDollars + " half-dollars, " + quarters + " quarters, " + dimes + " dimes, and " + nickels + " nickels which is equivalent to " + pennies + " pennies");

		System.out.println(" ");



/* Calculating the Area and Volume of a Cylinder */

/* This program calculates and displays the Area and Volume of a cylinder */

		Double radius;	//Variables
		Double length;
		Double area;
		Double volume;

		//Prompts user for input
		System.out.println("Finding Area and Volume of a Cylinder: ");
		System.out.print("Please enter the radius of the Cylinder: ");
		radius = numbers.nextDouble();
		System.out.print("Please enter the length of the Cylinder: ");
		length = numbers.nextDouble();
		System.out.println(" ");

		//Calculations on finding the Area and Volume
		area = radius * radius * Math.PI;
		volume = area * length;

		//Displaying Output
		System.out.println("Calculating the Area of a Cylinder: ");
		System.out.println("Area = " + radius + " (radius) * " + radius + " (radius) * 3.14159265359(pi)");
		System.out.println("Area = " + area);
		System.out.println(" ");
		System.out.println("Calculating the Volume of a Cylinder: ");
		System.out.println("Volume = " + area + " (area) * " + length + " (length)");
		System.out.println("Volume = " + volume);
		System.out.println(" ");
		System.out.println(" ");	//Extra space at the bottom



	}
}