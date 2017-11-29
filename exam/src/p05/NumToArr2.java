package p05;

import java.util.Scanner;

public class NumToArr2 {
	
	int roomNum;
	String strArr[] = {};
	
	void howMany() {
		
		System.out.println("배열의 방 개수를 설정하세요 : ");
		Scanner s = new Scanner(System.in);
		roomNum = s.nextInt();
	}
	
	void stringOrInt() {
		
		strArr = new String[roomNum];
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < roomNum; i++) {
			System.out.println(i+1+"번째 방에 무엇을 넣을까요? (남은 방 갯수 : " + (roomNum - i) + "개)");
			strArr[i] = s.next();//next()사용
		}
	
	}

	
	void print() {
		
		String str = "당신의 배열 =" + "[";
		for(int i = 0; i < strArr.length; i++) {
			str = str + strArr[i] + ",";
		}
		
		System.out.println(str.substring(0, str.length() - 1) + "]");
	} 
	
	
	
	public static void main(String args[]) {
	
		NumToArr2 a = new NumToArr2();
		a.howMany();
		System.out.println("숫자던 글자던 원하는걸 넣어보세요!");
		a.stringOrInt();
		a.print();

	}
}