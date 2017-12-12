package p11;

import java.util.ArrayList;
import java.util.Random;

public class ListExam {	
	
	void getNum(ArrayList<Integer> a) {
		Random r = new Random();
		for(int i=0; i<6; i++) {			
			int n = r.nextInt(45)+1;
			if(a.indexOf(n) == -1) {
				a.add(n);				
			}else {
				i--;
			}			
		}		
	}
	
	void print(ArrayList<Integer> a) {
		String str = "";
		for(Integer i : a) {
			str += i + ", ";			
		}System.out.println(str.substring(0, str.length()-2));				
	}
	
	void getSetNum(ArrayList<Integer> a, ArrayList<Integer> b) {
		int cnt = 0;
		for(Integer i : a) {
			for(Integer j : b) {
				if(i == j) {
					cnt++;
				}				
			}
		}System.out.println(cnt);		
	}
	
	
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("test");
//		al.add(true);
//		al.add(1);
//		al.add('c');    <String> 일때는 스트링만 넣을 수 있다.
		
		ListExam le = new ListExam();
		
		ArrayList<Integer> ai = new ArrayList<Integer>();
//		
//		for(int i=0; i<6; i++) {
//			Random r = new Random();
//			int n = r.nextInt(45)+1;
//			if(ai.indexOf(n)==-1) {
//				ai.add(n);
//			}else {
//				i--;
//			}					
//		}
		
		ArrayList<Integer> ait = new ArrayList<Integer>();
		
		le.getNum(ai);
		le.getNum(ait);
		le.print(ai);		
		le.print(ait);
		System.out.println("");
		le.getSetNum(ai, ait);
		
		
		
		
		
		
	
//		for(int i=0; i<6; i++) {
//			Random r = new Random();
//			int n = r.nextInt(45)+1;
//			if(ait.indexOf(n)==-1) {
//				ait.add(n);
//			}else {
//				i--;
//			}								
//		}		
//		
//		String a = "";
//		for(Integer i : ai) {
//			a += i +", ";
//		}System.out.print(a.substring(0, a.length()-2));
//		
//		System.out.println("");
//				
//		String b = "";
//		for(Integer i : ait) {
//			b += i +", ";
//		}System.out.print(b.substring(0, b.length()-2));
//		
//		int cnt = 0;
//		for(Integer i : ai) {
//			for(Integer j : ait) {
//				if(i.equals(j)) {
//					cnt++;				
//				}				
//			}			
//		}
//
//
//		System.out.println("");
//		System.out.println(cnt);		
		
		
		
//		System.out.println(al.get(0));
		int[] a = new int[10];
		a.indexOf(9)
		
	}

}
