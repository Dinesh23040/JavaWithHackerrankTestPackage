package lambdaexpressions;

interface Sayable2{
	public String say(String name);
}

public class LambdaExpression_Ex4_Single_Param {

	public static void main(String args[]) {
		
		
		Sayable2 s1=(name)->("Test "+name);
//		Sayable2 s1=(name)->{
//			return "Test"+name;
//		};
		
		System.out.println(s1.say("lambda"));
	}
}
