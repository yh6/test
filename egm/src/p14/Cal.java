package p14;

import java.util.ArrayList;

public class Cal {
	
	
	int calculate(int a, int b, String c) {
		if(a < b) {
			int temp = 0;
			temp = a;
			a = b;
			b = temp;			
		}
		
		if(c.equals("+")) {
			return a + b;
		}
		else if(c.equals("-")) {			
			return a - b;
		}
		else if(c.equals("*")) {			
			return a * b;			
		}
		else if(c.equals("/")) {			
			return a / b;
		}
		
		return 0;		
		
	}
	
	
	public static void main(String[] args) {
		
		Cal c = new Cal();
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		int a = 33;
		int b = 56;
		
		
		al.add(c.calculate(a, b, "+"));
		al.add(c.calculate(a, b, "-"));
		al.add(c.calculate(a, b, "*"));
		al.add(c.calculate(a, b, "/"));
				
		
		for(int i=0; i<al.size(); i++) {
			for(int j=i+1; j<al.size(); j++) {
				if(al.get(i) < al.get(j)){
					int t = al.get(i);
					int tt = al.get(j);
					
					al.set(i, tt);
					al.set(j, t);					
				}
			}			
		}
		
		
		
		
		
		
		
		
		System.out.println(al);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
