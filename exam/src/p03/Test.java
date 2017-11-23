package p03;

public class Test {
	String str;
	
	Test(String str){
		this.str = str;
	}
	void printer() {
		System.out.print(str);
	}
	
	
	public static void main(String args[]) {
		Test t = new Test("가나다abc123");
		t.printer();
	
	}
	
}