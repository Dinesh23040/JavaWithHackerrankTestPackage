package stringpractice_two;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Count_Spaces {
	
	String reverse;
	
	void reverse(String s) {
		
	}

	public static void main(String[] args) {

		String s1 = "this  test1  test2";
		
		
	//	int i=s1.replaceAll(" ","").length();
	//	System.out.println("Number of spaces :"+i);
		HashMap<Integer,Integer> hm=new HashMap<>();
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		String rev="";
		for (char c : s1.toCharArray()) {
			
			if (c == ' ') {		
				
			}else
			{
				rev+=Character.toString(c);
			}
		}
	}
}
