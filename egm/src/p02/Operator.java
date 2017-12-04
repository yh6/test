package p02;

public class Operator {
	
	public static void main(String[] args) {
	int a = 3;
	int b = a;
	
	boolean b1 = a==b;
	System.out.println(b1);
	System.out.println(a==b);

	if (a==b) {
		System.out.println("a와 b는 같습니다.");		
	}	
	for(int i=1; i<10; i++) {
		if(i%2==0) {
			System.out.println((i)+"a와 b는 같습니다.");		
		}
	}
	System.out.println("");
			
	for(int i=10; i>0; i--) {
		if(i%2==1) {
			System.out.println((i)+"a와 b는 같습니다.");
		}
	}
	
	int len = 7;
	String[] strArr = new String[len];
	
	for(int i=0; i<strArr.length; i++) {
		strArr[i] = (i+1)+"0";
		System.out.println("strArr[" + i + "]=" + strArr[i]);
		}
	System.out.println("");
	for(len--; len>=0; len--) {
		System.out.println("strArr[" + len + "]="  + strArr[len]);
	}
	
	for(int i=5; i<=100; i+=5) {
		System.out.println(i);
	}
	for(int i=10; i<=100; i+=10) {
		System.out.println(i);
	}
	
	for(int i=5; i<101; i+=10) {
		System.out.println(i);
	}
	
	
	for(int i=100; i>5; i-=5) {
		System.out.println(i);
	}
	
	for(int i=100; i>9; i-=10) {
		System.out.println(i);
	}
	
	for(int i=95; i<4; i-=10) {
		System.out.println(i);
	}
	}
	}
	