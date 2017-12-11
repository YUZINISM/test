package p15;

import java.util.ArrayList;

public class Service extends Server {

	private DAO dao;
	
	public Service() {
		dao = new DAO();
	}
	
	public ArrayList<User> getUserList(String str){
		return dao.getUserList(str);
	}
}
