

/*	Cit130_hw3_q1_q2_q3.java: Assignment# 3 Question 1-3 - CIT 130: Java Programming */

/*
	Author: Jose Paulo Garcia
	Due Date: 2/9/2015
*/

/* 	This program ask user for input number between 1-10 and displays its Roman Numeral and Ordinal number counterpart.
	If user inputs out of range number it displays error message and halts the program.
	If user inputs number between 1-10 it runs the other program that generates random number between 1-10 and display its Roman Numeral and
	Ordinal number counterpart.
*/


import java.util.Scanner;

public class Cit130_hw3_q1_q2_q3 {
	public static void main(String[] agrs) {

	int number; //Declarin variable

	number = 0;  //Initialization

	Scanner input = new Scanner (System.in);

	// Displaying the number with the appropriate ordinal number

	System.out.println("");
	System.out.print("USER INPUTS A WHOLE NUMBER AND DISPLAYING ITS EQUIVALENT TO ROMAN NUMERAL \nAND ORDINAL NUMBER "); //Displays program title
	System.out.println("");
	System.out.println("");
	System.out.print("Please enter a whole number between 1-10: ");  //Ask user for input
	number = input.nextInt();
	System.out.println("");

	if (number == 1) {			//Displays Roman Numerals and Ordinal Number
		System.out.println("Number " + number + " is equivalent to Roman numeral I and Ordinal number of 1st.");
	} else if (number == 2) {
		System.out.println("Number " + number + " is equivalent to Roman numeral II and Ordinal number of 2nd.");
	} else if (number == 3) {
		System.out.println("Number " + number + " is equivalent to Roman numeral III and Ordinal number of 3rd.");
	} else if (number == 4) {
		System.out.println("Number " + number + " is equivalent to Roman numeral IV and Ordinal number of 4th.");
	} else if (number == 5) {
		System.out.println("Number " + number + " is equivalent to Roman numeral V and Ordinal number of 5th.");
	} else if (number == 6) {
		System.out.println("Numbe r" + number + " is equivalent to Roman numeral VI and Ordinal number of 6th.");
	} else if (number == 7) {
		System.out.println("Number " + number + " is equivalent to Roman numeral VII and Ordinal number of 7th.");
	} else if (number == 8) {
		System.out.println("Numbe r" + number + " is equivalent to Roman numeral VIII and Ordinal number of 8th.");
	} else if (number == 9) {
		System.out.println("Number " + number + " is equivalent to Roman numeral IX and Ordinal number of 9th.");
	} else if (number == 10) {
		System.out.println("Number " + number + " is equivalent to Roman numeral X and Ordinal number of 10th");
	} else {
		System.out.println("The number you entered is outside of range."); //Displays error message for user
	}

	System.out.println("");		//Extra spaces
	System.out.println("");
	System.out.println("");
	System.out.println("");

	int num = (int)(Math.random()*10)+1;  //Generating random number

	if (number > 0 && number <= 10) {  //Exits the program and displays error message if user input out of range number

		System.out.print("GENERATING RANDOM NUMBER AND DISPLAYING ITS ROMAN NUMERAL AND ORDINAL \nNUMBER COUNTERPART "); //Displays title of another program
		System.out.println("");
		System.out.println("");

		if (num == 0) {
			num = num + 1;	 //Adds 1 to num if generated random number is 0
			System.out.println("Generated randon number is: " + num); //Displays randon generated number
			System.out.println("");

		} else {
			System.out.println("Generated randon number is: " + num); //Displays randon generated number
			System.out.println("");
		}

		switch (num) { //Switch statement that displays Roman numeral and Ordinal number

			case 1: System.out.println("Number " + num + " is equivalent to Roman numeral I and Ordinal number of 1st."); break;
			case 2: System.out.println("Number " + num + " is equivalent to Roman numeral II and Ordinal number of 2nd."); break;
			case 3: System.out.println("Number " + num + " is equivalent to Roman numeral III and Ordinal number of 3rd."); break;
			case 4: System.out.println("Number " + num + " is equivalent to Roman numeral IV and Ordinal number of 4th."); break;
			case 5: System.out.println("Number " + num + " is equivalent to Roman numeral V and Ordinal number of 5th."); break;
			case 6: System.out.println("Number " + num + " is equivalent to Roman numeral VI and Ordinal number of 6th."); break;
			case 7: System.out.println("Number " + num + " is equivalent to Roman numeral VII and Ordinal number of 7th."); break;
			case 8: System.out.println("Number " + num + " is equivalent to Roman numeral VIII and Ordinal number of 8th."); break;
			case 9: System.out.println("Number " + num + " is equivalent to Roman numeral IX and Ordinal number of 9th."); break;
			case 10: System.out.println("Number " + num + " is equivalent to Roman numeral X and Ordinal number of 10th."); break;
		}

	} else {
		System.out.println("Please exit and restart the program."); 	//Displays error message for user
	}
	System.out.println("");		//Extra space
	System.out.println("");
	} //End of method
}// End of class