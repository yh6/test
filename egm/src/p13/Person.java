package p13;

public class Person{
	
	private String name;
	private int age;
	private int lotto;
	
	public int getLotto() {
		return lotto;
	}
	public void setLotto(int lotto) {
		this.lotto = lotto;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
		
//	public String toString() {
//		return "이름은 : " + name + ", " + "나이는 : " + age + "살";
//	}	
	
	public String toString() {
		return "이름은 : " + name + ", " + "번호는 : " + lotto  ;
	}	
	
	
	
	
	

}
