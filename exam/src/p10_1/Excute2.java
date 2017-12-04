package p10_1;

public class Excute2 extends Alphabet{

	public void print() {
		System.out.println("Excute2");
	}
	public static void main(String args[]) {
		
		Alphabet p1 = new Excute2();
		Object p2 = new P2();
		Object p3 = new P3();
		Object p4 = new P4();
		Object arr[] = {p1,p2,p3,p4};
		
		p1.print();
		
	}

}
