package java8newfeatures;

interface Sayable2{
	void say();
}

public class InstanceMethodReference {
	
	void testInstance() {
		System.out.println("It is test instance method");
	}
	
	public static void main(String[] args) {
		InstanceMethodReference imr=new InstanceMethodReference();
		Sayable2 s=imr::testInstance;
		s.say();
	}

}
