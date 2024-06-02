package exceptions;

public class Quizpgm {
	
	public static void main(String[] args) {
		int i=0;
		/*
		 * try {
		 * 
		 * //JVM control goes to finally block and then comes back to try block return;
		 * 
		 * 
		 * } finally {
		 * 
		 * System.out.println("Finally "+ i);
		 * 
		 * }
		 */
		
		try {
			String s=null;
			s.length();
			System.out.println("try");
		}catch(Exception e) {
			System.out.println("catch");
			return;
			
			//e.getMessage();
		}
		finally {
			System.out.println("finally");
		}
	}
}