package book;

import java.util.Scanner;

public class FlowEx4 {
	public static void main(String[] args) {
		int score = 0;     //점수를 입력하기 위한 변수
		char grade = ' ';  //학점을 저장하기 위한 변수-공백으로 초기화
		
		System.out.print("점수을 입력해주세요");
		Scanner s = new Scanner(System.in);
		score = s.nextInt();  //화면에서 입력받은 숫자를 score저장
		
		if(score >=90) {       //score 90점이상  A학점
			grade = 'A';			
		}else if(score >=80) {    //score 80점이상  B학점
			grade = 'B';
		}else if(score >=70) {    //score 70점이상  C학점
			grade = 'C';
	    }else {
	    	grade = 'D';         // 나머지는 D학점
	    }
		System.out.println("당점의 학점은 "+grade+"입니다.");
	}
}
