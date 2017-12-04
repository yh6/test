package p08;

public class ExecLotto {
	
	public static void main(String[] args) {
		Lotto lt = new Lotto(3,10); //private-여기서만 수정이 가능
		lt.makeLottoNums();
		lt.printLottoNums();
		
	}

}
