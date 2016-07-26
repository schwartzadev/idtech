package day1;
import java.util.Random;
import java.util.Scanner;
//Rock paper scissors, player v. computer
public class Day1NumGuess {
	public static void main(String[] args){
	System.out.println("Welcome to Rock Paper Scissors.");
	System.out.println("Press 0 for Rock, 1 for Paper, and 2 for Scissors.");
	System.out.println("Enter your choice: ");
	Random random = new Random();
	int compChoice=random.nextInt(3);
	Scanner scanner = new Scanner(System.in);
	int playerChoice = scanner.nextInt();
	
	if(playerChoice == 0){
		System.out.println("Your choice is Rock (" + playerChoice + ")");
		if (compChoice == 0){
			System.out.println("You and the computer tied with Rock (" + playerChoice + ")");
		}
		if (compChoice == 1){
			System.out.println("You lose. Paper (" + compChoice + ") beats Rock (" + playerChoice + ")");
		}
		if (compChoice == 2){
			System.out.println("You win. Rock (" + playerChoice + ") beats Scissors (" + compChoice + ")");
		}
	}
	else if (playerChoice == 1){
		System.out.println("Your choice is Paper (" + playerChoice + ")");
		if (compChoice == 0){
			System.out.println("You win. Paper (" + playerChoice + ") beats Rock (" + compChoice + ")");
		}
		if (compChoice == 1){
			System.out.println("You and the computer tied with Paper (" + playerChoice + ")");
		}
		if (compChoice == 2){
			System.out.println("You lose. Scissors (" + compChoice + ") beats Paper (" + playerChoice + ")");
		}
	}
	else if (playerChoice == 2){
		System.out.println("Your choice is Scissors (" + playerChoice + ")");
		if (compChoice == 0){
			System.out.println("You lose. Rock (" + playerChoice + ") beats Scissors (" + compChoice + ")");
		}
		if (compChoice == 1){
			System.out.println("You win. Scissors (" + compChoice + ") beats Paper (" + playerChoice + ")");
		}
		if (compChoice == 2){
			System.out.println("You and the computer tied with Scissors (" + playerChoice + ")");
		}
	}
	else {
		System.out.println("Your choice (" + playerChoice + ") is invalid. Please re-run the program.");
	}
	}
}
