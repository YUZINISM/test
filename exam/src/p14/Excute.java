package p14;

public class Excute {

	public static void main(String args[]) {

		MapExam1<String, String> me = new MapExam1<String, String>();
		me.put("정상원","22");
		me.put("홍길동","12");
		me.put("박상원","66");
		me.put("김길동","18");
		me.put("한길동","55");
		
		
		
		System.out.println(me);
	}
}
