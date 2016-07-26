package day2;

public class ArraysIntro3 {
	//find the highest number in a given array
	public static void main(String[] args){
		int x = 0;
		int top = 0;
		int [] num = {-50, 6, 5, 4, 80, 90, 100};

		System.out.print("ARRAY: ");
		for (int i=0; i<num.length; i++){
			System.out.print(num[i] + "   ");
		}
		System.out.println("");
		for (int i=0; i<(num.length); i++){
			if (num[x] > top) {
				top = num[x];
			}
			else {
			}
		x = x + 1;
		}
		System.out.print("HIGHEST INT: " + top);
	}
}