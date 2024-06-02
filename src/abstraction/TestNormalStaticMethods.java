package abstraction;

public class TestNormalStaticMethods {
	
	void test1() {
		System.out.println("test1 method");
		test2();
		test3();
	}
	
	void test2() {
		System.out.println("test2 method");
	}
	
	static void test3() {		
		System.out.println("test3 method");
	}

	public static void main(String[] args) {
		TestNormalStaticMethods t=new TestNormalStaticMethods();
		t.test1();
	}
	
}
