package p16;

public class Hong extends Person{
	
	public String name;
	public int age;
	public int height;
	public String email;
	
	public Hong(String name, int age, int height, String email) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.email = email;
	}
	public void eat() {
		System.out.println("밥먹기 싫다.");
	}
	
	public void eat(String spam) {
		System.out.println("스팸은 사랑이지~~");
	}

}
