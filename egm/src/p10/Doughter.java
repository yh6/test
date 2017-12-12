package p10;

public class Doughter extends Father {
	
	int minNum;
	
	
	
	

	public Doughter(){		
		super(6, 3);
	}
	
	void print() {
		for(int i=1; i<30; i++) {
			
			System.out.print(i + ",");
			if(i%10==0) {
				System.out.println();				
			}
		}		
	}
	
	
	public static void main(String[] args) {
		Father f = new Father(1,2);
		Father f1 = new Doughter();
		Doughter f3 = new Doughter();
		
		
		
			
	
		Father f2 = new Excute(1, 2);
//		Doughter f1 = new Doughter();
		System.out.println(f2 instanceof Excute);
		System.out.println(f2 instanceof Father);
		System.out.println(f instanceof Excute);
		Father[] fs = new Father[3];
		
		f1.print();
		
		
		fs[0] = new Father(1,2);
		fs[1] = new Doughter();
		fs[2] = new Excute(1,2);
		
		
		
		
		
	}
	
	

}
