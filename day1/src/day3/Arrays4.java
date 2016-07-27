package day3;

public class Arrays4 {
	//find adjacent duplicates in an array
	public static void main(String[] args){
		int y = 0;
		int top = 0;
		int [] num = {4, 6, 5, 9, 9, 9, 3};

		System.out.print("ARRAY: ");
		for (int i=0; i<num.length; i++){
			System.out.print(num[i] + "   ");
		}
		System.out.println("");
		for (int i=0; i<num.length-1; i++){
			if (num[i] == num [i+1]) {
				System.out.println("There are adjacent duplicate values.");
			}
		}
	}
}