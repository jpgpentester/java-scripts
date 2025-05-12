

/* Cit130_hw2_q2.java: Assignment# 2 Question 2 - CIT 130: Java Programming */

/*
	Author: Jose Paulo Garcia
	Due Date: 2/2/2015
*/

/* This program calculates and displays the distance and slope of two points. */


import java.util.Scanner;

public class Cit130_hw2_q2 {
	public static void main(String[] agrs) {

		Double x1;	//Variables
		Double x2;
		Double y1;
		Double y2;
		Double squareRoot;
		Double distance;
		Double slope;

		x1 = 0.0;	//Initializing to zero
		x2 = 0.0;
		y1 = 0.0;
		y2 = 0.0;
		squareRoot = 0.0;
		distance = 0.0;
		slope = 0.0;

		Scanner inputNum = new Scanner (System.in);

		//Prompts user for inputs
		System.out.println("Finding the distance and slope of two points: ");
		System.out.print("Please enter a number for x1: ");
		x1 = inputNum.nextDouble();
		System.out.print("Please enter a number for y1: ");
		y1 = inputNum.nextDouble();
		System.out.print("Please enter a number for x2: ");
		x2 = inputNum.nextDouble();
		System.out.print("Please enter a number for y2: ");
		y2 = inputNum.nextDouble();

		//Outputs
		System.out.println("");
		System.out.println("Finding the distance and slope of two points: ");
		System.out.println("x1 = " + x1);
		System.out.println("y1 = " + y1);		//Displays x and y values along with the numbers given by the user
		System.out.println("x2 = " + x2);
		System.out.println("y2 = " + y2);
		System.out.println(" ");

		//Calculation on finding the distance
		System.out.println("Formula on finding the distance: ");
		System.out.println("Distance = square root of ((x2-x1)² + (y2-y1)²) ");  //Displaying formula for users
		squareRoot = Math.pow(x2-x1, 2)+ Math.pow(y2-y1, 2);
		distance = Math.pow(squareRoot, 0.5);
		System.out.println(distance + " = square root of ((" + x2 + "-" + x1 + ")² + (" + y2 + "-" + y1 + ")²)");

		//Calculation on finding the slope
		System.out.println(" ");
		System.out.println("Formula on finding the slope: ");
		System.out.println("Slope = (y2-y1)/(x2-x1) ");        //Displaying formula for users
		slope = (y2-y1)/(x2-x1);
		System.out.println(slope + " = (" + y2 + "-" + y1 + ")/(" + x2 + "-" + x1 + ")");
		System.out.println(" ");
		System.out.println(" ");	//Extra space at the bottom




	}
}