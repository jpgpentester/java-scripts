
/*	Cit130_hw7_q1: Assignment# 7 - CIT 130: Java Programming */

/*
	Author: Jose Paulo Garcia
	Due Date: 03/16/2015
*/

/*
 	This program:
 		1. Lets user input scores of specified number of student.
 		2. Displays scores of students.
 		3. Calculates and display average score.
 		4. Displays student scores together with its letter grade equivalent.
 		5. Ask user what test score to find and display its location. Displays message if not found.
*/

import java.util.Scanner;

public class Cit130_hw7_q1 {
	public static void main(String[] args) {

		int totalStudents;	//initialization
		int student;
		int count;
		double totalTestScore;
		double aveTestScore;
		double lowGrade;
		double highGrade;

		totalStudents = 0;	//declaration
		student = 0;
		count = 1;
		totalTestScore = 0.0;
		aveTestScore = 0.0;
		lowGrade = 100.0;
		highGrade = 0.0;

		System.out.println("\n\n\t\t\tSTUDENT GRADES PROGRAM\n\n");	//title

		Scanner input = new Scanner (System.in);

		System.out.print("Please enter a number of students: ");	//ask user for input number of students
		totalStudents = input.nextInt();

		double[] arrayGrade = new double[totalStudents];	//creating array

		System.out.println("");	//extra space

		while (student < totalStudents) {
			System.out.print("Please enter grade for student " + count + ": ");	//uses while loop to ask grade for each student
			arrayGrade[student] = input.nextDouble();

			if (arrayGrade[student] >= highGrade) {	//finding highest grade
				highGrade = arrayGrade[student];
			} else {
				System.out.print("");	//extra spaces
			}

			if (arrayGrade[student] <= lowGrade) {	//finding lowest grade
				lowGrade = arrayGrade[student];
			} else {
				System.out.print("");	//extra spaces
			}

			totalTestScore = totalTestScore + arrayGrade[student];	//calculating total test score of all students grade

			student = student + 1;	//counter
			count = count + 1;
		}



		System.out.println("\n\n\t\t\tSTUDENT GRADES BREAKDOWN:\n");	//title

		System.out.println("\nNumber of students: " + totalStudents); //display number of students

		System.out.print("");
		System.out.print("Scores: ");

		student = 0;	//re-initializing

		while (student < totalStudents) {
			System.out.print(arrayGrade[student] + ", ");	//display scores inputted by user
			student = student + 1;
		}

		System.out.println("\nBest score: " + highGrade);	//displaying highest score


		System.out.println("");

		student = 0; //re-initializing
		count = 1;

		while (student < totalStudents) {	//displaying test scores and its letter grade equivalent

			if (arrayGrade[student] >= highGrade - 10) {
				System.out.println("Student " + count + " scored " + arrayGrade[student] + ", grade is: A ");
			} else if (arrayGrade[student] >= highGrade - 20) {
				System.out.println("Student " + count + " scored " + arrayGrade[student] + ", grade is: B ");
			} else if (arrayGrade[student] >= highGrade - 30) {
				System.out.println("Student " + count + " scored " + arrayGrade[student] + ", grade is: C ");
			} else if (arrayGrade[student] >= highGrade - 40) {
				System.out.println("Student " + count + " scored " + arrayGrade[student] + ", grade is: D ");
			} else {
				System.out.println("Student " + count + " scored " + arrayGrade[student] + ", grade is: F ");
			}

			student = student + 1;	//counter
			count = count + 1;
		}


		//calculating and displaying average test score

		aveTestScore = totalTestScore / totalStudents;
		System.out.println("\nThe average test score is: " + aveTestScore);



		System.out.println("");
		System.out.println("\n\t\t\tFINDING LOCATION OF TEST SCORE\n\n"); //title

		double findGrade = -1.0; //declaration
		int notFound;

		student = 0;	//initialization
		count = 1;
		notFound = 0;
		findGrade = -1.0

		System.out.print("Please enter the test score you want to find or enter -1 to exit: "); //ask user to input test score to locate and exits if user entered -1
		findGrade = input.nextDouble();

		while (findGrade != -1.0) {

			while (student < totalStudents) {

				if (findGrade == arrayGrade[student]) {
					System.out.println("\nThe test score you entered is found on student " + count); //displaying test score that has been found
					System.out.println("\n");
				} else {
					System.out.print("");
					notFound = notFound + 1;
				}


				if (notFound == totalStudents) {	//displays not found if notFound total with totalStudents
					System.out.println("\nThe test score you entered is not found on any student. Please try again. ");
					System.out.println("\n");
				} else {
					System.out.print("");
				}


				student = student + 1;	//counter
				count = count + 1;
			}
			System.out.println("");
			System.out.print("Please enter the test score you want to find or enter -1 to exit: ");
			findGrade = input.nextDouble();

			student = 0;	//re-initialization
			count = 1;
		    notFound = 0;

		}
		System.out.println("\nThank you for using our STUDENT GRADES PROGRAM.\n"); //end message
		System.exit(0);	//exits program manually with normal operation

	}	//end of method
}	//end of class