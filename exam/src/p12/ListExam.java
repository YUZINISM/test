package p12;

import java.util.ArrayList;

public class ListExam {
	
	public ArrayList<String> alStr = new ArrayList<String>();
	
	
	void add(String str) {
		
		alStr.add(str + "번째 값은:" + str);
	}
	
	String get(int idx) {
		
		return alStr.get(idx);
	}
	
	void print() {
		for(int i = 0; i<alStr.size(); i++) {
			System.out.println(alStr.get(0) + "");
		}
	}
}
