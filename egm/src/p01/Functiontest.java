package p01;

public class Functiontest {
	
	static void add(int num1, int num2) {
		System.out.println(num1+num2);	
	}
	
	static String add2(int num1, int num2) {
		return num1 + " 과 " + num2+ "의 합은 " + (num1+num2) + "이란다.";		
	}
		
	public static void main(String[] args) {
		add(1,2);
		String result = add2(1,3);
		System.out.println(result);
		}
	}

