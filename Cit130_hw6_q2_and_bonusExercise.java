
/*	Cit130_hw6_q2_and_bonusExercise: Assignment# 6 - CIT 130: Java Programming */

/*
	Author: Jose Paulo Garcia
	Due Date: 03/09/2015
*/

/*
 	This programs have 5 different methods that does 5 different things:

 	1st: method count ask user for a word and a letter to check if that letter can be found within the word. Also displays how many character found in that word.
 	2nd: method reverseIt ask user for a word to input and it displays back a reverse word of that word given.
	3rd: method checkIt ask user to input a word and see if it matches with the word "JAVA" which also checks for case sensitivity

 	BONUS EXERCISE
 	4th: footToMeter ask user for a number in feet unit and it displays its equivalent in meters
 	5th: meterToFoot ask user for a number in meters unit and it displays its equivalent in feet
*/



import java.util.Scanner;

public class Cit130_hw6_q2_and_bonusExercise {

	public static int count(String word, char letter) {	//method header

		int i;	//declaring variables
		int count;
		int numLetter;
		String loweredWord;
		char loweredLetter;


		count = 0;	//initialization
		numLetter = 0;
		loweredWord = "";
		loweredLetter = ' ';

		loweredWord = word.toLowerCase();	//transforming it to lowercase
		loweredLetter= Character.toLowerCase(letter);

		numLetter = loweredWord.length();	//determining length of the word

		for(i = 0; i < numLetter; i++) {
			if (loweredLetter == loweredWord.charAt(i)) {
				count = count + 1;
			} else {
				System.out.print("");
			}
		}
		return count;	//returns value from method


	} public static String reverseIt(String theWord) {	//method header

		int j;	//declaring variables
		String backWord;

		j = 0;	//initialization
		backWord = "";

		j = theWord.length();	//determining lenght of the word from user
		j = j-1;

		while (j >= 0) {
			backWord = backWord + (theWord.charAt(j));	//prints out the word in backward
			j--;
		}


		/*
		for (j = j; j >= 0; j--) {
			backWord = backWord + (theWord.charAt(j));	//for loop block line same output for while loop but i prefer using while loop
		}
		*/

		return backWord;	//returns output


	} public static boolean checkIt(String checkWord) {	//method header

		boolean checkIt;	//declaration

		checkIt = false;	//initialization

		if (checkWord.equals("JAVA")) {	//checks for input and compare it to word "JAVA" with case sensitivity
			System.out.print("The word you entered '" + checkWord + "' match with the word 'JAVA'.");
			System.out.println("");
		} else {
			System.out.println("The word you entered does not match with our word 'JAVA' ");
		}

		return checkIt;	//returns value from method


	} public static double footToMeter(double foot) {	//method header

		double meter;	//declaration

		meter = 0.0;	//initialization

		meter = 0.305 * foot;	//calculation foot to meters conversion

		return meter;	//returns value from method


	} public static double meterToFoot(double meter) {	//method header

		double foot;	//declaration

		foot = 0.0;	//initialization

		foot = 3.279 * meter;	//calculation meter to foot conversion

		return foot;	//returns value method
	}


////////////////////////////MAIN METHOD///////////////////////////

	public static void main(String[] args) {	//start of main method

		Scanner input = new Scanner (System.in);

		String word;	//declaration of variable

		System.out.println("\n");	//extra spaces

		System.out.println("FINDING AND DISPLAYING A NUMBER OF TIMES A CHARACTER IS FOUND ON A WORD\n");	//title

		System.out.print("\nPlease enter a word: ");	//prompts user for input
		word = input.nextLine();

		System.out.print("Please enter a character you want to check: ");	//prompts user for input
		char letter = input.nextLine().charAt(0);

		System.out.println("");

		System.out.println("\nThere are " + count(word, letter) + " character '" + letter + "' found on the word '" + word + "'.");
		System.out.println("");		//calls and retrieve return value from count method



		System.out.println("\n\nDISPLAYING A WORD IN BACKWARDS");

		String theWord;	//declaration of variable

		System.out.print("\nPlease enter a word: ");	//prompts user for input
		theWord = input.nextLine();

		System.out.print("\nThe reverse word of '" + theWord + "' is '");	//calls and retrieve return value from reverseIt method
		System.out.print(reverseIt(theWord));
		System.out.println("'.\n\n");



		System.out.println("\n\nCHECKING WORD\n");	//title

		String checkWord;	//declaration

		checkWord = "";	//initialization

		System.out.print("Please enter a word to see if its match our word: ");	//prompts user for input
		checkWord = input.nextLine();

		System.out.println("");

		checkIt(checkWord);	//calls and retrieve return value from checkIt method

		System.out.println("");



		System.out.println("\n\nCONVERTING FEET TO METERS");	//title

		double foot;	//declaration of variables

		foot = 0.0;	//initialization

		System.out.print("\nPlease enter a number in feet: ");	//prompts user for input, number in foot unit
		foot = input.nextDouble();
		System.out.println("");

		System.out.println(foot + " feet = " + footToMeter(foot) + " meters");	//calls and retrieve return value from footToMeter method.



		System.out.println("\n\nCONVERTING METERS TO FEET");	//title

		double meter;	//declaration of variables

		meter = 0.0;	//initialization

		System.out.print("\nPlease enter a number in meters: ");	//prompts user to input number in meter unit
		meter = input.nextDouble();
		System.out.println("");

		System.out.println(meter + " meters = " + meterToFoot(meter) + " feet");	//calls and retrieve return value from meterToFoot method

		System.out.println("");	//extra spaces
		System.out.println("");

	}	//end of main method

}	//end of class