//package p18;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//
//public class Connector {
//	
//	private Connection con;
//	private String url = "jdbc:mariadb://localhost:3306/iot2";
//	private String user = "root";
//	private String password = "test";
//	public Connector() throws SQLException {
//		Class.forName("org.mariadb.jdbc.Driver");
//		
//	}
//	
//	public Connection getConnection() throws SQLException {
//		if(con == null) {
//			con = DriverManager.getConnection(url, user, password);
//		}return con;
//		
//	}
//
//	public void close() throws SQLException {
//		if(con != null) {
//			con.close();
//		}con = null;
//	}
//	public static void main(String args[]) {
//
//		
//		Connection con = null;
//		try {
//			
//			System.out.println("연결완료:" + con);
//			String sql = "select * from user_info";
//			sql += " where uino <5";
//			PreparedStatement ps = con.prepareStatement(sql);
//			ResultSet rs = ps.executeQuery();
//			List<UserInfo> userList = new ArrayList<UserInfo>();
//			 
//			while (rs.next()) {
//				UserInfo ui= new UserInfo();
//				ui.setUiNo(rs.getInt("uino"));
//				ui.setUiName(rs.getString("uiname"));
//				ui.setUiId(rs.getString("uiid"));
//				ui.setUiAge(rs.getInt("uiage"));
//				ui.setUiPwd(rs.getString("uipwd"));
//				ui.setUiRegDate(rs.getString("uiregdate"));
//				ui.setCino(rs.getInt("cino"));
//				ui.setAddress(rs.getString("address"));
//				userList.add(ui);
//				}
//				for (UserInfo ui2 : userList) {
//					System.out.println(ui2);
//				}
//
//				// String uiId = rs.getString("uiid");
//				// String uiName = rs.getString("uiname");
//				// System.out.println(uiId + "+" + uiName);
//				//// String uiAge = rs.getString("uiage");
//				//// String uino = rs.getString("uino");
//				//// String uiPwd = rs.getString("uipwd");
//				//// String cino = rs.getString("cino");
//				//// String uiregdate = rs.getString("uiregdate");
//
//				//
//				//// System.out.println(번호:uiId + "+" + uiName);
//				//// System.out.println(","+"나이ui + "+" + uiName);
//				//// System.out.println(비번uiId + "+" + uiName);
//				//// System.out.println(반번호uiId + "+" + uiName);
//				//// System.out.println(등록일자uiId + "+" + uiName);
//				//// System.out.println(주소uiId + "+" + uiName);
//			
//		}catch(
//
//	SQLException e)
//	{
//		System.out.println("erro!!!!!!!!");
//		e.printStackTrace();
//	}catch(
//	ClassNotFoundException e)
//	{
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}finally
//	{
//		if (con != null) {
//			try {
//				con.close();
//				con = null;
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//	}
//}