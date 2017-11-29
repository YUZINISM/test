package p05;

import java.util.Arrays;
import java.util.Scanner;

public class Google {
	int room;
	int location;
	int arr[][];
	
	void setArr() {
		
		Scanner s = new Scanner(System.in);
		System.out.println("층 갯수를 설정하세요 : ");
		room = s.nextInt();
		System.out.println("방 갯수를 설정하세요 : ");
		location = s.nextInt();
		arr = new int[room][location];
	}
	
	void fillIn() {
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = j + 1 + (arr[i].length * i);
			}
		}
	}
	
	void print() {
		
		for(int i = 0; i <arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
	}
	
	
	public static void main(String args[]) {
		
		Google g = new Google();
		g.setArr();
		g.fillIn();
		g.print();

		
		
	}

}
