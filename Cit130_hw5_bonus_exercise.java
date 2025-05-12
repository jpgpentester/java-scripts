
/*	Cit130_hw5_bonus_exercise.java: Assignment# 5 - CIT 130: Java Programming */

/*
	Author: Jose Paulo Garcia
	Due Date: 2/23/2015
*/

/*
	This program only displays Ascii character from 33 to 127 (! to ~). It displays 10 Ascii character per line with 1 spaces apart.
*/

import java.util.Scanner;

	public class Cit130_hw5_bonus_exercise {
		public static void main(String[] agrs) {

			String run;	//declaring variables and initialization
			int ascii = 33;
			int totalCounter = 43;

			Scanner input = new Scanner (System.in);

			System.out.println("\n\n\t\t\tDISPLAYING ASCII CHARACTERS");	//title

			System.out.print("\n\nPlease press enter to display all ASCII characters 33 to 127 or (! to ~) : ");	//displays message for user
			run = input.nextLine();

			System.out.println("");	//extra space

			while (totalCounter <= 127) {	//counter starts from 33 to 127

				if (totalCounter == 123) {	//this displays character from ascii 124 to 127
					for (ascii = ascii; ascii < totalCounter; ascii++) {
						System.out.print(" " + (char)ascii);
					}
					System.out.println("");
					totalCounter = totalCounter + 4;	//this adds 4 to totalCounter as soon as it reach 123

				} else {	//this only displays ascii 33 to ascii 123 since it only adds 10 on variable totalCounter to even out 10 characters per line
					for (ascii = ascii; ascii < totalCounter; ascii++) {
						System.out.print(" " + (char)ascii);
					}
					System.out.println("");
					totalCounter = totalCounter + 10;	//total counter
				}
			}
			System.out.println();	//extra space
			System.exit(1);	//exit program
		}	//end of method
	}	//end of class