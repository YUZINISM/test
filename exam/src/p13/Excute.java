package p13;

import java.util.ArrayList;
import java.util.Scanner;

public class Excute {

	ArrayList<Person> alPerson;
	
	Excute(){
		alPerson = new ArrayList<Person>();
	}

	
	void inputsPersonCount() {
		System.out.println("number of students?");
		Scanner s = new Scanner(System.in);
		int cnt = s.nextInt();
		for(int i=0;i<cnt;i++) {
			s.nextLine();//why?
			System.out.println("Name of "+i + "th student");
			String name = s.nextLine();
			Student st = new Student(name);
			System.out.println("Point of "+i + "th student");
			int point = s.nextInt();
			alPerson.add(st);
		}
	}
	
	void printAlPerson() {
		for(Person p: alPerson) {
			Student s = (Student)p;
			System.out.println(s.name);
			
			System.out.println(s.getPoint());
		}
	}
	public static void main(String args[]) {
		Excute e = new Excute();
		e.inputsPersonCount();
		e.printAlPerson();
	}

}
