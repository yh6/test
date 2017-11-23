package p03;

public class Test {
	
	void print(String str) {
		System.out.println(str);
	}
	
	static void priantInt(int a) {
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		Test t = new Test();
		String str = "나 여깄어요~~나";
		t.print(str);
		str = str.replace("나", "김연희");
		t.print(str);
		
		System.out.println(str.indexOf("여"));
	}
	


}
