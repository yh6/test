package p16;

public class Animal implements Action{
	public String name;
	public int age;
	public int height;
	@Override
	public void eat() {
		System.out.println(this.name + "사료를 먹는다");
		// TODO Auto-generated method stub
		
	}
	@Override
	public void sleep() {
		System.out.println(this.name +"잠을 잔다");
		// TODO Auto-generated method stub
		
	}
	@Override
	public void walk() {
		System.out.println(this.name +"걷는다");
		// TODO Auto-generated method stub
		
	}

}
