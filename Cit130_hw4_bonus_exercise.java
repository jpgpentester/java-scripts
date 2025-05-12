
/*	Cit130_hw4_bonus_exercise.java: Assignment# 4 Bonus Exercise - CIT 130: Java Programming */

/*
	Author: Jose Paulo Garcia
	Due Date: 2/16/2015
*/

//FINANCIAL APPLICATION: PAYROLL. This program calculates employees payroll

import java.util.Scanner;

public class Cit130_hw4_bonus_exercise {
	public static void main(String[] agrs) {

		Scanner input = new Scanner (System.in);

		System.out.print("Please enter employee's name (ex. Smith): ");	//Ask user for name
		String employeeName = input.nextLine().toLowerCase();

		System.out.print("Please enter number of hours work in a week (ex. 10): ");	//Ask user for hours work
		double numHoursWork = input.nextInt();

		System.out.print("Please enter hourly pay rate (ex. 9.75): ");	//Ask user for hourly pay rate
		double hourlyPayRate = input.nextDouble();

		System.out.print("Please enter federal tax withholding rate (ex. 0.20): ");	//Ask user for federal tax rate
		double fedTax = input.nextDouble();

		System.out.print("Please enter states tax withholding rate (ex: 0.09): ");	//Ask user for state tax rate
		double stateTax = input.nextDouble();

		System.out.println("");
		System.out.println("");

		System.out.println("Employee Name: " + employeeName);	//Displays output
		System.out.println("Hours Worked: " + numHoursWork);
		System.out.println("Pay Rate: $" + hourlyPayRate);

		double grossPay = numHoursWork * hourlyPayRate;	//Calcualtion of gross pay
		System.out.println("Gross Pay: " + grossPay);

		System.out.println("Deductions:");
		double percentFedTax = fedTax * 100;
		double newFedTax = grossPay * fedTax;	//Calculations of fed tax
		System.out.print(" Federal Withholding (" + percentFedTax + "%): $");
		System.out.printf("%.2f",newFedTax);

		double percentStateTax = stateTax * 100;
		double newStateTax = grossPay * stateTax;	//Calculations of state tax
		System.out.print("\n State Withholding (" + percentStateTax + "%): $");
		System.out.printf("%.2f",newStateTax);


		double totalDeduction = newFedTax + newStateTax;	//Calculations of total deduction
		System.out.print("\n Total Deductions: $");
		System.out.printf("%.2f",totalDeduction);


		double netPay = grossPay - totalDeduction;	//Calculation of net pay
		System.out.print("\nNet Pay: $");	//Displays net pay
		System.out.printf("%.2f",netPay);
		System.out.println("");	//Extra spaces
		System.out.println("");
		System.out.println("");



	}	//End of method
}	//End of class