package p16;

public class Person implements Action{
	
	public String name;
	public int age;
	public int height;
	public String email;
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", height=" + height + ", email=" + email + "]";
	}
	@Override
	public void eat() {
		System.out.println("eat()호출!!");
		// TODO Auto-generated method stub
		
	}
	@Override
	public void sleep() {
		System.out.println("sleep()호출!!");
		// TODO Auto-generated method stub
		
	}
	@Override
	public void walk() {
		System.out.println("walk()호출!!");
		// TODO Auto-generated method stub	
	}
}
