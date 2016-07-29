package blackjack;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Main {
	public static void main(String[] args){
		//start var declarations
		int begin = 0;
		int hitStick = 0;
		int again = 1;
		String beginString = null;
		// end var declarations

		/*System.out.println("Welcome to blackjack.\nPress 1 to continue.");
		Scanner scanner = new Scanner(System.in);
		begin = scanner.nextInt();*/ //RE-ADD THIS FOR INTRO
		// **** a "0 of *suit*" is a king!!
		begin = 1; // REMOVE THIS LINE FOR FINAL, TO ACTIVATE INTRO
		if (begin == 1) {
			while (again == 1) {
				
				// Create an array
				Integer[] deck = new Integer[]{1, 2, 3, 4, 6, 7, 8, 9, 10, 11, 12,
						13,14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27,
						28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41,
						42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52};
				 				 
				// Shuffle the deck
				Collections.shuffle(Arrays.asList(deck));
				// Print the deck **TEMP** **TEMP**
				System.out.println("DECK:   ");
				for (int i=0; i<deck.length; i++){
					System.out.print(deck[i] + "   ");
				}
				
				Random random = new Random();

				int compOne=random.nextInt(52);
				int compTwo=random.nextInt(52);
				int compThree=random.nextInt(52);
				int compFour=random.nextInt(52);
				int playerOne=random.nextInt(52);
				int playerTwo=random.nextInt(52);
				int playerThree=random.nextInt(52);
				int playerFour=random.nextInt(52);


				System.out.println("You have a " + (playerOne % 13) + " of " + suit(playerOne) + " and a " + (playerTwo % 13) + " of " + suit(playerTwo) + ".");
				System.out.println("The computer has a " + (compOne % 13) + " of " + suit(compOne) + " face up." );
				if (compOne % 13 >= 10 && compOne % 13 <= 13 && compTwo % 13 == 11) {
					System.out.println("Computer has blackjack.");
				}

				boolean hitStickDone = false;
				while (hitStickDone == false) {
					System.out.println("Hit (1) or stick (2)?");
					Scanner scannerHitStick = new Scanner(System.in);
					hitStick = scannerHitStick.nextInt();
					if (hitStick == 1){
						System.out.println("You hit. \nYou draw a " + (playerThree % 13) + " of " + suit(playerThree) + ".");
						System.out.println("You now have a " + (playerOne % 13) + " of " + suit(playerOne) + ", " + (playerTwo % 13) + " of " + suit(playerTwo) + " and a " + (playerThree % 13) + " of " + suit(playerThree) + ".");
						
						
						if ((playerOne % 13) + (playerTwo % 13) + (playerThree % 13) >= 21) {
							System.out.println("You bust! You had a total of " + ((playerOne % 13) + (playerTwo % 13) + (playerThree % 13)));
							break;
						}
					}
					else if (hitStick == 2) {
						System.out.println("You stick.");

					}
				}
				System.out.println("Play again? \n Yes (1) or No (2)");
				Scanner scannerAgain = new Scanner(System.in);
				again = scannerAgain.nextInt();
			}
		}

	}





	public static String suit(int x){
		if (x / 13 == 0) {
			String suit = "spades";
			return "spades";
		}
		else if (x / 13 == 1) {
			String suit = "hearts";
			return "hearts";
		}
		else if (x / 13 == 2) {
			String suit = "diamonds";
			return "diamonds";
		}
		else {
			String suit = "clubs";
			return "clubs";
		}
	}


}
