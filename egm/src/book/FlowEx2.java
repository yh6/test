package book;

import java.util.Scanner;

public class FlowEx2 {
	public static void main(String[] args) {
		int iput;
		System.out.print("숫자를 입력해주세요.>");
		
		Scanner s = new Scanner(System.in);
		String tmp = s.nextLine();
		int input = Integer.parseInt(tmp);
		
		if(input==0) {
			System.out.println("입력하신숫자는 0입니다.");
		}else {
		//if(input!=0) {
			System.out.println("입력하신 숫자는 0이 아닙니다.");
		System.out.printf("입력하신 숫자는 %d", input);
		}//main의 끝
	}
}