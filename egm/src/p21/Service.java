package p21;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Service {
	
	DBCon dbcon;
	Service(){
		dbcon = new DBCon();
	}
	public int makeSql(int option ,LinkedHashMap<String,Object> hm ) {
		if(option==1) {
			String sql="select *from class_info where cino = ?";
			selectClassInfo(hm,sql);
			return 4;
		}else if(option==2) {
			String sql="insert into class_info(cidesc,ciname) "+
					" values(?,?) ";
			return iduClassInfo(hm,sql);
			
		}else if(option ==3) {
			String sql="delete from class_info "+
					" where cino =? ";
			return iduClassInfo(hm,sql);
		}else {
			String sql="update class_info\r\n" + 
					"set cidesc= ?\r\n" + 
					"where cino=?";
			return iduClassInfo(hm,sql);
		}
	}
//	public boolean checkSql(LinkedHashMap<String,Object> hm) {
//		String sql="select *from class_info";
//		ArrayList<HashMap<String,Object>> objList;
//		try {
//			objList= dbcon.executeQuery(sql,hm);
//			for(HashMap<String, Object> list:objList) {
//				list.get(key)
//			}
//			try {
//				dbcon.commit();
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}
	
	public int iduClassInfo(LinkedHashMap<String,Object> hm,String sql) {
		int result=0;
		try {
			result=dbcon.executeUpdate(sql ,hm);
			dbcon.commit();
			try {
				dbcon.rollback();
			}catch(SQLException e) {
			e.printStackTrace();
			}	
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	public void selectClassInfo(LinkedHashMap<String,Object> hm,String sql) {
		ArrayList<HashMap<String,Object>> objList;
		try {
			objList= dbcon.executeQuery(sql , hm);
			for(HashMap<String, Object> list:objList) {
				System.out.println(list);
			}
			try {
				dbcon.commit();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
