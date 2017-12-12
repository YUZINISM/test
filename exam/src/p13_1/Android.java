package p13_1;

public class Android extends Google {
	void unique1() {System.out.println("this is unique1 function of Android");}
	void unique2() {System.out.println("this is unique2 function of Android");}
	void print() {System.out.println("this is print function of android");}
	
	public static void main(String args[]) {
		
		Google g = new Android();
		g.print();
	}

}
