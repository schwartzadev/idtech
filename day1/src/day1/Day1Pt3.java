package day1;
//find the similarities between three numbers
public class Day1Pt3 {
	public static void main(String[] args){
		int i = 7;
		int j = 15;
		int k = 7;
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
