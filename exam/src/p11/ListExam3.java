package p11;

import java.util.ArrayList;
import java.util.Random;

public class ListExam3 {

	public static void main(String args[]) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		Random any = new Random();
		
		int cnt = 0;
		for (int i = 0; i < 10; i++) {
			int num = any.nextInt(10)+1;
			
			cnt+=num;
			arr.add(num);
			
			
			
		}
		System.out.println(arr);
		System.out.println(cnt);
	}
}