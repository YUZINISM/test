package p10;

import p10_1.Alphabet;

public class Google extends Alphabet{
	
	
	
	public void print() {
		System.out.println("Google: Print function without parameter");
		
	}
	public static void main(String args[]) {
		
		Alphabet goo = new Google();
		goo.print();
	}
	
	
	
}
