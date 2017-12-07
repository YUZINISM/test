package p13;

import java.util.ArrayList;

public class TestPerson {

	public static void main(String args[]) {
		Person1 p = new Person1();
		p.setName("ryan");
		p.setAge(22);
		ArrayList<Person1> alPerson = new ArrayList<Person1>();
		System.out.println(p);
		alPerson.add(p);
		System.out.println(alPerson);
		
		p = new Person1();
		p.setName("tyan");
		p.setAge(33);
		alPerson.add(p);
//		System.out.println(alPerson);


//		for (Person1 pr : alPerson) {
//			System.out.println(pr);
//		}
	}
}
