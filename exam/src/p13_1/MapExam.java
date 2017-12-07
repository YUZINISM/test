package p13_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class MapExam {

	public static void main(String args[]) {
		ArrayList<HashMap<String, String>> al = new ArrayList<HashMap<String, String>>();
		HashMap<String, String> hm = new HashMap<String, String>();
		Random any = new Random();

		//
		for (int i = 0; i < 10; i++) {
			hm = new HashMap<String, String>();
			int num = any.nextInt(100) + 1;
			hm.put("age", num + "");
			hm.put("name", "홍길동");

			if (al.size() == 0) {
				al.add(hm);
			} else {
				
				for (int j = 0; j < al.size(); j++) {
					hm.put("age", num + "");
					hm.put("name", "홍길동");

					if (Integer.parseInt(al.get(j).get("age")) < num) {

						al.set(j, hm);
						al.add(al.get(j));

					}
				}
			}

		}

		System.out.print(al);
	}
}
