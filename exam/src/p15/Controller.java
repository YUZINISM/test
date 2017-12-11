package p15;

import java.util.ArrayList;

public class Controller extends Server {
//	public void print() {
//		super.print();
//		System.out.println("그리고 콘드롤도 담당합니다.");
//		
//	}
//	
//	public void print(int a) {
//		super.print();
//		System.out.println("숫자도 출력합니다: " +a);
//	}//DAO  이전
	
	private Service server;
	public Controller() {
		server = new Service();
	}
	
	public ArrayList<User> getUserList(String str){
		return server.getUserList(str);
	}
}
