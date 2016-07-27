package day3;

import java.util.Scanner;

public class ArraySort {
	//sort an array using the switch method
	public static void main(String[] args){
		int scannerCount = 0;
		int y = 0;
		int switchCount = 0;
		int tempI = 0;
		int top = 0;
		int [] num = {1, 4, 2, 5, 3};

		// Get input for the array
		for (int i=0; i<num.length; i++){
			System.out.println("Value " + scannerCount);
			Scanner scanner = new Scanner(System.in);
			int depth = 20;
			num[scannerCount] = scanner.nextInt();
			scannerCount = scannerCount + 1;
		}
		
		// Print original array
		System.out.print("Original Array: ");
		for (int i=0; i<num.length; i++){
			System.out.print(num[i] + "   ");
		}
		System.out.println("");
		System.out.println("");

		// Switch numbers, replace into num
		while (num[0] < num[1] || num[1] < num[2] || num[2] < num[3] || num[3] < num[4]) {
			for (int i=0; i<num.length-1; i++){
				if (num[i] < num [i+1]) {
					tempI = num[i];
					num[i] = num[i+1];
					num[i+1] = tempI;
					switchCount = switchCount + 1;
				}
			}
		}
		
		// Print updated array
		System.out.print("New Array: ");
		for (int i=0; i<num.length; i++){
			System.out.print(num[i] + "   ");
		}
		// Print switch count
		System.out.println("");
		System.out.println("");
		System.out.println("Total switches: " + switchCount);

	}
}
