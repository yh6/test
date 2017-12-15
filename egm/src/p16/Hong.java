package p16;

public class Hong extends Person{
	
	/*public String name;
	public int age;
	public int height;
	public String email;*/ //이게 선언이 되어잇다면 밑에 super.로 호출해야함
	
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
