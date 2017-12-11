package p15;

import java.util.ArrayList;

public class DAO {

	public ArrayList<User> getUserList(String str) {
		
		User u = new User("나나", 30);
		ArrayList<User> userList = new ArrayList<User>();
		userList.add(u);
		u = new User("미미", 20);
		userList.add(u);
		
		return userList;

	}

}
