package abstraction;

interface util {
	public default int operate(int a, int b) {
		//return sum(a, b);
		return sum2(a, b);
	}

	private int sum(int a, int b) {
		return a + b;
	}

	private static int sum2(int a, int b) {
		return a + b;
	}
}

public class interace_java_9 implements util {
	public static void main(String[] args) {
		interace_java_9 tester = new interace_java_9();
		System.out.println(tester.operate(2, 3));
	}
}