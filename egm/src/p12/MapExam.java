package p12;

import java.util.LinkedHashMap;
import java.util.Random;

public class MapExam {
	
	String str;
	LinkedHashMap<Integer, String> hm = new LinkedHashMap<Integer, String>();
	
	void add(String str) {
		hm.put(hm.size(), str);
		System.out.println(hm.size());
		
	}
	
	void add(int idx) {		
		
		hm.put(idx, hm.size()+ 1 + "번째 값");
		
	}	
	
	boolean isDupl(Integer[] it, int n, int maxNum) {
		for(int i=0; i<maxNum; i++) {
			if(n == it[i]) {	
				return true;
			}			
		}return false;	
	}
		
	public static void main(String[] args) {
		
		MapExam me = new MapExam();
//		me.add("sfa");
//		me.add("sfa");
//		me.add("sfa");
//		me.add("sfa");
//		Integer[] it = new Integer[10];
//		
//		for(int i=0; i<10; i++) {			
//			int n = new Random().nextInt(10);
//			it[i] = n;
//			if(me.isDupl(it, n, i)) {
//				i--;				
//			}
//			else{				
//				me.add(n);			
//			}		
//			
//		}		
		
		for(int i=0; i<10; i++) {
			int n = new Random().nextInt(10);
			if(me.hm.get(n) == null) {
				me.add(n);				
			}else {
				i--;
			}
		}
		
		
		System.out.println(me.hm);
		
		
	}

}
