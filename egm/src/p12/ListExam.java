package p12;

import java.util.ArrayList;
import java.util.Scanner;

public class ListExam {
	
	private ArrayList<String> alStr;
	
	ListExam() {		
		alStr = new ArrayList<String>();
	}
	
	
	void add(String str) {
//		if(alStr.size() == 0) {			
//			System.out.println("처음이네");			
//		}		
//		else {
//			System.out.println(alStr.get(alStr.size()-1));			
//		}		
		alStr.add(str);		
	}
	
	void inputAlStr() {
		Scanner s = new Scanner(System.in);
		System.out.println("숫자스트링을 넣어주세요. 구분자는 , 입니다.");
		String str = s.nextLine();
//		str = "123156,14651,1465";
		String[] strs = str.split(",");
		
		for(String ss : strs) {			
			alStr.add(ss);
			
		}
		
		
		
			
			
			
	}
		
				
			
		
		
		
	
	
	
	String get(int idx) {		
		return alStr.get(idx);		
	}
	
	void remove(int idx) {
		alStr.remove(idx);		
	}
	
	
	void print() {		
//		for(String s : alStr) {
//			System.out.println(s);			
//		}		
		
		
		
//		for(int i=0; i<alStr.size(); i++) {
//			if(alStr.size()%2 == 0) {
//				alStr.remove(i);
//			}else {
//				alStr.remove(i);
//			}					
//		} 
		// 위에껀 홀짝홀짝 순서대로 되어 있어야 가능, 만약에 홀짝이 순서없이 배열되어있다면 오류!
		
		
		for(int i=0; i<alStr.size(); i++) {
			
			if(Integer.parseInt(alStr.get(i))%2 == 0) {
				alStr.remove(i);
				i--;
			}else {				
				System.out.println("index "+ i + " -> "  + alStr.get(i));				
			}			
		}
		
		
//		for(int i=0; i<alStr.size(); i++) {
//			String numStr = alStr.get(i);
//			int num = Integer.parseInt(numStr);
//			if(num%2 == 0) {
//				alStr.remove(i);
//				i--;
//			}else {				
//							
//			}			
//		}

			
		
		
		
//		for(int i=0; i<alStr.size(); i++) {
//			System.out.println("index "+ i + " -> "  + alStr.get(i));				
//		}
//		
	}
	
	void printAlStr2() {
		
		for(int i=0; i<alStr.size(); i++) {
			
			String numStr = alStr.get(i);
			System.out.println("index "+ i + " -> "  + numStr);	
			
		}
	
	}
	
	void parseSum() {
		int sum = 0;
		for(String s : alStr) {
			sum += Integer.parseInt(s);
			
		}
		
		System.out.println("합은 : " + sum);
		
		
	}
	
	
	
	
	
}	
	


