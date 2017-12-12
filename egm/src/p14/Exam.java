package p14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

public class Exam {
	
	
	public HashMap<Integer, ArrayList<Integer>> getAL (int num) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=1; i<=num; i++) {
			if(num % i == 0) {				
				al.add(i);				
			}			
		}
		HashMap<Integer, ArrayList<Integer>> hm = new HashMap<Integer, ArrayList<Integer>>();
		hm.put(num, al);
		return hm;
	}
	
//	public ArrayList<Integer> getAL (int num){
//		ArrayList<Integer> al = new ArrayList<Integer>();
//		for(int i=1; i<=num; i++) {
//			if(num % i == 0) {				
//				al.add(i);				
//			}			
//		}
//		return al;				
//	}

	
	
	
	
	public static void main(String[] args) {
		Exam e = new Exam();

//		ArrayList<HashMap<Integer, ArrayList<Integer>>> ALHM = new ArrayList<HashMap<Integer, ArrayList<Integer>>>();
//		
//		
//		for(int i=0; i<10; i++) {
//			int n = new Random().nextInt(50)+1;
//			HashMap<Integer, ArrayList<Integer>> hm = e.getAL(n);
//			ALHM.add(hm);			
//			
//		}
		
//		HashMap<Integer, ArrayList<Integer>> hm = new HashMap<Integer, ArrayList<Integer>>();
//		
//		
//		ArrayList<Integer> dAl = new ArrayList<Integer>();
//		int keyNum = 0;
//		
//				
//		for(int i=0; i<5; i++) {
//			int n = new Random().nextInt(50) + 1;
//			hm.put(n, e.getAL(n));
//			dAl.add(n);			
//		}
		
		
//		
		HashMap<Integer, ArrayList<Integer>> hm = new HashMap<Integer, ArrayList<Integer>>();
		
		Random r = new Random();
		for(int i=0; i<5; i++) {
			int n = r.nextInt(51)+50;
			hm.putAll(e.getAL(n));			
		}
		
		System.out.println(hm);
		
		ArrayList<Integer> alt = new ArrayList<Integer>();
		
		Iterator<Integer> it = hm.keySet().iterator();		
		
		System.out.println("");
		while(it.hasNext()) {
			Integer key = it.next();
			System.out.println(hm.get(key).size());
			alt.add(key);
		}
		
		System.out.println(alt);
		
		System.out.println("");
		
		for(int i=0; i<alt.size(); i++) {
			for(int j=i+1; j<alt.size(); j++) {
				if(hm.get(alt.get(i)).size() > hm.get(alt.get(j)).size()) {
					ArrayList<Integer> pp = hm.get(alt.get(i));
					ArrayList<Integer> ppp = hm.get(alt.get(j));
					
					hm.put(alt.get(i), ppp);
					hm.put(alt.get(j), pp);							
				}				
			}
			
		}
		
		System.out.println("");
//		System.out.println(hm);
		
		Iterator<Integer> it2 = hm.keySet().iterator();
		while(it2.hasNext()) {
			Integer key = it2.next();
			System.out.println(hm.get(key).size());
//			alt.add(key);
		}
		
		
		

		
		
		
		
		
//		HashMap<Integer, ArrayList<Integer>> hm = e.getAL(30);
		
		
		
		
//		System.out.println(hm);
		
	}

}
