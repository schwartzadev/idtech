package day3;

public class MethodArray {
	//use methods to print a string and an int
	public static void main(String[] args){
		int [] array = {1, 4, 2, 6, 3};
		ArrayDivision(array, 3);
	}
	public static void ArrayDivision(int[] array, int x){
		for (int i=0; i<array.length; i++){
			if (array[i] % x == 0) {
				System.out.println("value " + i + " is something special");
			}
		}

	}
}