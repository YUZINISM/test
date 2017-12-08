package p14;

import java.util.ArrayList;
import java.util.Random;

public class Excute1 {

	public static void main(String args[]) {
		MapExam me = new MapExam(); 
//		me.put("name", "Tom");
//		me.put("age", "21");
//		me.put("height", "180");
//		me.put("name", "jack");
//		System.out.println(me.get("name"));
//		System.out.println(me.alKey);
//		System.out.println(me.alValue);
//		System.out.println(me);
		ArrayList<MapExam> al = new ArrayList<MapExam>();
		Random r = new Random();
		for(int i=0; i<10; i++) {
			me = new MapExam(); 
			me.put("name", "r" + i);
			int age = r.nextInt(100)+1;
			me.put("age", age +"");
			al.add(me);
		}
			
		for(MapExam m : al){
			System.out.println(m);
		}
	
		
		
	}
}
// alkey = [name, age, height]
// alvalue = [tom, 12, 180]