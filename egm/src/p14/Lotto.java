package p14;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lotto {
	
	
	boolean isDupl(ArrayList<Integer> al,int n, int maxNum) {
		for(int i=0; i<maxNum; i++) {
			if(n == al.get(i)) {				
				return true;
			}			
		}return false;	
	}
	
	
	
	ArrayList<Integer> mkLotto(String choice) {
		Random r = new Random();
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		if(choice.equals("outo")) {
			
			for(int i=0; i<6; i++) {
				int n = r.nextInt(45) + 1 ;
				if(isDupl(al, n, i)) {
					i--;					
				}else {
					
					al.add(n);					
				}				
			}return al;			
		} 
		else if(choice.equals("semiouto")) {
			System.out.println("몇개까지 자동으로 할꺼냐?");
			int cnt = new Scanner(System.in).nextInt();			
			
			for(int i=0; i<cnt; i++) {
				int n = r.nextInt(45) + 1 ;
				if(isDupl(al, n, i)) {
					i--;					
				}else {					
					al.add(n);					
				}				
			}
			System.out.println(	6-cnt + "번 숫자 입력하면됨");
			for(int i=0; i<6-cnt; i++) {
				System.out.println(	(i+1) + "번 숫자 입력ㄱㄱ");
				int n = new Scanner(System.in).nextInt();
				if(al.indexOf(n) > -1 || n > 45) {					
					System.out.println("중복된 숫자거나 45보다 커용");
					i--;					
				}else {					
					al.add(n);
				}			
			}return al;				
		}
		else if(choice.equals("active")) {
			System.out.println(	6 + "번 숫자 입력하면된당.");
			for(int i=0; i<6; i++) {
				System.out.println(	(i+1) + "번 숫자 입력ㄱㄱ");
				int n = new Scanner(System.in).nextInt();
				if(al.indexOf(n) > -1 || n > 45) {					
					System.out.println("중복된 숫자거나 45보다 커용");
					i--;					
				}else {					
					al.add(n);
				}			
			}return al;			
		}
		return null;
		
	}
	
	ArrayList<Integer> castLotto() {
		Random r = new Random();
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		for(int i=0; i<6; i++) {
			int n = r.nextInt(45) + 1 ;
			if(isDupl(al2, n, i)) {
				i--;					
			}else {
				
				al2.add(n);					
			}				
		}return al2;			
		
	}
	
	int getSetNum(ArrayList<Integer> al, ArrayList<Integer> al2) {
		int cnt=0;
		for(int i=0; i<al.size(); i++) {
			for(int j=0; j<al.size(); j++) {
				if(al.get(i) == al2.get(j)) {
					cnt++;					
				}				
			}		
		}return cnt;		
	}
	
	
	public static void main(String[] args) {
		
		Lotto l = new Lotto();
		
		Scanner s = new Scanner(System.in);
		System.out.println("outo 랑 active 아니면 semiouto");
		String str = s.nextLine();
		
		ArrayList<Integer> al = new ArrayList<Integer>();		
		al = l.mkLotto(str);
		
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2 = l.castLotto();
		
		System.out.println(al);
		System.out.println(al2);
		int a = l.getSetNum(al, al2);
		
		
		System.out.println("맞은 갯수는 : " + a);
		
		
		
		
	}
	
	

}
