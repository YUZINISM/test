package p05;

import java.util.Arrays;
import java.util.Scanner;

public class ArraryExam {

	int room;
	int location;
	int numArr[][] = new int[3][3];
	
	void find() {
		
		Scanner s = new Scanner(System.in);
		System.out.println("방 번호를 입력하세요");
		room = s.nextInt();
		System.out.println(room + "의 방의 위치를 입력하세요");
		location = s.nextInt();
		System.out.println(numArr[room][location-1]);
		
	}
	
	void func1() {

		for (int i = 0;i<3;i++) { 
			for(int j = 0; j<3; j++) {
				numArr[i][j] = j + 1 ;
				}
			}
		
	}
	public static void main(String args[] ) {
		
		ArraryExam a = new ArraryExam();
		a.func1();
		a.find();
	
		
		
		}
	
}
