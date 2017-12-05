package p11;

import java.util.ArrayList;
import java.util.HashMap;

public class Check {

	public static void setHm(HashMap<String, String> hm) {
		hm.put("name", "정상원");
		hm.put("age", "33");
	}

	public static void main(String args[]) {
			HashMap <String,String> hm = new HashMap<String,String>();
			ArrayList<HashMap<String,String>> alMap = new ArrayList<HashMap<String,String>>();
			for(int i=0; i<4; i++) {
				hm = new HashMap<String,String>();
				hm.put("age", i+"");
				alMap.add(hm);
			}
			for(HashMap<String,String> h: alMap) {
			System.out.println(hm.get("age"));
			
		}
	}
}
