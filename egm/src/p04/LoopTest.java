package p04;

public class LoopTest {

	void func1(int num1, int num2) {
		int sum = 0;
		for (int i = num1; i <= num2; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

	void func2() {
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 1) {
				System.out.print(i + ",");
			}
			if (i % 10 == 1) {
				System.out.println();
			}
		}
	}

	void func3(int num1, int num2, int num3) {
		for (int i = num1; i <= num2; i++) {
			if (i % num3 == 0) {
				System.out.print(i + ",");
			}
			if (i % 10 == 0) {
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		LoopTest lt = new LoopTest();
		lt.func1(1, 50);
		lt.func2();
		System.out.println();
		lt.func3(5,4,6);
	}
}
