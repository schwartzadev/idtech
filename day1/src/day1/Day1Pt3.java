package day1;

public class Day1Pt3 {
	public static void main(String[] args){
		int i = 4;
		int j = 5;
		int k = 5;
			if((i==k) && (i==j)) {
				System.out.println ("all are equal");
			}
			else if((i==k) || (k==j) || (i==j)) {
				System.out.println ("two are equal");
			}
			else {
				System.out.println ("none are equal");
			}
	}

}
