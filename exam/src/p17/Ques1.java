package p17;

import java.util.Arrays;
import java.util.Scanner;

public class Ques1 {

	double ave;
	int sum;

	void getMarks(int[] arr) {
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + 1 + "th student's mark?");
			String mark = s.nextLine();
			int markInt = Integer.parseInt(mark);
			arr[i] = markInt;
		}
		s.close();
	}

	void getSumAve(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		this.ave = (double) sum / arr.length;
		this.sum = sum;

	}

	void ascending(int[] arr) {
		for (int i = arr.length - 1; i > 0; i--) {
			for (int j = i - 1; j >= 0; j--) {
				if (arr[i] < arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}

			}
		}
	}

	public static void main(String args[]) {
		Ques1 q = new Ques1();
		int[] arr = new int[5];
		q.getMarks(arr);
		q.getSumAve(arr);
		q.ascending(arr);
		System.out.println("Ascending order" + Arrays.toString(arr));
		System.out.println("Average : " + q.ave);
		System.out.println("Summation :" + q.sum);
	}
}
