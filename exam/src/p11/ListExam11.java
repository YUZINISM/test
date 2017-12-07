package p11;

import java.util.ArrayList;

public class ListExam11 {

	int get() {
		System.out.print(1);
		return 4;
	}
	public static void main(String args[]) {
		
		ArrayList<String> al= new ArrayList<String>();
		al.add("st");
		al.add("op");
		ListExam11 li = new ListExam11();
		
		System.out.println(al.indexOf("op"));
		

	
	}
	

}
