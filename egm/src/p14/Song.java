package p14;

import java.util.ArrayList;

public class Song {
	
	
	public static void main(String[] args) {
		
		
		ArrayList<Integer> al =new ArrayList<Integer>();
		
		
		al.add(156);
		al.add(156165);
		
		System.out.println(al);
		
		int num = al.get(0);
		int numm = al.get(1);
		
		al.set(0, numm);
		al.set(1, num);
		System.out.println(al);
		System.out.println(num);
	}
	

}
