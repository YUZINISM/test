package p16;

import java.util.ArrayList;

public class ArrayExam {

	private ArrayList list;

	ArrayExam() {
		getArrayList(1,2);
		System.out.println(list);
	}

	public ArrayList<Integer> getArrayList(int a, int b) {
		list = new ArrayList<Integer>();
		for(int i = 0; i < 10; i++) {
			list.add(i);
		}
		
		return list;
	}

}
