package p16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import com.google.common.collect.Lists;

//5명 의 점수scanner next line () 으로
//총전 낮은 ㅈ순서대로
//평균 총정!

public class Exam {

	Scanner s = new Scanner(System.in);
	int[] arr = new int[5];
	double ave;
	int sum;

	void getMarks() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i + 1 + "th student's mark?");
			String mark = s.nextLine();
			int markInt = Integer.parseInt(mark);
			arr[i] = markInt;
		}
	}

	void getSumAve(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		this.ave = (double)sum / arr.length;
		this.sum = sum;

	}

	void ascending(int[] arr) {
		for (int i = 4; i > 0; i--) {// reference pointer **ascending
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
		Exam e = new Exam();
		// Integer[] nums = { 1, 2, 3, 4 };
		// ArrayList<Integer> markList = Lists.newArrayList();

		e.getMarks();
		e.getSumAve(e.arr);
		e.ascending(e.arr);
		System.out.println(Arrays.toString(e.arr));
		System.out.println("Average : " + e.ave);
		System.out.println("Summation :" + e.sum);
	}
}