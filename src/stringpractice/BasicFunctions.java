package stringpractice;

import java.util.*;
import java.util.stream.Collectors;
/*import java.io.*;*/

// ==, equals(), compareTo(), equalsIgnoreCase() and compare()
//Link : https://www.geeksforgeeks.org/java-equals-compareto-equalsignorecase-and-compare/ 

class Practice
{
	void ex1()
	{
		char[] ch= {'j','a','v','a'};
		
		System.out.println("Character Array :"+Arrays.toString(ch)); 
				// output : Character Array :[j, a, v, a]	, each value will be converted to String	
		String s=new String(ch);
		
		System.out.println("String  :"+s);	
		System.out.println("String length : "+s.length());
	}	
	
	void stringSplit() {
		String s="boo:a:";//"boo:and:foo ";
		//s.split(":");
		//s.split("o",-3);
		
		
		String[] sA=s.split(":",-7);
		
		System.out.println("Array Length : "+sA.length);
		
		for(String sAA:sA) {
			System.out.println("for each for split :"+sAA);
		}
		
		for(String sp:s.split("o",-1)) {
			System.out.println("Strings after split :"+sp);
		}
	}
	
	void stringJoin() {
		String s1="Dinesh";
		String s2="Kumar";
						
		List<String> l=new ArrayList<String>();
		l.add("a");
		l.add("b");
		l.add("c");
		
		String joinmsg=String.join("-", l);		
		
		System.out.println("String after joining: "+joinmsg);
	}
	
	void stringJoiner() {
		StringJoiner sj=new StringJoiner(",");
		sj.add("abc");
		sj.add("def");
		System.out.println("After string joiner : "+sj.toString());
	}
	
	void stringFormat() {
		
		String formatmsg=String.format("%s=%d","joe",35);
		System.out.println("String after joining: "+formatmsg);
		System.out.printf("My name is : %s   after line separator","joe");
	}
	
	void collectorsJoining() {
		List<String> ls=Arrays.asList("xyz","abc");
		String scj=ls.stream().collect(Collectors.joining("-"));
		System.out.println("collectos joining : "+scj);
	}
	void stringBuilderFormat() {
		
		
	}
	
	void reverseStringUsingStringBuilder() {
		
		StringBuilder sb=new StringBuilder("Dinesh");
		String a=sb.reverse().toString();
		System.out.println(a);
		
		//System.out.println(new String(Arrays.reverse("Dinesh".toCharArray())));
	}
	
	void reverseStringWithoutUsingExtraVariable_1() {
		
		String s="reverses me!";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			s+=s.charAt(i);
		}
				
		s=s.substring(s.length()/2, s.length());		
		System.out.println("reversed string :"+s);
	}
	
	void reverseStringWithoutUsingExtraVariable_2() {
		
		String reverseMe = "reverse me!";
		for (int i = 0; i < reverseMe.length(); i++) {
		    reverseMe = reverseMe.substring(1, reverseMe.length() - i)
		        + reverseMe.substring(0, 1)
		        + reverseMe.substring(reverseMe.length() - i, reverseMe.length());
		    
		    System.out.println(reverseMe);
		 }
		 System.out.println("The End: "+reverseMe);
		
	}

	void immutableString_ex() {
		
		// link for proper explanation : https://www.geeksforgeeks.org/java-string-is-immutable-what-exactly-is-the-meaning/
		/*
		 * An important point to note here is that, while the String object is immutable, its reference variable is not. 
		 * So that’s why, in the above example, the reference was made to refer to a newly formed String object.
		 */
		
		String s="Sachin";  
		s.concat(" Tendulkar");//concat() method appends the string at the end  
		System.out.println(s);//will print Sachin because strings are immutable objects
	
		String s2="Sachin";  
		s2=s2.concat(" Tendulkar");  
		System.out.println(s2);  
		
	}
	
}

public class BasicFunctions {
	
	public static void main(String[] args)
	{
		Practice p=new Practice();
		
		//p.ex1();
		//p.stringFormat();		
		//p.reverseStringUsingStringBuilder();
		//p.reverseStringWithoutUsingExtraVariable_1();
		//p.stringFormat();
		//p.stringSplit();
		//p.stringJoin();
		//p.stringJoiner();
		//p.immutableString_ex();
		p.collectorsJoining();
	}

}
