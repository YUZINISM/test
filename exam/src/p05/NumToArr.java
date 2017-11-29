package p05;

import java.util.Scanner;

public class NumToArr {
		
		int min;
		int max;
		String arr[] = {};
		
		void getNum() {
			
			Scanner s = new Scanner(System.in);
			System.out.println("최소값 : ");
			min = s.nextInt();
			System.out.println("최대값 : "); 
			max = s.nextInt();
		}
		
		void stringToArr() {
			
			int roomNum = max - min + 1;
			arr = new String[roomNum];
			Scanner s = new Scanner(System.in);
			for(int i = 0; i < roomNum; i++) {
				System.out.println(i + 1 + "번째 숫자를 입력하세요 : ");
				arr[i] = s.nextInt() + "";
			}
			
			
		}
		
		void print() {
			
			for(int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}
		}
		
		
		public static void main(String args[]) {
			
			NumToArr a = new NumToArr();
			a.getNum();
			a.stringToArr();
			a.print();
			}
		}

