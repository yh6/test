package p12;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class HomeWorkReplace {
	
	boolean isDupl(Integer[] it, int lastI, int check) {
		
		for(int i=0; i<lastI; i++) {
			if(it[i] == check) {				
				return true;				
			}				
		}return false;		
	}
	
	public static void main(String[] args) {
		HomeWorkReplace hwr = new HomeWorkReplace();
		Scanner s = new Scanner(System.in);
		System.out.println("최소값");
		int minNum = s.nextInt();
		System.out.println("최대값");
		int maxNum = s.nextInt();
		
		
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		Integer[] it = new Integer[maxNum - minNum];		
		
		for(int i=0; i<maxNum - minNum; i++) {			
			Integer check = new Random().nextInt((maxNum - minNum) + minNum);
			it[i] = check;
			it[i] = new Random().nextInt((maxNum - minNum) + minNum);
			if(hwr.isDupl(it, i, check)) {
				i--;				
			}			
		}
		
		
		
		
		
		for(int i=0; i<(maxNum - minNum)/2; i++) {			
			al.add(it[i]);			
		}
		
		System.out.println(al.toString());
		
		System.out.println(it.length);
		System.out.println(al.size());
	}
	

}
