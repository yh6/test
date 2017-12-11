package p15;
	
	import java.util.ArrayList;

	public class Excute {
		
		public static void main(String[] agrs) {
			Controller c = new Controller();
			ArrayList<User> userList = e.get("List",null);
			for(int i=1; i<=5; i++) {
				User user = new User("이름" + i, i,i);
				c.get("add",user);
			}

			User user = new User("모모",20,2);
			e.get("update",user);
			for(User u : userList) {
				System.out.println(u);
			}
			e.get("add",user);
			System.out.println("추가결과 :" );
			for(User u : userList) {
				System.out.println(u);
			}
			
			}
	}
}