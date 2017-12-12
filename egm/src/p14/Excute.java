package p14;

import java.util.ArrayList;
import java.util.Random;

public class Excute {
	
	public static void main(String[] args) {
		MapExam me = new MapExam();
		
//		me.put("name", "Choi");
//		me.put("name", "Song");
//		me.put("name3", "Kim");
//		me.put("name4", "Park");
//		me.put("name5", "Moon");
//		me.remove("name");
//		System.out.println(me.get("name"));
//		System.out.println(me.size());
//		
//		System.out.println(me);
		
		//랜덤값 1~100
		//ArrayList<MapExam> c추가
		
		
		ArrayList<MapExam> alMapEx = new ArrayList<MapExam>();
		
		for(int i=0; i<10; i++) {	
			me = new MapExam();
			String str = i +"";
			me.put("name", "r" + i);
			me.put("name1", "r" + i);
			me.put("age", (new Random().nextInt(100) +1) + "");
			alMapEx.add(me);			
		}
		
		for(int i=0; i<alMapEx.size(); i++) {
			for(int j=i+1; j<alMapEx.size(); j++) {
				if(Integer.parseInt(alMapEx.get(i).get("age")) > Integer.parseInt(alMapEx.get(j).get("age"))) {
					
					MapExam ex = alMapEx.get(i);
					MapExam exx = alMapEx.get(j);
					
					alMapEx.set(i, exx);
					alMapEx.set(j, ex);					
				}				
			}			
		}
		
		
//		for(MapExam z : alMapEx) {
//			System.out.print(z.get("name") + "->");
//			System.out.println(z.get("age"));
//			
//		}

		for(MapExam z : alMapEx) {
			System.out.println(z);			
			
		}
		
		
		
		
		
	}
}

	
