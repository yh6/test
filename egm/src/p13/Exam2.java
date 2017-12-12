package p13;

import java.util.ArrayList;

public class Exam2 {
	
	public static void main(String[] args) {
		
		ArrayList<Person> al = new ArrayList<Person>();
		
		Person p = new Person();
		
		al.add(p);
		p.setAge(1);
		
		al.add(p);
		p.setAge(2);

		al.add(p);
		p.setAge(3);
		
		al.add(p);
		p.setAge(4);
		
		al.add(p);
		p.setAge(5);
		
		for(int i=0; i<al.size(); i++) {
			
			System.out.println(al.get(i).getAge());
			
		}
		
		for(int i=0; i<al.size(); i++) {
			Person pr = al.get(i);
			pr.setAge(i);			
			
		}
		
				
		
		for(int i=0; i<al.size(); i++) {
			
			System.out.println(al.get(i).getAge());
			
		}
		
		
		
		
		
	}

}
