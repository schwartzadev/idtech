package day3;

import java.util.Scanner;

public class MethodEven {
	//use methods to decide if an int is even or not
	public static void main(String[] args){
		even(66);
	}

	public static boolean even(int x){
		boolean validator = false;
		if (x % 2 == 0) {
			validator = true;
		}
		System.out.print (validator);
		return validator;
		

	}
}


