package p11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Lotto {

	public static void main(String args[]) {

		int maxParty[] = new int[5];
		int winner[] = new int[3];
		Random any = new Random();
		for (int i = 0; i < 5; i++) {
			int check = any.nextInt(9) + 1;
			for (int j = 0; j < 5;) {
				if (maxParty[j] == check) {
					check = any.nextInt(9) + 1;
					j = 0;
				} else {
					j++;

				}
			}
			maxParty[i] = check;
		}
		System.out.print(Arrays.toString(maxParty));

		ArrayList <Integer> list = new ArrayList<Integer> ();
		for (int i = 0; i < 3; i++) {
			int pick = any.nextInt();
			if (list.indexOf(pick) != -1) {
				list.add(pick);
			} else {
				i--;
			}

		}
	}

}
