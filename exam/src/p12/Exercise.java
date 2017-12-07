package p12;



import p11.ListExam11;

public class Exercise {

	HashMap<Integer,String> hm = new HashMap<Integer,String>();
	 
	void add(String str) {
		hm.put(hm.size(), str);
	}
	void add(int idx) {
		hm.put(idx, (hm.size()+1) + "번째값");
	}

	

	public static void main(String args[]) {
		
		ListExam le = new ListExam();
		le.add("123");
		System.out.println(le.get(0));
	}

}
