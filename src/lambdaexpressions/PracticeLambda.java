package lambdaexpressions;

import java.util.ArrayList;
import java.util.List;

interface Test {
	//public void test();
	public void test(String name);
	//public void test(String name1,String name2);
	//public String test(String name1,String name2);
	//int add(int a,int b);
}

// Anonymous function example
public class PracticeLambda {

// Anonymous function example
//	public static void main(String[] args) {
//		Test t=new Test() {
//			public void test() {
//				System.out.println("This is from practice streams");
//			}
//		};
//		
//		t.test();
//	}

// Lambda with no Paramter
//		public static void main(String[] args) {
//			Test t = () -> {
//				System.out.println("This is no parameter lamba expression: "+name);
//			};
//			t.test();
//		}
	
// Lambda with Paramter
	public static void main(String[] args) {
		Test t = (x) -> {
			System.out.println("This is no parameter lamba expression: "+x);
		};
		t.test("abcd");
	}
	
	// Lambda with two Paramter and more than one line
//		public static void main(String[] args) {
//			Test t = (name1,name2) -> {
//				System.out.println("This is no parameter lamba expression: "+name1+" "+name2);
//			};
//			t.test("abcd","xyz");
//		}
		
		// Lambda with two int Paramter and  one line
//				public static void main(String[] args) {
//					Test t = (a,b) -> (a+b);
//					System.out.println(t.add(5,4));
//				}
	
	// Lambda with two Paramter and  one line
//	public static void main(String[] args) {
//		Test t = (name1,name2) -> (name1+" "+name2);
//		System.out.println(t.test("abcd","xyz"));
//	}
	
	//Java lambda expression example for each loop
//	public static void main(String[] args) {
//		List<String> list=new ArrayList<String>();
//		list.add("abcd");
//		list.add("xyz");
//		
//		list.forEach(n->System.out.println(n));
//		
//	}
	
	
}
