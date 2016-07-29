package day3;

import java.util.Scanner;

public class NumGuess {
	public static void main(String[] args){
		boolean run = true;
		while (run == true) {
			int move = 0;
			System.out.println("Pick a number: 1 or 2");
			Scanner scanner = new Scanner(System.in);
			move = scanner.nextInt();
			if (move == 1 || move == 2) {
				System.out.println("Nice Try!");
			}
			else {
				System.out.println("Invalid.");
			}
		}
	}
}
