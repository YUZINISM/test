package p13_1;

import java.util.Random;

public class Must {

	
	public static void main(String args[]) {

		Random any = new Random();
		int arr[] = new int[5];
		for(int i = 0; i<5; i++) {
			int test = any.nextInt(10)+1;
			arr[i] = test; 
		}
	}
}
