package day2;

import java.util.Scanner;
//print a pyramid of "#" with a scanner to prompt the pyramid depth
public class PyramidPrinter {

	public static void main(String[] args){
		System.out.println("Choose a number (x) to determine the depth of the pyramid");
		Scanner scanner = new Scanner(System.in);
		int depth = 20;
		depth = scanner.nextInt() + 2;
		
		int runNum = 0;
		int spaces = 0;
		for (int i=0; i<depth; i++){
				for (int k=0; k<spaces; k++) {
					System.out.print (" ");
				}
				for (int j=0; j<runNum; j++) {
					System.out.print ("#");
				}
			System.out.println ("");
			runNum = (i * 2) - 1;
			spaces = depth - i;
		}
	}

}



