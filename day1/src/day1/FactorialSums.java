package day1;

import java.util.Scanner;
//find the sum of the digits of the factorial of a user-inputed number. Only works for numbers less than 17
public class FactorialSums {
	public static void main(String[] args){
		System.out.println("Choose a number (x) to run find the sum of the digits of x!");
		Scanner scanner = new Scanner(System.in);

		int factorial = 0;
		int start = 0;
		int total = 0;
	
		factorial = scanner.nextInt();
		start = factorial;
		total = factorial;
		int loop = total - 1;

		for (int i=0; i<loop; i++){
			start = start - 1;
			total = total * start;
			System.out.println (total);
		}
		System.out.println ("done");
		
        long num = total;
        long sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        System.out.println(sum);
        
        System.out.println("The sum of the integers of " + factorial + "! is " + sum);
    }
}