package p03;

import java.util.Scanner;

public class ObjectExam {
	int num1;
	int num2;
	
	public ObjectExam() {
		System.out.println("기본 생성자를 호줄하셧군요!");
	}
	
	void add() {
		num1 = 3;
		System.out.println("ObjectExam의 num1 = " + num1);
		System.out.println("add()함수 호출했구나");
	}
	int getNum2(int num2) {
		return num2;
	}
	
	public void inputNums() {
		Scanner s = new Scanner(System.in);
		System.out.println("첫번째 수자를 입력해주세요 : ");
		num1 = s.nextInt();
		System.out.println("두번째 수자를 입력해주세요 : ");
		num2 = s.nextInt();
		
	}
	
	void printoop() {
		for(int i=num1; i<num2; i++) {
			System.out.print(i + ",");
			if(i%10==0) {
				System.out.print("");
			}
		}
		System.out.println(num2);
	}
	
	public static void main(String[] args) {
		ObjectExam o;
		o = new ObjectExam();
		o.inputNums();
		o.inputNums();
		o.inputNums();
		o.inputNums();
		
		
		
	}
}
