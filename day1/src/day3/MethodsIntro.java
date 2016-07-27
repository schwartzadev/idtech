package day3;

public class MethodsIntro {
	//use methods to print a string and an int
	public static void main(String[] args){
		int x = 3;
		String y = "wow";
		printInt(x);
		printString(y);
	}
	public static int printInt(int x){
		System.out.println(x);
		return x;
	}
	public static String printString(String y){
		System.out.println(y);
		return y;
	}
}
