package day2;

public class Arrays4 {
	//sort an array highest --> lowest
	public static void main(String[] args){
		int y = 0;
		int top = 0;
		int [] num = {4, 6, 5, 2};
		int [] newNum = new int[num.length];

		System.out.print("ORIGINAL ARRAY: ");
		for (int i=0; i<num.length; i++){
			System.out.print(num[i] + "   ");
		}
		System.out.println("");
		for (int i=0; i<(num.length); i++){
			if (num[i] > top) {
				top = num[i];
			}
		}
		
		for (int i=0; i<(num.length); i++){
			top = num[i];
			newNum[y] = top;
			num[i] = -1000000;
			y = y + 1;
		}
		System.out.print("NEW ARRAY: ");
		for (int i=0; i<newNum.length; i++){
			System.out.print(newNum[i] + "   ");
		}
	}
}