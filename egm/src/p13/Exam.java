package p13;

import java.util.ArrayList;

public class Exam {
	
	static void tt(ArrayList<Person> al) {
		
		al = new ArrayList<Person>();
		
		al.add(new Person());		
		
	}
	
	public static void main(String[] args) {
		
		ArrayList<Person> al = new ArrayList<Person>();
		Person p = new Person();
		al.add(p);
//		System.out.println(al.get(0).getAge());
		p.setAge(3);
		tt(al);
		System.out.println(al.get(0).getAge());
		
					
		
		
	}

}
