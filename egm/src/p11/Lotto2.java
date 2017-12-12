package p11;

import java.util.Random;
import java.util.Scanner;

public class Lotto2 {
	int[] joins;
	int[] gets;
	
	
	
	int[] aaa() {
		Scanner s = new Scanner(System.in);
		System.out.println("참여인원을 입력하세요.");
		return joins = new int[s.nextInt()];
	}
	
	int[] bbb() {
		Scanner s = new Scanner(System.in);
		System.out.println("추첨인원을 입력하세요.");
		return gets = new int[s.nextInt()];	
	}
	
	void mkNums(int[] a) {		
		Random r = new Random();
		for(int i=0; i<a.length; i++) {
			int check = r.nextInt(joins.length * 2) +1 ;
			if(isDupl(a, check, i)) {
				i--;
			}else {
				a[i] = check;
			}
		}				
	}
	
	boolean isDupl(int[] a, int check, int maxNum) {
		for(int i=0; i<maxNum; i++) {
			if(check == a[i]) {
				return true;
			}			
		}
		return false;
	}
	
	void mkGetNum(int[] a) {
		for(int i=0; i<a.length; i++) {
			Random r = new Random();
			int check = r.nextInt(joins.length * 2) + 1;
			for(int j=0; j<joins.length; j++) {
				if(isDupl(a, check, i) || isExclude(check) ) {
					i--;					
				}				
			}
		}			
	}
	
	boolean isExclude(int check) {
		for(int i=0; i<joins.length; i++) {
			if(check == joins[i]) {
				return false;
			}			
		}
		return true;
	}
	
	void getSetNum(int[] a, int[]b) {
		
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<b.length; j++) {
				if(a[i] == b[j]) {
					System.out.println(i);					
				}				
			}			
		}				
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		Lotto2 lt = new Lotto2();
		lt.aaa();
		lt.bbb();
		lt.mkNums(lt.joins);
		lt.mkGetNum(lt.gets);
		lt.getSetNum(lt.joins, lt.gets);
	}

}
