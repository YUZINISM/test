package p09;

public class papa {
	int a= 3;
	static int b = 303;
	
	void fun1() {
		b = 203;
		
		System.out.println(b);
	}
	
	void fun2() {
		System.out.println(b);
	}

	public static void main(String args[]) {
		
		papa pa = new papa();
		pa.fun1();
		pa.fun2();
		System.out.println(pa.b);
	}
}
