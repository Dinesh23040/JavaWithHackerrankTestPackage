package java9features;

interface Sayable {

	default void say() {
		System.out.println("This is say method");
	}

	
	 static void say2() { System.out.println("This is say2 method"); }
	 
}

public class InterfacePrivateMethods implements Sayable {

	public static void main(String[] args) {
		Sayable s = new InterfacePrivateMethods();
		s.say();
		Sayable.say2();
	}
}
