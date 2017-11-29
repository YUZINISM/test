package p07;

import java.util.Arrays;

public class Exam3 {

	
	
	public static void main(String args[]) {
		
		int arr[] = new int[5];
		arr[0] = 5;
		arr[1] = 5;
		arr[2] = 3;
		arr[3] = 5;
		arr[4] = 7;
		
	for(int j =0; j<5; j++)
		for(int i = 1; i < 5; i++) {
			if(i+j<5 && arr[j] < arr[i+j]) {
				int tmp = arr[i+j];
				arr[i+j] = arr[j];
				arr[j] = tmp;
			}
			else if(i+j<5 && arr[j] == arr[i+j]) {
				arr[i+j] = 0;
				
			}
		}
		
		
		
		
		System.out.println(Arrays.toString(arr));
	}

}