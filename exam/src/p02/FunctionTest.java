package test;

public class FunctionTest {
	static void add(int num1, int num2) {
		System.out.println(num1+num2);
	}
	static int add2(int num1,int num2) {
		return num1+num2;
	}
	
	public static void main(String[] args) {
		
		FunctionTest f = new FunctionTest();
		
		System.out.println(f.add2(1,2));
	}
}
