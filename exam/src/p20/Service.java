package p20;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.LinkedHashMap;

public class Service {

	DBCon dbcon;
	Service(){
		dbcon = new DBCon();
	}
	
	public int updateClassInfo(LinkedHashMap<String,Object> hm) {
		int result = 0;
		String sql="update class_info set cidesc = '훗 증말' where cino =3";
		
		
		try {
			result = dbcon.executeUpdate(sql,hm);
			dbcon.commit();
		} catch (SQLException e) {
			try {
				dbcon.rollback();
			} catch (SQLException e1) {
				
				e1.printStackTrace();
			}
			e.printStackTrace();
		}finally {
			try {
				dbcon.closeAll();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return result;
	}
}
