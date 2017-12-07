package p13_1;

import java.util.ArrayList;

import p13.Person;
import p13.Person1;

public class Excute {

	public static void main(String[] args) {
		Person1 p = new Person1();
		p.setName("Ryan");
		p.setAge(22);
		ArrayList<Person1> alPerson = new ArrayList<Person1>();
		alPerson.add(p);
		p = new Person1();
		p.setName("Tyan");
		p.setAge(33);
		alPerson.add(p);
		p = new Person1();
		p.setName("tt");
		p.setAge(21);
		alPerson.add(p);
		p = new Person1();
		p.setName("asdf");
		p.setAge(40);
		alPerson.add(p);
		p = new Person1();
		p.setName("asdf1");
		p.setAge(50);
		alPerson.add(p);
		for (int i = 0; i < alPerson.size(); i++) {
			Person1 pr = alPerson.get(i);
			for (int j = i + 1; j < alPerson.size(); j++) {
				Person1 pr2 = alPerson.get(j);
				if (pr.getAge() < pr2.getAge()) {
					Person1 tmpP = pr;
					pr = pr2;
					pr2 = tmpP;
					alPerson.set(i, pr);
					alPerson.set(j, pr2);
				}
			}
		}

		for (Person1 pr : alPerson) {
			System.out.println(pr);
		}
	}
}
