package p15;

import java.util.ArrayList;

public class Execute {

	public static void main(String args[]) {

		 User u = new User("나나", 30);
		
//		 ArrayList<User> userList = new ArrayList<User>();
//		 userList.add(u);
//		 u = new User("미미",20);
//		 userList.add(u); //잘라내서 dao 줫음
		DAO dao = new DAO();
		ArrayList<User> userList = dao.getUserList("");
		for (User user : userList) {
			System.out.println(user);
		}
	}
}
