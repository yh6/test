package p15;

import java.util.ArrayList;

public class Controller {

	private Service server;

	public Controller() {
		server = new Service();
	}

	public ArrayList<User> get(String command, User user) {
		if (command.equals("List")) {
			return getUserList(null);
		} else if (command.equals("add")) {
			boolean isOk = insertUser(user);
			if (isOk) {
				System.out.println(user.getName() + "생성완료!");
			} else {
				System.out.println("생성 중 알수 없는 에러가 발생햇습니다.");
			}
		} else if (command.equals("remove")) {
			boolean isOk = removeUser(user);
			if (isOk) {
				System.out.println(user.getName() + "삭제완료!");
			} else {
				System.out.println("삭제 중 알수 없는 에러가 발생햇습니다.");
			}
		}else if(command.equals("search")) {
			return getUserList(user.getName());
		}
		return null;
	}

	public boolean insertUser(User user) {
		return server.insertUser(user);
	}

	public boolean removeUser(User user) {
		return server.removeUser(user);
	}

	public ArrayList<User> getUserList(String str) {
		return server.getUserList(str);
	}
}
