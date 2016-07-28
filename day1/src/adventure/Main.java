package adventure;

import java.util.Scanner;
import java.util.Random;

public class Main {
	public static String playerId = "null";
	public static String compId = "null";
	public static void main(String[] args){
		//start var declarations
		int playerChoice = 0;
		
		// end var declarations
		
		
		boolean playerChoiceLoop = false; // used in while loop to detect invalid player choice
		while (playerChoiceLoop == false) { // determines player id
			Scanner scanner = new Scanner(System.in);
			System.out.println("Welcome to the battle game. Choose your player: \n   1. Alex has a lot of health but deals little damage.");
			System.out.println("   2. Jane has less health but can deal more damage.");
			System.out.println("   3. Has a high critical hit ratio but low health.");
			playerChoice = scanner.nextInt();
			Random random = new Random();
			int compChoice = random.nextInt(3)+1;

			
			if (playerChoice == 1) { // player chooses alex
				Alex player = new Alex();
				playerId = "Alex";
				System.out.println("You are Alex.");
				playerChoiceLoop = false;
				if (compChoice == 1) {
					compId = "Alex";
					System.out.println("The computer is also Alex.");
					Alex comp = new Alex();
					player.battle(player, comp);
				}
				else if (compChoice == 2) {
					compId = "Jane";
					System.out.println("The computer is Jane.");
					Jane comp = new Jane();
					player.battle(player, comp);
				}
				else if (compChoice == 3) {
					compId = "Ned";
					System.out.println("The computer is Ned.");
					Ned comp = new Ned();
					player.battle(player, comp);
				}
				playerChoiceLoop = true;
			}
			
			else if (playerChoice == 2) {// player chooses jane
				Jane player = new Jane();
				playerId = "Jane";
				System.out.println("You are Jane.");
				playerChoiceLoop = false;
				if (compChoice == 1) {
					compId = "Alex";
					System.out.println("The computer is Alex.");
					Alex comp = new Alex();
					player.battle(player, comp);
				}
				else if (compChoice == 2) {
					compId = "Jane";
					System.out.println("The computer is also Jane.");
					Jane comp = new Jane();
					player.battle(player, comp);
				}
				else if (compChoice == 3) {
					compId = "Ned";
					System.out.println("The computer is Ned.");
					Ned comp = new Ned();
					player.battle(player, comp);
				}
				playerChoiceLoop = true;
			}
			else if (playerChoice == 3) {// player chooses ned
				Ned player = new Ned();
				playerId = "Ned";
				System.out.println("You are Ned.");
				playerChoiceLoop = false;
				if (compChoice == 1) {
					compId = "Alex";
					System.out.println("The computer is Alex.");
					Alex comp = new Alex();
					player.battle(player, comp);
				}
				else if (compChoice == 2) {
					compId = "Jane";
					System.out.println("The computer is Jane.");
					Jane comp = new Jane();
					player.battle(player, comp);
				}
				else if (compChoice == 3) {
					compId = "Ned";
					System.out.println("The computer is also Ned.");
					Ned comp = new Ned();
					player.battle(player, comp);
				}
				playerChoiceLoop = true;
			}
			else {
				System.out.println("Please choose 1, 2, or 3 and press enter.");
				playerChoiceLoop = false;
			}
		}
		System.out.println("THE END");
	}
}
