package p20;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Service {
	
	DBCon dbcon;
	Service(){
		dbcon = new DBCon();
	}
	public int updateClassInfo(LinkedHashMap<String,Object> hm) {
		int result = 0;
		String sql = "update class_info" + 
				" set cidesc=?" + 
				" where cino=?";
		try {
			result = dbcon.executeUpdate(sql,hm);
			dbcon.commit();
		} catch (SQLException e) {
			try {
				dbcon.rollback();
			}catch (SQLException e1) {
			e1.printStackTrace();
		}
		e.printStackTrace();
	}finally {
			try {
				dbcon.closeAll();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	
	public int insertClassInfo(LinkedHashMap<String,Object> hm) {
		int result = 0;
		String sql = "insert into class_info(ciname,cidesc) values(?,?)";
		try {
		result = dbcon.executeUpdate(sql, hm);
		dbcon.commit();
		}catch (SQLException e) {
		try {
			dbcon.rollback();
		}catch (SQLException e1) {
		e1.printStackTrace();
	}
	e.printStackTrace();
}finally {
		try {
			dbcon.closeAll();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	return result;
	}
	
 public int deleteClassInfo(LinkedHashMap<String,Object> hm) {
	int result = 0;
	String sql = "delete from class_info where cino=?";
	try {
	result = dbcon.executeUpdate(sql, hm);
	dbcon.commit();
} catch (SQLException e) {
	try {
		dbcon.rollback();
	}catch (SQLException e1) {
	e1.printStackTrace();
}
e.printStackTrace();
}finally {
	try {
		dbcon.closeAll();
	}catch(SQLException e) {
		e.printStackTrace();
	}
}
return result;
}
 /*public ArrayList<HashMap<String,Object>> selectClassInfo(LinkedHashMap<String,Object> hm)  {
	 ArrayList<HashMap<String,Object>> result = null;
		String sql = "select * from class_info where cino=?" ;
	try {
		result = dbcon.executeQuery(sql, hm);
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return result;
	}*/
 public ArrayList<HashMap<String,Object>> selectClassInfo(LinkedHashMap<String,Object> hm) throws SQLException  {
		String sql = "select * from class_info where cino=?" ;
	try {
		 dbcon.executeQuery(sql, hm);
	} catch (SQLException e) {
		e.printStackTrace();
	}finally {
		try {
			dbcon.closeAll();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	return dbcon.executeQuery(sql, hm);
	}
}
