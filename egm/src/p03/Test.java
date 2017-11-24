package p03;

public class Test {
	String str;
	
	Test(String str) {
		this.str =str;
	}
	void print() {
		System.out.println(str);
	}
		
	public static void main(String[] args) {
		ObjectExam oe = new ObjectExam();
		oe.inputNums();
		
		GuGudan ggd = new GuGudan();
		ggd.printLoop(oe);
		
	}
}
