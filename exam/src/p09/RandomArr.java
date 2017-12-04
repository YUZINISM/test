package p09;

import java.util.Arrays;
import java.util.Random;

public class RandomArr {

	int threeArr[][] = new int[3][3];

	void getRan() {

		Random any = new Random();
		for (int k = 0; k < 3; k++) {
			int arr[] = new int[3];
			for (int i = 0; i < 3; i++) {
				int test = any.nextInt(10) + 1;
				for (int j = 0; j < 3;) {
					if (arr[j] == test) {
						test = any.nextInt(10) + 1;
						j = 0;
					} else {
						j++;
					}
				}
				arr[i] = test;
			}

			threeArr[k] = arr;
		}
		System.out.print(Arrays.toString(threeArr[0]));
		System.out.print(Arrays.toString(threeArr[1]));
		System.out.println(Arrays.toString(threeArr[2]));
	}

	void fix() {

		for (int i = 0; i < 3; i++) {
			ascend(threeArr[i]);
		}
		System.out.println(Arrays.toString(threeArr[0]));
		System.out.println(Arrays.toString(threeArr[1]));
		System.out.println(Arrays.toString(threeArr[2]));
	}

	void ascend(int arr[]) {
		for (int i = 2; i > 0; i--) {// reference pointer **ascending
			for (int j = i - 1; j >= 0; j--) {// no. of comparable
				if (arr[i] < arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}

			}
		}
	}

	public static void main(String args[]) {
		RandomArr ra = new RandomArr();
		ra.getRan();
		System.out.println("it's 오름차순 타임");
		ra.fix();

	}
}
