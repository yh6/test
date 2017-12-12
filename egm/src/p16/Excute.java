package p16;

public class Excute {
	
	public void printAction(Action act) {
		//eat호출시 누구누구가 먹습니다. 
		act.eat();
		//sleep 호출시 누구누구가 잡니다.
		act.sleep();
		//walk호출시 누구누구가 걷습니다. 
		act.walk();
	}
	public static void main(String[] args) {
		Hong hong = new Hong("Hong", 20, 173,"hong@gmail.com");
		Excute e = new Excute();
		
		//동물도 이름,나이,몸길이를 가지게 말들어 주시고 
		//Cat생성자 호출시 나이 몸길이를 저장하게 만들어주세요		
		e.printAction(hong);
	/*	System.out.println();	
		p.eat();
		p.sleep();
		p.walk();*/
		Action cat = new Cat("돌진",2,44);
		e.printAction(cat);
	}

}
