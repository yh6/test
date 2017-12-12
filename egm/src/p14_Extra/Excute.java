package p14_Extra;

public class Excute {
	
	public static void main(String[] args) {
		MapExam<String, String> me = new MapExam<String, String>();
		
		me.put("f", "60");
		me.put("e", "50");
		me.put("e", "중ㅋ벅ㅋ");
		
		me.put("d", "ㄲㄲㄲ");
		me.put("c", "ㄲㄲㄲㄲㄲ");
		me.put("b", "ㄲㄲㄲ");
		me.put("a", "ㄲㄲ");
		
		System.out.println(me);
				
		
		
	}

}
