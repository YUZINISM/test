package p03;

import java.util.Scanner;

public class ObjectExam {
	int num1;
	int num2;
	
	
	void add(int num1, int num2){
		num1 = 12300;
		System.out.println("num1=" + num1);
	}
	
//	int getnum() {
//		num2 = 3;
//		int num2 = 4;
//		return num2;
//	}
	
	int print() {
		return num1;
	}
		
	void inputNums() {	
		Scanner s = new Scanner(System.in);
		System.out.println("type your first number : ");
		num1 = s.nextInt();
		System.out.println("type your second number : ");
		num2 = s.nextInt();
	}
	
	void printLoop(int num1, int num2) {
		for(int i = num1; i <= num2;i++) {
			System.out.print(i);
			if(i!=num2) {
				System.out.print(",");
				}
			}
		System.out.println("");
	
	}
	
	static ObjectExam p = new ObjectExam();
	
	public static void main(String args[]) {
	
		ObjectExam o = new ObjectExam();
		o.inputNums();
		
	}
	
}
