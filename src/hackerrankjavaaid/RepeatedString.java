package hackerrankjavaaid;

import java.util.Scanner;


// count number of a repeated in the given string
// git link : https://www.youtube.com/redirect?event=video_description&redir_token=QUFFLUhqbW1FVVYwUk91NmRXdlJxV1l2VW1KYVhLYUVmd3xBQ3Jtc0traDFBTzMtclNuX1FYaktfNUpXTmloUnF2aU5OclhhMk00Tk5EY2ZIV2RtaTNVcmdGVkJKUTVRdUQxRlJJcGVBeG5JaWJDR2ZWVVo4R0xTYXRHaDBrbnlYbEZKTk9UYklubWZEWWRmQnVDcEVmUkVDMA&q=https%3A%2F%2Fgithub.com%2FJava-aid%2FHackerrank-Solutions%2Fblob%2Fmaster%2FHackerRankDashboard%2FCoreCS%2FGeneralProgramming%2Fsrc%2Fmain%2Fjava%2Fcom%2Fjavaaid%2Fhackerrank%2Fsolutions%2Fgeneralprogramming%2Fbasicprogramming%2FRepeatedString.java&v=d5xLkTvJDWY
// link : https://www.youtube.com/watch?v=d5xLkTvJDWY&list=PLSIpQf0NbcCltzNFrOJkQ4J4AAjW3TSmA
/*
 *  ans= quotient x (freq of a in string) + (frequency of a in substring of length r)
 * 
 * 
 */

public class RepeatedString {
	
	static long repeatedString(String s, long n) {
		int strLength = s.length();
		long q = 0, r = 0;
		q = n / strLength;
		r = n % strLength;
		long partialStrLen = (r == 0) ? 0 : r;
		long aCount = q * getLetterCount(s, s.length()) + getLetterCount(s, partialStrLen);
		return aCount;
	}

	public static long getLetterCount(String s, long strLength) {
		long count = 0;
		for (int i = 0; i < strLength; i++) {
			if (s.charAt(i) == 'a')
				count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter string:");
//		String s=sc.next();
//		System.out.println("length of characters to repeat : ");
//		long n=sc.nextLong();
//		long aCount = repeatedString(s, n);
//		System.out.println(aCount);
//		sc.close();
		
		String s="testing";
		System.out.println(s.length());
		
	}

}
