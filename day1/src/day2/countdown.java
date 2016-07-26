package day2;

public class countdown {
	public static void main(String[] args){
		//Count down from 100
		int countdown = 100;
		for (int i=0; i<101; i++){
			System.out.println(countdown);
			countdown = countdown - 1;
		}
	}
}
