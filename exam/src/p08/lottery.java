package p08;

import java.util.Arrays;
import java.util.Random;

public class lottery {

	public static void main(String args[]) {
		Random any = new Random();
		int arr[] = new int[6];
		for (int i = 0; i < 6; i++) {
			int test = any.nextInt(10) + 1;
			for (int j = 0; j < 6;) {
				if (arr[j] == test) {
					test = any.nextInt(10) + 1;
					j = 0;
				} else {
					j++;
				}

			}
			arr[i] = test;
		}
		int mine[] = { 1, 2, 3, 4, 5, 6 };
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (arr[j] == mine[i]) {
					System.out.println(arr[j] + "번 맞춤!");
				}
			}
		}
		System.out.print(Arrays.toString(arr));
	}
}
