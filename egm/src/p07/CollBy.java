package p07;

public class CollBy {
	
	void doFunc(int[]a, int[]b) {
		a = new int[4];
		a[0] = 3;
	}
	public static void main(String[] args) {
		int[] a = new int[1];
		int[] b = new int[2];
		
		CollBy cb = new CollBy();
		cb.doFunc(a,b);
		System.out.println(a[0]);
		System.out.println(a.length);
		
	}

}
