package adventure;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		//start var declarations
		int playerChoice = 0;
		String playerId = null;
		// end var declarations
		
		
		boolean playerChoiceLoop = false; // used in while loop to detect invalid player choice
		while (playerChoiceLoop == false) { // determines player id
			Scanner scanner = new Scanner(System.in);
			System.out.println("Welcome to the battle game. Choose your player: \n   1. Alex has a lot of health but deals little damage.");
			System.out.println("   2. Jane has less health but can deal more damage.");
			playerChoice = scanner.nextInt();
			
			if (playerChoice == 1) { //choose player id
				Alex player = new Alex();
				System.out.println("You are Jane.");
				playerChoiceLoop = true;
			}
			else if (playerChoice == 2) {
				Jane player = new Jane();
				System.out.println("You are Jane.");
				playerChoiceLoop = true;
			}
			else {
				System.out.println("Please choose 1 or 2 and press enter.");
				playerChoiceLoop = false;
			}
		}
	}
}
