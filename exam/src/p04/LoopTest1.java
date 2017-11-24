package p04;

import java.util.Scanner;

public class LoopTest1 {
	int num1;
	int num2;
	//1부터 100가지 더하고,홀수만,짝수만
	void num() {
		Scanner s = new Scanner(System.in);
		System.out.println("Type in your first number: ");
		num1 = s.nextInt();
		System.out.println("Type in your second number: ");
		num2 = s.nextInt();
		if(num1>num2) {
			int tmp = num1;
			num1 = num2;
			num2 = tmp;
			
		}
		
	}
	
	boolean check() {
		return num1<num2;
		}
	
	
	void allAdd(){
		
		int total = 0;
		for(int i = num1; i<=num2 ; i++) {
			total = total + i; 
		}
		System.out.println("Sum of numbers : " + total);
	} 
	
	void onlyEven() {
		
		String str = "";
		
		if(num2%2==0) {
			for(int i = num1; i < num2 ; i++){
				if(i%2==0) {
					str = str + i + "," ;
					}
				}
			System.out.println("Even numbers are : " + str + num2);
		}
		else {
			for(int i = num1; i < num2-2 ; i++){
				if(i%2==0) {
					str = str + i + "," ;
					}
				
				}
			System.out.println("Even numbers are : " + str + (num2-1));
			}	
	}
	
	
	void onlyOdd() {
		
		String str = "";
		
		if(num2%2!=0) {
			for(int i = num1; i < num2 ; i++){
				if(i%2!=0) {
					str = str + i + "," ;
					}
				}
			System.out.println("Odd numbers are : " + str + num2);
		}
		else {
			for(int i = num1; i < num2-2 ; i++){
				if(i%2!=0) {
					str = str + i + "," ;
					}
				}
			System.out.println("Odd numbers are : " + str + (num2-1));
			}	
	}
	
	
	public static void main(String args[]) {
		LoopTest1 math = new LoopTest1();
		
		math.num();
		math.allAdd();
		math.onlyEven();
		math.onlyOdd();
		}
}

