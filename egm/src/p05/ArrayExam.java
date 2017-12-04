package p05;

import java.util.Scanner;

public class ArrayExam {
	int num1;
	int num2;
	int[][] numArr;
	
	void inputNums() {
		Scanner s = new Scanner(System.in);
		System.out.println("1차원 배열변수의 갯수를 입력해주세요.");
		int num1 = s.nextInt();
		System.out.println("2차원 배열변수의 갯수를 입력해주세요.");
		int num2 = s.nextInt();
	}
	
	void initNumArr() {
		numArr = new int[num1][num2];
		for (int i = 0; i < numArr.length; i++) {
			for (int j = 0; j < numArr[i].length; j++) {
				numArr[i][j] = j+1 + (i*numArr[i].length);		
			}
		}
	}
	void printNumArr() {
		for (int i=0; i<numArr.length; i++) {
			for (int j=0; j< numArr[i].length; j++) {
				System.out.print(numArr[i][j]);
				if (j!= numArr[i].length-1) {
					System.out.print(",");
				} else {
					System.out.println();
				}
			}
		}
	}
		public static void main(String[] args){
			
			
			
					ArrayExam ae = new ArrayExam();
					ae.inputNums();
					System.out.println(ae.num1);
					System.out.println(ae.num2);
					ae.initNumArr();
					ae.printNumArr();
					
		}
	}
		



