package p13;

import java.util.ArrayList;
import java.util.Scanner;

public class Excute {
	
	public static void main(String[] args) {
		
		Person p = new Person();
//		System.out.println(p.name);
//		System.out.println(p.age);
		
//		p.name = "JaeJae";
//		p.age = 33;
		
//		p.setName("JaeJae");
//		p.setAge(34);
		
		ArrayList<Person> alPerson = new ArrayList<Person>();
//		alPerson.add(p);
		
//		p.name = "Jae";
//		p.age = 33;
//		p = new Person();
//		alPerson.add(p);
//		p.name = "JaeYu";
//		p.age = 34;
//		
//		System.out.println(alPerson.get(0).getName());	
//		System.out.println(alPerson.get(0).getAge());
		
		// 이름과 나이 --> 나이가 많은데로
		
//		p = new Person();
//		p.setName("Tyan");
//		p.setAge(33);
//		alPerson.add(p);
//		
//		p = new Person();
//		p.setName("Tyyywsan");
//		p.setAge(30);
//		alPerson.add(p);
		
		Scanner s = new Scanner(System.in);
		System.out.println("몇개의 리스트를 만들꺼냐?");
		int n = s.nextInt();
		for(int i=0; i<n; i++) {
			p = new Person();
			System.out.println("Input age");
			p.setAge(s.nextInt());
			s.nextLine();
			System.out.println("Make name!");
			p.setName(s.nextLine());
			alPerson.add(p);			
		}
		
		
		
		
		for(int i=0; i<alPerson.size(); i++) {
			for(int j=i+1; j<alPerson.size(); j++) {
				if(alPerson.get(i).getAge() > alPerson.get(j).getAge()) {
					int temp = 0;
					int tempp = 0;
					temp = alPerson.get(i).getAge() ;
					tempp = alPerson.get(j).getAge() ;
					alPerson.get(i).setAge(tempp);
					alPerson.get(j).setAge(temp);
					
					String str = "";
					String strr = "";
					str = alPerson.get(i).getName();
					strr = alPerson.get(j).getName();
					alPerson.get(i).setName(strr);
					alPerson.get(j).setName(str);					
				}				
			}			
		}
				
		for(Person pr : alPerson) {
			
			System.out.println(pr);	
			
		}
		
		
		
		
	}	

}
