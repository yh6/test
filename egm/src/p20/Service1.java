package p20;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Service1 {
		
		DBCon dbcon;
		Service1(){
			dbcon = new DBCon();
		}
		public int updateUserInfo(LinkedHashMap<String,Object> hm) {
			int result = 0;
			String sql = "update user_info set uiname=? where uino=?";
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
		public int insertUserInfo(LinkedHashMap<String,Object> hm) {
			int result = 0;
			String sql = "insert into user_info(uiname,uiage,uiid,uipwd,address,cino) values(?,?,?,?,?,3)";
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
		public int deleteUserInfo(LinkedHashMap<String,Object> hm) {
			int result = 0;
			String sql = "delete from user_info where uino=?";
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
		public ArrayList<HashMap<String,Object>> selectClassInfo(LinkedHashMap<String,Object> hm) throws SQLException {
			String sql = "select * from user_info where uino=?" ;
		try {
			dbcon.executeQuery(sql, hm);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dbcon.executeQuery(sql, hm);
		}
	}
