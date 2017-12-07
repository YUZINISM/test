package p12;

import java.util.ArrayList;
import java.util.Scanner;



public class ListExam2 {

	ArrayList<String> al = new ArrayList<String>();
	int insert;
	Scanner s = new Scanner(System.in);

	void inputCnt() {

		System.out.println("How many numbers would you like to insert?");
		insert = s.nextInt();

	}

	void getNum() {

		for(int i = 0;i <insert; i++) {
			System.out.print(i+1+"번째 숫자를 입력하세요.");
			int test = s.nextInt();
			String testStr= test +"";
			if(al.indexOf(testStr) == -1) {
				al.add(testStr);
			}else {
				System.out.println("Your number is already in existence. Type another number.");
				i--;
			}
			
		}
		
	}
	
	void printOdd() {
		
		for(int i = 0; i <al.size(); i++) {
			int num = Integer.parseInt(al.get(i));
			if(num%2 != 0) {
				al.remove(i);
			}
				
		}System.out.println(al);
	}

	public static void main(String args[]) {

		ListExam2 le = new ListExam2();
		le.inputCnt();
		le.getNum();
		System.out.println(le.al);
		System.out.print("Odd numbers in the list are:");
		le.printOdd();
	}
}
