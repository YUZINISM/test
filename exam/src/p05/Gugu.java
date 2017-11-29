package p05;

import java.util.Scanner;

public class Gugu {

	int row;
	int multiple;
	int rowStart;
	int multiStart;
	int exceptMulti;

	void getNum() {
		
		Scanner s = new Scanner(System.in);
			
		
	}
	
	
	public static void main(String args[]) {
	
		for(int i = 9; i > 0; i--){
			String times = "";
			for(int j = 9; j > 0; j--) {
				if( (i*j)%3 != 0) {
				times = times + i + "x" + j + "=" + (i*j) +","; 
				}
				else{
					times = times + "3의 배수,";
				}
			
		}
			System.out.println(times.substring(0,times.length()-1));
		}
		
	}
}
