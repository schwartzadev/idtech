package day2;
//find the sum of all numbers in a given array
public class ArraysIntro {
	public static void main(String[] args){
		int total = 10;
		int [] num = {3, 6, 5, 4};
		for (int i=0; i<num.length; i++){
			total = num[i] + total;
		}
		System.out.println("sum is " + total);
	}
}