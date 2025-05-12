
/*	Cit130_hw7_q2: Assignment# 7 - CIT 130: Java Programming */

/*
	Author: Jose Paulo Garcia
	Due Date: 03/16/2015
*/

/*
 	This program:

*/

import java.util.Scanner;

public class Cit130_hw7_q2 {

	public static double[] selectionSort(double[] arrayTestScores){

		for (int i = 0; i < arrayTestScores.length - 1; i++) {
	    	int minIndex = i;
	        for (int j = i + 1; j < arrayTestScores.length; j++)
	        	if (arrayTestScores[j] < arrayTestScores[minIndex])
	            	minIndex = j;
				double smallerNumber = arrayTestScores[minIndex];
	            arrayTestScores[minIndex] = arrayTestScores[i];
	            arrayTestScores[i] = smallerNumber;
		}
		return arrayTestScores;
	}

	public static void main(String[] args) {

		int totalNames = 0;
		int testScores = 0;
		int counter = 0;

		Scanner input = new Scanner (System.in);

		System.out.print("Please enter total number of names to input: ");
		totalNames = input.nextInt();

		double[] arrayTestScores = new double[totalNames];

		while (counter < totalNames) {
			System.out.print("Please enter test score: ");
			arrayTestScores[counter] = input.nextDouble();

			counter = counter + 1;
		}

		System.out.print(selectionSort(arrayTestScores));

	}	//end of method

}	//end of class
