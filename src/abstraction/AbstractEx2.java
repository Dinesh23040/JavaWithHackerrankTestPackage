package abstraction;

// since java 9, interface allows private and private static methods 
// link : https://www.tutorialspoint.com/java/java_private_interface_methods.htm#:~:text=Private%20and%20static%20private%20interface,kept%20in%20the%20interface%20only.
//
interface AA {
	
	static void interface_static_method() {
		System.out.println("this is static method");
	}
	
	default void default_overrideEx() {
		System.out.println("override ex from abstract class A");
	}
	
	// since java 9
	private void pri_method() {
		System.out.println("private method from AA interface");
	}
	
	// since java 9
	private static void pri_method_static() {
		System.out.println("private method from BB interface");
	}
		
}

interface BB {
	
	static void interface_static_method() {
		System.out.println("this is static method");
	}
	
	default void default_overrideEx() {
		System.out.println("override ex from abstract class B");
	}
	
	// since java 9
	private void pri_method() {
		System.out.println("private method from BB interface");
	}
	
	// since java 9
	private static void pri_method_static() {
		System.out.println("private method from BB interface");
	}
}

public class AbstractEx2 implements AA, BB{
	
	public static void main(String[] args) {
		
		AA a=new AbstractEx2();
		a.default_overrideEx();
		
		AA.interface_static_method();
		
	}

	@Override
	public void default_overrideEx() {
		// TODO Auto-generated method stub
		BB.super.default_overrideEx();
	}

}
