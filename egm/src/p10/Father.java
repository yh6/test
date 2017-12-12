package p10;

public class Father {
	
	public int minNum;
	public int maxNum;
	
//	public Father() {		
//	}
//	
//	
//	
//	Father(int a) {		
//	}
//	
	
	
	public Father(int minNum, int maxNum) {
		
		this.minNum = minNum;
		this.maxNum = maxNum;		
		
	}
	
	void print() {
		for(int i=1; i<100; i++) {
			
			System.out.print(i + ",");
			if(i%10==0) {
				System.out.println();				
			}
		}		
	}
	
	public String toString() {		
		
		return "너냐 날 부른게 ?";
		
	}
	
	
	
	
	
		
//	public void print() {
//		for(int i=minNum; i<maxNum; i++) {
//			
//			System.out.print(i + ",");
//			if(i%10==0) {
//				System.out.println();				
//			}
//		}		
//	}

}
