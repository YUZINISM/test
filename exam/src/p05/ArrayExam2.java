package p05;

import java.util.Scanner;

public class ArrayExam2 {

	int row;
	int col;
	
	void getNum() {
		Scanner s = new Scanner(System.in);
		System.out.println("몇배수 까지 할까요? ; ");
		row = s.nextInt();
		System.out.println("몇단 까지 할까요? ; ");
		col = s.nextInt();
	}
	
	void make() {
		for(int i = 1; i <= col; i++) {
			String str = "";
			for(int j = 1; j <= row; j++) {
				str = str + i + "x" + j + "=" + (i*j) + ",";
			}
			System.out.println(str.substring(0, str.length()-1));
			
		}
	}
	
	public static void main(String args[]) {
		ArrayExam2 a = new ArrayExam2();
		a.getNum();
		a.make();
	}
}
