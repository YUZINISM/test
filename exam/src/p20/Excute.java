package p20;

import java.util.LinkedHashMap;

public class Excute {
	
	public static void main(String arg[]) {
		Service s = new Service();
		LinkedHashMap<String,Object> hm = new LinkedHashMap<String,Object>();
		//hm.put("훗훗","3");
		int result = s.updateClassInfo(hm);
		if(result == 1) {
			System.out.println("good update");
		}
	}

}
