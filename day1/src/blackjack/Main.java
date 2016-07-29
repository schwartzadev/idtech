package blackjack;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
	static int compHitNum = 0;
	static boolean compTurnDone = false;
	public static void main(String[] args){
		//start var declarations
		int begin = 0;
		int hitStick = 0;
		int again = 1;
		String beginString = null;
		// end var declarations

		System.out.println("Welcome to blackjack.\nPress 1 to continue.");
		Scanner scanner = new Scanner(System.in);
		begin = scanner.nextInt(); //RE-ADD THIS FOR INTRO
		begin = 1; // REMOVE THIS LINE FOR FINAL, TO ACTIVATE INTRO
		if (begin == 1) {
			while (again == 1) {
				int n = 0;
				// create the deck array
				// 1 is ace, 11 is  jack, 12 is queen, 13 is king
				Integer[] deck = new Integer[]{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, // spades
						14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, // hearts
						27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, // diamonds
						40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52 // clubs
				};


				Collections.shuffle(Arrays.asList(deck)); // Shuffle the deck

				int compOne=deck[n]; n = n + 1;
				int compTwo=deck[n]; n = n + 1;
				int compThree=deck[n]; n = n + 1;
				int compFour=deck[n]; n = n + 1;
				int compFive=deck[n]; n = n + 1;
				int compSix=deck[n]; n = n + 1;
				int playerOne=deck[n]; n = n + 1;
				int playerTwo=deck[n]; n = n + 1;
				int playerThree=deck[n]; n = n + 1;
				int playerFour=deck[n]; n = n + 1;
				int playerFive=deck[n]; n = n + 1;
				int playerSix=deck[n]; n = n + 1;
				int playerTotal=faceValue(playerOne % 13)+ faceValue(playerTwo % 13);
				int compTotal=faceValue(compOne % 13)+ faceValue(compTwo % 13);


				System.out.println("You have a " + face(playerOne) + " of " + suit(playerOne) + " and a " + face(playerTwo) + " of " + suit(playerTwo) + ".");
				System.out.println("The computer has a " + face(compOne) + " of " + suit(compOne) + " face up." );
				if (compOne % 13 >= 10 && compOne % 13 <= 13 && compTwo % 13 == 11) {
					System.out.println("Computer has blackjack.");
				}

				boolean hitStickDone = false;
				int hitNum = 0;
				while (hitStickDone == false) {
					System.out.println("Hit (1) or stick (2)?");
					Scanner scannerHitStick = new Scanner(System.in);
					hitStick = scannerHitStick.nextInt();
					if (hitStick == 1 && hitNum == 0){ // if player hits for the first time
						System.out.println("You hit. \nYou draw a " + face(playerThree) + " of " + suit(playerThree) + ".");
						System.out.println("You now have a " + face(playerOne) + " of " + suit(playerOne) + ", " + face(playerTwo) + " of "
								+ suit(playerTwo)+ " and a " + face(playerThree) + " of " + suit(playerThree) + ".");
						playerTotal = playerTotal + faceValue(playerThree % 13);
						hitNum = hitNum + 1;
						if (playerTotal > 21) {
							System.out.println("You bust! You had a total of " + playerTotal);
							break;
						}
					}
					else if (hitStick == 1 && hitNum == 1){ // if player hits for the second time
						System.out.println("You hit. \nYou draw a " + face(playerFour) + " of " + suit(playerFour) + ".");
						System.out.println("You now have a " + face(playerOne) + " of " + suit(playerOne) + ", " + face(playerTwo) + " of "
								+ suit(playerTwo) + ", " + face(playerThree) + " of " + suit(playerThree) + " and a " + face(playerFour) + " of " + suit(playerFour) + ".");
						playerTotal = playerTotal + faceValue(playerFour % 13);
						hitNum = hitNum + 1;
						if (playerTotal >= 21) {
							System.out.println("You bust! You had a total of " + playerTotal);
							break;
						}
					}
					else if (hitStick == 1 && hitNum == 2){ // if player hits for the third time
						System.out.println("You hit. \nYou draw a " + face(playerFive) + " of " + suit(playerFive) + ".");
						System.out.println("You now have a " + face(playerOne) + " of " + suit(playerOne) + ", " + face(playerTwo) + " of "
								+ suit(playerTwo) + ", " + face(playerThree) + " of " + suit(playerThree) + " and a " + face(playerFour) + " of "
								+ suit(playerFour) + " and a " + face(playerFive) + " of " + suit(playerFive) + ".");
						playerTotal = playerTotal + faceValue(playerFive % 13);
						hitNum = hitNum + 1;
						if (playerTotal >= 21) {
							System.out.println("You bust! You had a total of " + playerTotal);
							break;
						}
					}
					else if (hitStick == 2) { // if player sticks
						hitStickDone = true;
						System.out.println("You stick at " + playerTotal );
					}

					// computer's turn calculations below

					while (compTurnDone == false) {
						System.out.println("The computer has a " + face(compOne) + " of " + suit(compOne) + " and a " + face(compTwo) + " of " + suit(compTwo) + ".");

						if ((compTotal) >= 16) {
							System.out.println("The computer sticks at " + (compOne % 13 + compTwo % 13));
							compTurnDone = true;
							break;
						}
						else if (compTotal <= 16 && compHitNum == 0) {
							System.out.println("The computer hits. \nIt draws a " + face(compThree) + " of " + suit(compThree) + ".");
							compTotal = compTotal + faceValue(compThree % 13);
							compHitNum = compHitNum + 1;
						}
						else if (compTotal <= 16 && compHitNum == 1) {
							System.out.println("The computer hits. \nIt draws a " + face(compFour) + " of " + suit(compFour) + ".");
							compTotal = compTotal + faceValue(compFour % 13);
							compHitNum = compHitNum + 1;
						}
						else if (compTotal <= 16 && compHitNum == 2) {
							System.out.println("The computer hits. \nIt draws a " + face(compFive) + " of " + suit(compFive) + ".");
							compTotal = compTotal + faceValue(compFive % 13);
							compHitNum = compHitNum + 1;
						}
						else if (compTotal <= 16 && compHitNum == 3) {
							System.out.println("The computer hits. \nIt draws a " + face(compSix) + " of " + suit(compSix) + ".");
							compTotal = compTotal + faceValue(compSix % 13);
							compHitNum = compHitNum + 1;
						}
						else if (compTotal > 21) {
							System.out.println("The computer busts! It had a total of " + compTotal);
							compTurnDone = true;
							break;
						}
						else{
							System.out.println("Hello");
						}
					}
		}
				if (playerTotal <= 21 && (playerTotal > compTotal || compTotal > 21)) {
					System.out.println("You win! You had " + playerTotal + " and the computer had " + compTotal + ".");
				}
				else if (playerTotal > 21 && compTotal > 21) {
					System.out.println("Both you and the computer tied. \nYou had " + playerTotal +
							" and the computer had " + compTotal + ".");
				}
				else if (compTotal <= 21 && (compTotal > playerTotal || compTotal > 21)) {
					System.out.println("The computer wins! You had " + playerTotal + " and the computer had " + compTotal + ".");
				}
				System.out.println("Play again? \n Yes (1) or No (2)");
				Scanner scannerAgain = new Scanner(System.in);
				again = scannerAgain.nextInt();
			}
		}
	}

	// returns the actual value of face cards
	public static int faceValue(int x){
		if (x % 13 == 11) {
			return 10;
		}
		else if (x % 13 == 1) {
			return 11;
		}
		else if (x % 13 == 12) {
			return 10;
		}
		else if (x % 13 == 0) {
			return 10;
		}
		else {
			return x;
		}
	}

	// determines the suit of x card in the deck array
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

	// creates face of x card in the deck array, returns strings. **SOMETIMES RETURNS NUMBER AS STRINGS**
	public static String face(int x){
		if (x % 13 == 1) {
			String face = "ace";
			return face;
		}
		else if (x % 13 == 11) {
			String face = "jack";
			return face;
		}
		else if (x % 13 == 12) {
			String face = "queen";
			return face;
		}
		else if (x % 13 == 0) {
			String face = "king";
			return face;
		}
		else {
			String face = Integer.toString(x % 13);
			return face;
		}
	}



}
