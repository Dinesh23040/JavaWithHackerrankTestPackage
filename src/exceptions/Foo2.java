package exceptions;

public class Foo2 {

	public static void main(String[] args) {
		
		try {
			badMethod();
			System.out.println("A");
		}catch(Exception ex) {
			System.out.println("B");
		}
		finally {
			System.out.println("C");
		}
		System.out.println("D");
		
//		try {
//			return;
//		}
//		finally {
//			System.out.println("Finally");
//		}
	}
	
	public static void badMethod() {
		throw new RuntimeException();
	}
}
