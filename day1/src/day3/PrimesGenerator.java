package day3;

public class PrimesGenerator {
	public static void main(String[] args){
		for (int h=1999999999; h>0; h++){
			for (int i=2; i<h; i++){
				if (h % i == 0) {
					break;
				}
				else {
					if(i == h-1){
					System.out.println(h);
					break;
					}
				}
			}
		}
	}
}