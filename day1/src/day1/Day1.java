package day1;
//basic mathmatical operations on two integers
public class Day1 {
	public static void main(String[] args){
		// declare variables
		int first = 34;
		int second = 9;
		int added = 0;
		int multiplied = 0;
		int subtracted = 0;
		
		// print inital values
		System.out.println ("first value is " + first);
		System.out.println ("second value is " + second);
		
		// modify and print modified vars
		added = first + second;
		
		System.out.println ("first + second is " + added);

		multiplied = first * second;
		
		System.out.println ("first * second is " + multiplied);
		
		subtracted = first - second;
		
		System.out.println ("first - second is " + subtracted);
	}
}