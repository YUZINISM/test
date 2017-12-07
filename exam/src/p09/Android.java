package p09;

import p10.Googler;

public class Android extends Googler{

	public void son() {
		System.out.println("this is son's unique function");
	}

	public void print() {
		System.out.println("this is from son");
	}

	public static void main(String args[]) {

		Googler an = new Android();
		an.print(3);
		System.out.println(an.getClass());
	}
}
