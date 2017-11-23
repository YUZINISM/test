package p03;

import java.util.Scanner;

public class gugu {
	
	void timesTable(int num1, int num2) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("first digit");
		num1 = s.nextInt();
		System.out.println("second digit");
		num2 = s.nextInt();
		for(int i = num1; i < 10; i++ ) {
			for(int j = num2; j < 10; j++ ) {
				String str = i + "x" + j +"="+ i*j;
				if(j!=9) {
					str = str + ",";
				}
				System.out.print(str);
			}		
			System.out.println("");
		}
	}
	

			
	
	public static void main(String args[]) {
		gugu gu = new gugu();
		System.out.println(gu.timesTable());
			
			
		
	}
}
	

