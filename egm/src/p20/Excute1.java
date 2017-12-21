package p20;

import java.sql.SQLException;
import java.util.LinkedHashMap;

public class Excute1 {
	
	public static void main(String[] agrs) throws SQLException {
		Service1 s = new Service1();
		LinkedHashMap<String,Object> hm = new LinkedHashMap<String,Object>();
		hm.put("uiname","흑길동");
		hm.put("uino",2);
		int result = s.updateUserInfo(hm);
		if(result==1) {
			System.out.println("업데이트가 잘 되었습니다.");
		}
		
		hm = new LinkedHashMap<String,Object>();
		hm.put("uiname", "금길동");
		hm.put("uiage",45);
		hm.put("uiid","black");
		hm.put("uipwd","black");
		hm.put("adress","서울");
	    result = s.insertUserInfo(hm);
		if(result==1) {
			System.out.println("추가가 되었습니다.");
		}
		
		hm = new LinkedHashMap<String,Object>();
		hm.put("uino",12);
		result = s.deleteUserInfo(hm);
		if(result==1) {
			System.out.println("삭제 되었습니다.");
		}
		
		hm = new LinkedHashMap<String,Object>();
		hm.put("uino",5);
		System.out.println(s.selectClassInfo(hm));
	}

}
