package p13;

import java.util.ArrayList;

public class Thinker {

	public static void main(String args[]) {

		Person p = new Person();
		p.name = "ryan";
		p.age = 33;
		ArrayList<Person> alPerson = new ArrayList<Person>();
		alPerson.add(p);
		p = new Person();
		System.out.println(alPerson.get(0).name);
	}
}
