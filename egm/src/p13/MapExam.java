package p13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class MapExam {
	
	public static void main(String[] args) {
		
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("age", 10+"");
		hm.put("name", "최재열");
//		String age = hm.get("age");
//		age = "30";
//		
//		System.out.println(hm);

	
		
		ArrayList<HashMap<String, String>> al = new ArrayList<HashMap<String, String>>();
		Random r = new Random();
//		for(int i=0; i<10; i++) {
//			hm = new HashMap<String, String>();
//			String str = r.nextInt(100) +1 +"";
//			for(int j=0; j<i; j++) {
//				if(i!=0) {
//					if(al.get(j).get("age") == str) {
//						i--;					
//					}else {
//						hm.put("age", str + "");					
//						hm.put("name", i + "최재열");		
//						al.add(hm);
//					}	
//					
//				}else {
//					hm.put("age", str + "");					
//					hm.put("name", i + "최재열");		
//					al.add(hm);					
//				}							
//			}						
//		}
		
		for(int i=0; i<10; i++) {
			hm = new HashMap<String, String>();
			String str = r.nextInt(100) +1 +"";
			hm.put("age", str + "");					
			hm.put("name", i + "최재열");		
			al.add(hm);
		}
	
			
			
			
		for(int i=0; i<al.size(); i++) {			
			for(int j=i+1; j<al.size(); j++) {
				if(Integer.parseInt(al.get(i).get("age")) > Integer.parseInt(al.get(j).get("age"))) {
					HashMap<String, String> tempHm = al.get(i);
					HashMap<String, String> tempHmm = al.get(j);
					
					al.set(i, tempHmm);
					al.set(j, tempHm);					
					
				}								
			}			
		}
					
		
		
		
		
		
		
		
		for(HashMap<String, String> h : al) {
			System.out.println(h);
			
		}
		
		
		
		
		
	}

}
