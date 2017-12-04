package p04;

import p03.GuGudan;
import p03.ObjectExam;

public class Excute {

	public static void main(String[] args) {
		ObjectExam oe = new ObjectExam();
		oe.inputNums();
		GuGudan ggd = new GuGudan();
		ggd.prinLoop(oe);
	}
}
