
/*	Cit130_hw6_q1 : Assignment# 6 - CIT 130: Java Programming */

/*
	Author: Jose Paulo Garcia
	Due Date: 03/09/2015
*/

//This programs have 5 different methods that does 5 different things:

// 1st: method sumInt ask user for two inputs for integer type parameter and displays total of type integer
// 2nd: method sumDouble ask user for two inputs for double type parameter and displays total of type double
// 3rd: method productDouble ask user for three inputs for double type parameter and displays product of type double
// 4th: method fullName1 ask user for first name and last name string type parameter and displays full name 5 times
/* 5th: method fullName2 ask user for first name and last name string type parameter and displays full name x number of times depending on
	what the user inputs on the integer type parameter */

import java.util.Scanner;

public class Cit130_hw6_q1 {

	////////////////////////////5 METHODS///////////////////////////

	public static int sumInt(int numInt1, int numInt2) {	//method that accepts 2 integer type parameter

		int sumInt = numInt1 + numInt2; //calculation of total type int

		return sumInt;	//returning total type integer
	}	//end of sumInt method


	public static double sumDouble(double numDouble1, double numDouble2) {	//method that accepts 2 double type parameters

		double sumDouble = numDouble1 + numDouble2;	//caalculations of total type double

		return sumDouble;
	}	//end of sumDouble method


	public static double productDouble(double numProd1, double numProd2, double numProd3) {	//method that accepts 3 double type parameters

		double productDouble = numProd1 * numProd2 * numProd3;	// calculation of product type double

		return productDouble;

	}	//end of productDouble method


	public static String fullName1(String firstName1, String lastName1) {	//method that accepts 2 string type parameters

		String fullName = firstName1 + " " + lastName1;	//adds first name and last name

		for (int i = 1; i < 5; i++) {	//for loop condition that displays name 5 times
			System.out.println(fullName);
		}

		return fullName;	//returns string type
	}	//end of fullName1 method


	public static String fullName2(String firstName2, String lastName2, int num) {	//method that accepts 2 string type and 1 integer

		String fullName = firstName2 + " " + lastName2;	//adds first name and last name

		for (int i = 1; i < num; i++) {	//for loop condition that displays the name x number of time depending on what user inputs on integer parameter
			System.out.println(fullName);	//displays name
		}

		return fullName;	//returns string type
	}	//end of fullName2 method


	//////////////////////MAIN METHOD///////////////////////////////////


	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);

		int numInt1;	//declaration
		int numInt2;

		numInt1 = 0;	//initialization
		numInt2 = 0;

		System.out.println("\nSUM OF TWO INTEGER NUMBERS\n");	//title

		System.out.print("Please enter first number: ");	//ask user for first number
		numInt1 = input.nextInt();

		System.out.print("Please enter second number: ");	//ask user for first number
		numInt2 = input.nextInt();

		System.out.println("The sum of integer type " + numInt1 + " and " + numInt2 + " is " + sumInt(numInt1, numInt2));	//displays total of two intger type number
		System.out.println("");



		System.out.println("\nSUM OF TWO NUMBERS(TYPE DOUBLE)\n");	//title

		double numDouble1;	//declaration
		double numDouble2;

		numDouble1 = 0.0;	//initialization
		numDouble2 = 0.0;

		System.out.print("Please enter first number: ");	//ask user for first number
		numDouble1 = input.nextDouble();

		System.out.print("Please enter second number: ");	//ask user for second number
		numDouble2 = input.nextDouble();

		System.out.println("The sum of double type " + numDouble1 + " and " + numDouble2 + " is " + sumDouble(numDouble1, numDouble2));	//displays total of two double type integer
		System.out.println("");



		System.out.println("\nPRODUCT OF THREE NUMBERS(TYPE DOUBLE)\n");	//title

		double numProd1;	//declaration
		double numProd2;
		double numProd3;

		numProd1 = 0.0;	//initialization
		numProd2 = 0.0;
		numProd3 = 0.0;

		System.out.print("Please enter first number: ");	//ask user for three numbers
		numProd1 = input.nextDouble();

		System.out.print("Please enter second number: ");
		numProd2 = input.nextDouble();

		System.out.print("Please enter third number: ");
		numProd3 = input.nextDouble();

		System.out.println("The product of double type " + numProd1 + " and " + numProd2 + " and " + numProd3 + "  is " + productDouble(numProd1, numProd2, numProd3));
		System.out.println("");	//above statement displays product of three double type number



		System.out.println("\nDISPLAYING USER'S NAME 5 TIMES\n");	//title

		String firstName1;	//declaration
		String lastName1;

		firstName1 = "";	//initilization
		lastName1 = "";

		input.nextLine();	//clears out the Scanner

		System.out.print("Please enter first name: ");	//ask user for first name
		firstName1 = input.nextLine();

		System.out.print("Please enter last name: ");	//ask user for last name
		lastName1 = input.nextLine();
		System.out.println("");

		System.out.println(fullName1(firstName1, lastName1));	//display full name 5 times from method fullName1
		System.out.println("");



		System.out.println("\nDISPLAYING USER'S NAME FOR X AMOUNT OF TIMES\n");	//title

		String firstName2;	//declaration
		String lastName2;
		int num;

		firstName2 = "";	//initialization
		lastName2 = "";
		num = 0;

		System.out.print("Please enter first name: ");	//ask user for input
		firstName2 = input.nextLine();

		System.out.print("Please enter last name: ");
		lastName2 = input.nextLine();

		System.out.print("Please enter a number of how many times you want to display your name: ");	//ask user for x number of times to display name
		num = input.nextInt();
		System.out.println("");

		System.out.println(fullName2(firstName2, lastName2, num));	//displays fullname x number of times depending on user input on integer parameter
		System.out.println("");	//extra line


	}	// end of main method

}	//end of class