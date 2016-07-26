package day2;

public class ArraysIntro2 {
	//make an array that is the same as an existing array but with 0 in the index0 place
	public static void main(String[] args){
		int indexCounter = 1;
		int [] num = {3, 6, 5, 4};
		int [] newNum = new int[num.length + 1];
		
		for (int i=0; i<num.length; i++){
			System.out.print(num[i] + "   ");
		}
		System.out.println("");

		
		newNum[0]=0;
		for (int i=0; i<num.length; i++){
			newNum[indexCounter]=num[indexCounter - 1];
			indexCounter = indexCounter + 1;
		}
		
		for (int i=0; i<newNum.length; i++){
			System.out.print(newNum[i] + "   ");
		}
	}
}