package p09;

import java.util.Arrays;
import java.util.Random;

public class OverloadingExam {

	public static void main(String args[]) {
		int nums[][] = new int[3][];
		nums[0] = new int[3];
		nums[1] = new int[4];
		nums[2] = new int[5];
		
		//[[1,2,3],[4,5,6,7],[8,9,10,12,]]
		
		for(int i = 0 ; i < nums.length; i++) {
			for(int j = 0; j < nums[i].length; j++) {
				
				if(i!=0) {
					int jlen = nums[i-1].length -1;
					nums[i][j] = j + 1 + (nums[i-1][jlen]);
				}
				else {
					nums[i][j] = j + 1 ;
				}
				
				
				
				
			}
		}
	
		System.out.println(Arrays.toString(nums[0]));
		System.out.println(Arrays.toString(nums[1]));
		System.out.println(Arrays.toString(nums[2]));
	}
	
	
}
