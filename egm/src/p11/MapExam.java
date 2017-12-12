package p11;

import java.util.ArrayList;
import java.util.HashMap;

public class MapExam {
	
	public static void setHm(HashMap<String, String> hm) {
		hm.put("name", "최재열");
		hm.put("age", "26");
		hm = new HashMap<String, String>();
	}
	
	
	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();
		
//		hm.put("name", "최재열");
//		hm.put("name", "최재희");
//		hm.put("age", "최재희");
		
//		System.out.println(hm.get("name"));
		
		ArrayList<HashMap<String, String>> alMap = new ArrayList<HashMap<String, String>>();
		alMap.add(hm);
//		hm = new HashMap<String, String>();		
		setHm(hm);
//		hm = new HashMap<String, String>();
		
		System.out.println(hm.get("name"));
		System.out.println(hm.get("age"));
		
		System.out.println(alMap.get(0).get("name"));
		System.out.println(alMap.get(0).get("age"));
		
		
//		alMap.add(hm);
//		hm.put("age", "최재열");
//		
//		System.out.println(alMap.get(0).get("age"));
		
		
		
	}

}
