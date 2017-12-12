package p11;

import java.util.ArrayList;
import java.util.Random;

public class ListExam4 {
	
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		Random r = new Random();
		for(int i=0; i<21; i++) {			
			al.add(r.nextInt(100)+1);
		}
		
		
		Integer cnt = 0;
		for(Integer i : al) {
			cnt += i;			
		}
		
		System.out.println(cnt);		
		
		
		
		
	}

}
