package p16;

public class Excute {
	
	public void printAction(Action act) {
		
		act.eat();
		act.sleep();
		act.walk();
	}

	public static void main(String args[]) {
		Action p = new Hong("Hong gil",20,173,"hong@gmail.com");
		System.out.println( p instanceof Animal);
//		System.out.println(p);
//		p.eat();
//		p.sleep();
//		p.walk();
//		Excute e = new Excute();
//		Action c = new Cat("miky", 2, 15);
//		e.printAction(c);
	}
	
}
