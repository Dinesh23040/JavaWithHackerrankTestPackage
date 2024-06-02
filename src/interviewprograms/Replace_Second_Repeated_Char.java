package interviewprograms;

import java.util.Scanner;

public class Replace_Second_Repeated_Char {
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.print("Enter string value :");
		
		String str=s.nextLine();
		char[] ch=str.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='o') {
				count+=1;
			}
			if(count==2) {
				ch[i]='$';
				break;
			}
		}
		String result=new String(ch);
		System.out.println(result);
	}

}
