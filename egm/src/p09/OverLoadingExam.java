package p09;

public class OverLoadingExam {
	
	public int getInt(String s, int a) {
		return 1;
	}
	public void getInt(int a, String s) {
		
	}
	public static void main(String[] args) {
		OverLoadingExam ole = new OverLoadingExam();
		ole = new OverLoadingExam();
	}

}
