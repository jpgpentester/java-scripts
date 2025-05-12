
import java.util.Scanner;

public class Cit130_hw3_q1_bonus_exercise {
	public static void main(String[] agrs) {

		int userNum;    //Declaring variables
		int computerNum;

		Scanner input = new Scanner (System.in);

		System.out.println("");   //Extra space
		System.out.println("");
		System.out.println("ROCK, PAPER, AND SCISSOR GAME:"); //Title of game
		System.out.println("");

		System.out.print("Please choose one from below and enter the number of your pick \n(rock (0), paper (1), scissor (2): "); //Displays message for user input
		userNum = input.nextInt();

		System.out.println("");
		System.out.println("");   //Extra space
		System.out.println("");

		computerNum = (int)(Math.random() * 3);        //Random generated number for computerNum

		System.out.println("Generated random number for Computer is: " + computerNum);  //Displays the generated random number of computer

		System.out.println("");
		System.out.println("");     //Extra space

		if (computerNum == 0) {			//Computer is Rock
			if (userNum == computerNum)
				System.out.println("Computer is Rock. You play Rock too. It is a draw! ");
			else if (userNum == 1)
				System.out.println("Computer is Rock. You play Paper. You won! ");
			else if (userNum == 2)
				System.out.println("Computer is Rock. You play Scissor. You lose! ");

		} else if (computerNum == 1) { 	//Computer is Paper
			if (userNum == computerNum)
				System.out.println("Computer is Paper. You play Paper too. It is a draw! ");
			else if (userNum == 0)
				System.out.println("Computer is Paper. You play Rock. You lose! ");
			else if (userNum == 2)
				System.out.println("Computer is Paper. You play Scissor. You won! ");

		} else if (computerNum == 2) { 	//Computer is Scissor
			if (userNum == computerNum)
				System.out.println("Computer is Scissor. You play Scissor too. It is a draw! ");
			else if (userNum == 0)
				System.out.println("Computer is Scissor. You play Rock. You won! ");
			else if (userNum == 1)
				System.out.println("Computer is Scissor. You play Paper. You lose! ");

		} else {     //Just in case generated randomn number is invalid. displays message for user.
			System.out.println("Computer invalid random pick. Please restart game.");
		}

		System.out.println("");
		System.out.println("");     //Extra space


	} //End of method
} //End of class