package p20;

import java.sql.SQLException;
import java.util.LinkedHashMap;

public class Excute {
	
	public static void main(String[] agrs) throws SQLException {
		Service s = new Service();
		LinkedHashMap<String,Object> hm = new LinkedHashMap<String,Object>();
		hm.put("cino",2);
		hm.put("cidesc","네트워크보안반123");
		int result = s.updateClassInfo(hm);
		if(result==1) {
			System.out.println("업데이트가 잘 되었습니다.");
		}
		hm = new LinkedHashMap<String,Object>();
		hm.put("ciname","패션디자인과");
		hm.put("cidesc","앙드레김");
		result= s.insertClassInfo(hm);
		if(result==1) {
			System.out.println("추가되었습니다.");
		}
		
		hm = new LinkedHashMap<String,Object>();
		hm.put("cino",7);
		result = s.deleteClassInfo(hm);
		if(result==1) {
			System.out.println("삭제되었습니다.");
		}
		
		hm = new LinkedHashMap<String,Object>();
		hm.put("cino",4);
		System.out.println(s.selectClassInfo(hm));
	}

}