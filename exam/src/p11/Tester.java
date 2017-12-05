package p11;

import java.util.ArrayList;
import java.util.Random;

public class Tester {
	
	
	public static void main(String args[]) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		Random any = new Random();
	
		int cnt = 0;
		for (int i = 0; i < 10; i++) {
			int num = any.nextInt(10) + 1;

			if (arr.indexOf(num) == -1) {
				arr.add(num);
				cnt+=num;
				
			} else {
				num = any.nextInt(10) + 1;
				i--;
			}

		}
		System.out.println(arr);
		System.out.println(cnt);
	}
}
