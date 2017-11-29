package p07;

import java.util.Scanner;

public class Exam02 {
	

	public static void main(String args[]) {
		int total = 106;
		
		int five = 5;
		int three = 3;
		int two = 2;
		
		int count5 = 0;
		int count3 = 0;
		int count2 = 0;
		
		if(total/five >= 1) {
			count5 = total/five;
			total = total%five;
		}
		
		if(total/three >= 1 && total%three != 1) {
			count3 = total/three;
			total = total%3;
		}
		
		if(total/two >=1) {
			count2 = total/two;
			total = total%2;
			
		}
		System.out.println(count5);
		System.out.println(count3);
		System.out.println(count2);
		System.out.println(total);
	}

}
