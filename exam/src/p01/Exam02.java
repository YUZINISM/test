package p01;

import java.util.Scanner;

public class Exam02 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		String op = s.nextLine().trim();
		int result = 0;
		
		if(op.equals("+")){
			result = a+b;
		}
		else if(op.equals("-")){
			result = a-b;
		}
		else {
			System.out.println("do not do that");
			
		}
		System.out.println("result = " + result);
		s.close();
	}
	
	
}




