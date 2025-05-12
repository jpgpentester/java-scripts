
/*	Cit130_hw5_q1.java: Assignment# 5 - CIT 130: Java Programming */

/*
	Author: Jose Paulo Garcia
	Due Date: 2/23/2015
*/

/*
	This program run just like a basic calculator. It can perform mathematical operation such as
	addition, subtraction, multiplication, division, and modulus.
*/


import java.util.Scanner;

	public class Cit130_hw5_q1 {
		public static void main(String[] agrs) {

			double num1;	//declaring variables
			double num2;
			double answer;
			double totalInput;
			char operator;
			String clearOutScan;
			String program;

			num1 = 0.0;	//initialization
			num2 = 0.0;
			answer = 0.0;
			totalInput = 0.0;
			program = "";

			Scanner input = new Scanner (System.in);

			System.out.println("\n\t\t\t\tBASIC CALCULATOR");	//title of program
			System.out.println("");
			System.out.println("");	//extra space

			System.out.print("Please press enter to continue. Type 'halt' when done: ");	//ask user if wants to use the program or exit
			program = input.nextLine();

			while (!program.equalsIgnoreCase("halt")) {	//while loop which stop the program if the user inputs the word "halt"

				//if (program.equals) {
					System.out.print("\nPlease enter first number: ");	//ask user for input
					num1 = input.nextDouble();

					System.out.print("Please enter second number: ");
					num2 = input.nextDouble();

					System.out.print("Please enter a mathematical operator: ");
					operator = input.next().charAt(0);

					clearOutScan = input.nextLine();	//clear out scanner

					switch (operator) {
						case '+' : answer = num1 + num2;	//addition operation
							System.out.println("");
							System.out.println(num1 + " " + operator + " " + num2 + " = " + answer);
							System.out.println(""); break;
						case '-' : answer = num1 - num2;	//subtraction operation
							System.out.println("");
							System.out.println(num1 + " " + operator + " " + num2 + " = " + answer);
							System.out.println("");	break;
						case '*' : answer = num1 * num2;	//multiplication operation
							System.out.println("");
							System.out.println(num1 + " " + operator + " " + num2 + " = " + answer);
							System.out.println("");	break;
						case '/' : answer = num1 / num2;	//division operation
							if (num2 == 0) {	//displays error message if input on second number is zero(0)
								System.out.println("\nInvalid input. Divisor(second number) can't be zero(0). Please try again.\n"); break;
							} else {
								System.out.println("");
								System.out.println(num1 + " " + operator + " " + num2 + " = " + answer);
								System.out.println(""); break;
							}
						case '%' : answer = num1 % num2;	//modulus or remainder operation
							if (num2 == 0) {	//displays error message if input on second number is zero(0)
								System.out.println("\nInvalid input. Divisor(second number) can't be zero(0). Please try again.\n"); break;
							} else {
								System.out.println("");
								System.out.println(num1 + " " + operator + " " + num2 + " = " + answer);
								System.out.println("");	break;
							}
						default: System.out.println("\nInvalid operator. Please try again. \n");	//displays error message if user inputs invalid operator
					}

					totalInput = totalInput + num1 + num2;	//sum of total inputs calculation
					System.out.print("Please press enter to use the calculator. Type 'halt' when done done: ");	//ask user if wants to continue or exit out program
					program = input.nextLine();
			}

			System.out.println("");
			System.out.println("The sum of all input numbers is: " + totalInput);	//displays total of input numbers
			System.out.println("");
			System.exit(1);	//exit system

		}	//end of method
	}	//end of class