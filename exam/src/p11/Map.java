package p11;

import java.util.HashMap;

public class Map {

	public static void setHm(HashMap <String,String> hm) {
		hm.put("name","정상원");
		hm.put("age","33");
	}
	
	public static void main(String args[]) {
		HashMap <String,String> hm = new HashMap<String,String>();
		setHm(hm);
		System.out.println(hm.get("name"));
		hm.get("name");
	}
}
