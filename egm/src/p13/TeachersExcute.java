package p13;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class TeachersExcute {

	public static void main(String[] args) {

		Person p = new Person();

		ArrayList<Person> alPerson = new ArrayList<Person>();

		// p.setName("재열");
		// p.setAge(26);
		// alPerson.add(p);
		//
		// p = new Person();
		// p.setName("명훈");
		// p.setAge(27);
		// alPerson.add(p);
		//
		// p = new Person();
		// p.setName("희주");
		// p.setAge(19);
		// alPerson.add(p);

		Scanner s = new Scanner(System.in);
		Random r = new Random();
		System.out.println("몇명?");
		int n = s.nextInt();
//		s.nextLine();
		ArrayList<Integer> alInt = new ArrayList<Integer>();
		
		for (int i = 0; i < n; i++) {
//			s.nextLine();
			p = new Person();
			int num = r.nextInt(n);
			if (alInt.indexOf(num) > -1) {
				System.out.println(num);
				i--;
				System.out.println("중복이에용");
			} else {
				System.out.println("이름을 써라");
				String name = s.nextLine();
				p.setName(name);
				p.setLotto(num);
				alInt.add(num);
				alPerson.add(p);
			}
		}

		for (Person ps : alPerson) {
			System.out.println(ps);
		}

		System.out.println("홀수를 입력하면 짝수가 나오고 짝수면 홀수가 나와용");
		int oddEven = s.nextInt();

		for (int i = 0; i < alPerson.size(); i++) {

			if (alPerson.get(i).getLotto() % 2 == (oddEven % 2)) {
				alPerson.remove(i);
				i--;
			}
		}

		// for(int i=0; i<alPerson.size(); i++) {
		// Person pr = alPerson.get(i);
		// for(int j=i+1; j<alPerson.size(); j++) {
		// Person prr = alPerson.get(j);
		// if(pr.getAge() > prr.getAge()) {
		// Person temP = pr;
		// pr = prr;
		// prr = temP;
		// alPerson.set(i, pr);
		// alPerson.set(j, prr);
		// }
		// }
		// }

		for (Person ps : alPerson) {
			System.out.println(ps);
		}

	}

}
