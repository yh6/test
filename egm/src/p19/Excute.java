package p19;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

public class Excute {
	
	
	public static void main (String[] agrs) {
		UserDAO udao =null;
		try {
			 udao = new UserDAO();
			 udao.openCon();
		HashMap<String,Object>hm = new HashMap<String,Object>();
		hm.put("uiname","test");
		hm.put("uiage",30);
		hm.put("uiid","test");
		hm.put("uipwd","test");
		hm.put("address","서울");
		udao.insertUser(hm);
		udao.deletellser(9);
		udao.commit();
		ArrayList<HashMap<String,Object>> userList = udao.getUserList();
		for(HashMap<String,Object> user : userList) {
			System.out.println(user);
		}
	}catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();

		if(udao!=null)
			try {
			udao.rollback();
	}catch (SQLException e1) {
		e1.printStackTrace();
	}
	}finally {
		if(udao!=null)
			try {
			udao.closeCon();
	}catch (SQLException e) {
		e.printStackTrace();
	}
	}
}
}