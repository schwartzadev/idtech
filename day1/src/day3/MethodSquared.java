package day3;

public class MethodSquared {
	//use a method to import 2 ints, square the first, and print both
	public static void main(String[] args){
		squareFirst(5, 3);
	}
	public static void squareFirst(int x, int y){
		x = x^y;
		System.out.print(x);
	}
	public static int pow(int a, int b) {
		return a;
	}
}
