
/*	Cit130_hw4_qABCDEF.java: Assignment# 4 - CIT 130: Java Programming */

/*
	Author: Jose Paulo Garcia
	Due Date: 2/16/2015
*/

import java.util.Scanner;

public class Cit130_hw4_qABCDEF {
	public static void main(String[] args) {

		/*
			(a)The program below ask user for two input numbers and displays its sum, average, and absolute values
		*/
		int num1;	//Declaring variables
		int num2;
		int highNum;
		int lowNum;

		num1 = 0;	//Initializing variables
		num2 = 0;
		highNum = 0;
		lowNum = 0;

		Scanner input = new Scanner (System.in);

		System.out.println("");
		System.out.println("\t(a)CALCULATING AND DISPLAYING TOTAL, AVERAGE, AND ABSOLUTE VALUE OF \n\t\t\t\tTWO INPUT NUMBERS");	//Title
		System.out.println("");

		System.out.print("Please enter the first number between (-100 to 100): ");	//Ask for user input
		num1 = input.nextInt();
		System.out.print("Please enter the second number between (-100 to 100): ");
		num2 = input.nextInt();

		System.out.println("");

		System.out.println("\t\t\t\tUSER INPUT");	//Title
		System.out.println("First Number: " + num1 + "\nSecond Number: " + num2);	//Displays first number and second number by user

		if (num1 < 100 && num1 > -100 && num2 < 100 & num2 > -100) {	//Runs program if input numbers by user is between -100 to 100

			System.out.println("");
			System.out.println("\t\t\t\tDISPLAY OUTPUT");	//Title

			highNum = Math.max(num1, num2);	//Assigns the highest number and lowest number between first number and second number
			lowNum = Math.min(num1, num2);

			System.out.println("Highest Number: " + highNum + "\nLowest Number: " + lowNum);	//Displays the highest number and lowest number

			int totalNum = num1 + num2;	//Calculates sum and average of first number and second number
			double averageNum = ((double)num1 + (double)num2) / 2;
			System.out.println("The total number of " + num1 + " and " + num2 + " is: " + totalNum);	//Displays sum and average
			System.out.println("The average number of " + num1 + " and " + num2 + " is: " + averageNum);

			int absNum1 = Math.abs(num1);	//Assigns and displays absolute value of first number and second number
			int absNum2 = Math.abs(num2);
			System.out.println("Absolute Value of first number: " + absNum1);
			System.out.println("Absolute Value of second number: " + absNum2);



			/*
				b) Displaying qoutient of first number and second number given by the user. Asking user to display qoutient on
				how many decimal places. Displays error message if user input zero(0) on second number. (Below)
			*/
			System.out.println("");
			System.out.println("");
			System.out.println("\t(b)DISPLAYING QOUTIENT OF FIRST NUMBER AND SECOND NUMBER");	//Title
			System.out.println("");

			if (num2 != 0) {
				System.out.print("Please enter how many decimal places you want the qoutient to have (Ex. 2): ");
				int deciPlaces = input.nextInt();
				System.out.println("");

				double qoutient = (double)num1 / (double)num2;	//Calculation division

				System.out.print("Quotient of " + num1 + " and " + num2 + " is: ");
				System.out.printf("%."+ deciPlaces +"f",qoutient);	//Decimal places of the qoutient
			} else {
				System.out.println("ERROR MESSAGE(b): \nYou entered zero(0) on your second number. Program (b) terminated.");	//Displays error message if user inputs zero on second number
			}



			/*
				c) Generating a number between first number and second number given by the user. (Below)
			*/
			System.out.println("");	//Extra spaces
			System.out.println("");
			System.out.println("");
			System.out.println("\t(c)GENERATING RANDOM NUMBER BETWEEN FIRST NUMBER AND SECOND NUMBER");	//Title
			System.out.println("");

			if (highNum == lowNum) {
				System.out.println("The two input number by the user are the same. No generated number has been created.");
		    } else {
				int lowNum2 = lowNum + 1;
				int randomNum = (lowNum2) + (int)(Math.random()*(highNum-lowNum2));

				/* (Above)
					Example: 5 + (int)(Math.random()*10) //This code will display 5-14 including 5
					With my code it will only display between 5-10 but NOT including 5 and 10
				*/

				System.out.println("Generated random number between " + lowNum + " and " + highNum + " is: " + randomNum);	//Displays random number
			}



			/*
				(d)The program below ask user for a number and it displays its character equivalent.
			*/
			System.out.println("");	//Extra space
			System.out.println("");
			System.out.println("(d)DISPLAYING AND CONVERTING AN INPUT NUMBER TO ITS CHARACTER EQUIVALENT");	//Title
			System.out.println("");

			System.out.print("Please enter a number: ");
			int number = input.nextInt();

			System.out.println("\nCharacter Equivalent of " + number + " is: " + (char)number);	//Conversion numeric to character equivalent



			/*
				(e)The program below ask user for a singe character and it displays its numeric equivalent.
			*/
			System.out.println("");
			System.out.println("");
			System.out.println("(e)DISPLAYING AND CONVERTING AN INPUT CHARACTER TO ITS NUMERIC EQUIVALENT");	//Title
			System.out.println("");

			System.out.print("Please enter a single character (ex. A): ");
			char character = input.next().charAt(0);

			System.out.println("\nNumeric Equivalent of " + character + " is: " + (int)character);	//Conversion from character to numeric equivalent



			/*
				(f)The program below ask users first name and last name then it displays fullname, email address, and username.
			*/
			System.out.println("\n\n\t(f)DISPLAYS FULLNAME, EMAILL ADDRESS AND USERNAME");	//Title

			String space;	//Declaring variables
			String firstName;
			String lastName;

			System.out.print("_");
			space = input.nextLine();	//Fixes the bug. What happens is that this statement gets skip when run

			System.out.print("\nPlease enter your first name: ");	//Ask for users input
			firstName = input.nextLine();

			System.out.print("Please enter your last name: ");
			lastName = input.nextLine();

			int numFirst = firstName.length();	//Returns the total number of characters on a string
			int numLast = lastName.length();

			if (numFirst >= 1 && numLast >= 4) {

				System.out.println("");
				String fullName = (firstName + "." + lastName);
				String emailAddress = (firstName + "." + lastName + "@xyz.edu");	//String concantenation

				System.out.println("Fullname: " + fullName);
				System.out.println("Email Address: " + emailAddress);

				String fName = firstName.substring(0,1);	//Returns first character of the string
				String lName = lastName.substring(0,4);	//Returns first 4 characters of the string
				String flName = fName + lName;	//String concantenation
				System.out.println("Username: " + flName);
				System.out.println("");

			} else {
				System.out.println("\nERROR MESSAGE(f): Your first name MUST have at least one character and" +
				"\nyour last name MUST have at least 4 characters. Please restart program. ");	//Displays error message for user
				System.out.println("");
			}


		} else {
			System.out.println("\nERROR MESSAGE(a): \nInvalid input number detected. Number MUST be only between (-100 to 100). \nPlease restart program.\n");
			System.exit(1);	//Exits program
		}

		System.out.println(""); //Extra space
		System.out.println("");

	} //End of method
} //End of class

