package p10;

import p09.Android;

public class Googler{
	
	public void father() {
		System.out.print("this is father's unique function");
	}
	
	public void print() {
		System.out.println("this is from father");
		
	}
	public static void main(String args[]) {
		Googler an = new Android();
		an.print();
		
	}
	
	
	
}
