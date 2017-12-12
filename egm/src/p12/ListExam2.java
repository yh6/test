package p12;

import java.util.ArrayList;
import java.util.Scanner;

public class ListExam2 {
	// String으로 구성된 List 선언
	// 스캐너 클래스를 사용하여 숫자를 입력받아
	// 해당 숫자만큼 반복해서 List의 값을 
	// 스캐너 변수로 문자열숫자를 입력 받아주세요
	// 중복값이 없어야한다.
	// 만약 중복값이 있따고 이볅할 경우 중복값이 있따고 알려주고
	// 다시 돌아야합니다.
	// List안에 값을  출력하는 함수를 2개 만들어 주시고
	// 첫번째 함수는 짝수일때만 출력
	// 두번째 함수는 홀수 일때만 출력해주세요.
		
	ArrayList<String> al;
	
	int num;
	
	ListExam2(){		
		al = new ArrayList<String>();
		Scanner s = new Scanner(System.in);
		System.out.println("만들 방개수를 입력해주세요.");
		num = s.nextInt();
//		s.close();
	}
	
	void mkList() {
		Scanner s = new Scanner(System.in);
		for(int i=0; i<num; i++) {
			System.out.println(i + "번째로 넣을 숫자 입력");
			String str = s.nextLine();	
			if(al.indexOf(str)!=-1) {
				System.out.println("중복");
				i--	;			
			}else {
				al.add(str);
			}
		}
	}
	
	void printOdd() {
		
		for(int i=0; i<al.size(); i++) {			
			String str = al.get(i);
			int n = Integer.parseInt(al.get(i));
			if(n%2 == 0) {
				al.remove(i);
				i--;
			}
			else {
				System.out.println("index " + i + "->" + al.get(i));									
			}			
		}
	}
		
	void printEven() {
		
		for(int i=0; i<al.size(); i++) {			
			String str = al.get(i);
			int n = Integer.parseInt(al.get(i));
			if(n%2 == 1) {
				al.remove(i);
				i--;
			}
			else {
				System.out.println("index " + i + "->" + al.get(i));							
			}			
		}		
	}
	
	void print() {
		
		System.out.println(al);
	}
	
	
	
	public static void main(String[] args) {
		
		
		
		ListExam2 le = new ListExam2();		
		le.mkList();	
		le.print();
		le.printOdd();
//		le.printEven();
		
	}
	
	
	
	
	
	

}
