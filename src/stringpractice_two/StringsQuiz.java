package stringpractice_two;

public class StringsQuiz {
	
	public static void main(String[] args) {
		
		//Question - 1 :
		//---------------
		String[] arr= {"meow","bray"};
		String a1="meow";
		String a2=new String("meow");
		System.out.println(arr[0]==a2);
		
//		String s=""; // holds an empty reference
//		System.out.println(s);
		
		String A="Wild";
		String B=" Irish";
		String C=" Rose";
		String result;
		//System.out.println(result+A+B+C); // result gives error as it is not initialized
		result = A.concat(B.concat(C));
		System.out.println(result);
	}
}
