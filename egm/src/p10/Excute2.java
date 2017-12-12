package p10;

public class Excute2 {
	
	
	public static void main(String[] args) {
		
//		Object p1 = new Person();
//		Object p2 = new P2();
//		
//		System.out.println(p1.toString());
//		System.out.println(p2.toString());
		Object[] ob = new Object[3];
		ob[0] = new P2();
		ob[1] = new P3();
		ob[2] = new P4();
		Excute2 e = new Excute2();
		
		for(Object o : ob) {
			
			
		}
		
		for(int i=0; i<ob.length; i++) {			
			System.out.println(ob[i]);
		}	
	}
}
