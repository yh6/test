package p10;

public class Excute extends Father{
	
	
	
//	Excute(){
//		a= 4;
//		System.out.println("아들 생성자 호출");
//		
//	}
//	int a = 4;
	Excute(int num1, int num2){		
		super(num1, num2);
		
		
	}
	
//	public void print() {
//		
//		System.out.println("아들 프린트");//		
//	}
	
//	public void print() {
		
		
//		for(int i=num1; i<=num2; i++) {
//			if(i%10 == 0) {				
//				if(i/10 == (i%10)) {
//					System.out.print("짝" + ",");
//					System.out.println("");
//				}else {
//					System.out.print(i + ",");
//					System.out.println("");
//				}							
//			}else {
//				if(i%10==3 || i%10==6 || i%10==9 || i/10 ==3 || i/10 ==6 || i/10 ==9) {
//					System.out.print("짝" + ",");					
//				}else {
//					System.out.print(i + ",");					
//				}				
//			}				
//		}
		
//		for(int i=num1; i<=num2; i++) {
//			if((i%10 == 0) && (i/10 ==3 || i/10 ==6 || i/10 ==9)) {					
//				System.out.print("짝" + ",");
//				System.out.println("");				
//			}
//			else if(i%10 == 0) {
//				System.out.print(i + ",");
//				System.out.println("");					
//			}
//			else if( (i/10 ==3 || i/10 ==6 || i/10 ==9) && (i%10==3 || i%10==6 || i%10==9) ) {
//				System.out.print("짝짝" + ",");				
//			}
//			else if(i/10 ==3 || i/10 ==6 || i/10 ==9 || i%10==3 || i%10==6 || i%10==9) {
//				System.out.print("짝" + ",");				
//			}				
//			else {
//				System.out.print(i + ",");
//			}				
//		}
		
//		String print = "";
//		for(int i=minNum; i<maxNum; i++) {
//			String str = i + "";
//			if(str.indexOf("3")>-1 ||str.indexOf("6")>-1 || str.indexOf("9")>-1) {
//				str = "짝";		
//				print += str;				
//			}else {
//				print += str;
//			}
//			print += ",";
//			
//			if(i%10==0) {
//				print += "\n";
//			}			
//			
//		}System.out.println(print.substring(0, print.length()-1));	
//		
//		
//	}
		
	public void print(Father f) {
		System.out.println(f.toString());
		
	}
	
		
	
	
	
	public static void main(String[] args) {
//		FaFa f = new FaFa();
//		f.print();
//		Excute e = new Excute(1, 100);
//		e.print();
//		System.out.println(e.a);
		
		Father f = new Father(1,2);
		Excute e = new Excute(1,2);
		e.print(f);
		
		
		
	}

}
