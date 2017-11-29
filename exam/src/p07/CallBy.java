package p07;

public class CallBy {

	void func1(int[] a) { 
		
		System.out.println("Parameter address: " + a);
		a[0] = 3;
		System.out.println("Value change address: " + a);
		a = new int[4];//순서 바꿔볼것 6,7란
		System.out.println("new address: " + a);
		
	}
	
	public static void main(String args[]) {
	
		int a[] = new int[1];
		System.out.println("first address: " + a);
		
		CallBy cb = new CallBy();
	
		cb.func1(a);
		System.out.println("return array address" + a);
		System.out.println(a[0]);
		System.out.println(a.length);
	
	}
	
	
}
