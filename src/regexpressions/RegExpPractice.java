package regexpressions;

import java.util.regex.*;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

class RegExamples{

	void match() {
		System.out.println("abc with word : "+Pattern.matches("[abc]?","a"));
		
		Pattern p=Pattern.compile("[^abc]*");
		
		Matcher m=p.matcher("dinesh");
		System.out.println("Is patter matches: "+m.matches());
		System.out.println("Find Pattern :"+m.find());
		System.out.println("Start Matched subsequence index : "+m.start());
		System.out.println("End Matched subsequence index : "+m.end());		
	}
	
	void findEx() {
		
		Pattern p = Pattern.compile("(ab)+");
		Matcher m = p.matcher("abaaaba");
		System.out.println("Group Count : "+ m.groupCount());
		
		while(m.find()) {
			
			System.out.print("Start Position : "+m.start() + "  \n");
			System.out.println("End Position : "+m.end());
			System.out.println("Group :"+m.group());		
			}
		
		}
	
	void reg_from_python() {	
				
		try {
			String path=System.getProperty("user.dir");
			path=path+"\\src\\regexpressions\\text_to_search.txt";
			System.out.println(path);
			
			
			BufferedReader br=null;
			FileReader fr=new FileReader(path);
			br=new BufferedReader(fr);

			StringBuilder sb=new StringBuilder();
			String line=br.readLine();
			
			
			while(line!=null) {
				//System.out.println("Line read from file : "+line);
				sb.append(line+"\n");				
				line=br.readLine();				
			}
		
			String text_to_search=sb.toString();			
//			System.out.print(text_to_search);
			
			//Pattern p=Pattern.compile(".b");
			//Matcher m=p.matcher(text_to_search);
			
			
			//Pattern p=Pattern.compile("\\d\\d\\d.\\d\\d\\d.\\d\\d\\d");
			//Pattern p=Pattern.compile("\\d\\d\\d[.-]\\d\\d\\d[.-]\\d\\d\\d");
			
			//Reading Mobile Numbers
			//Pattern p=Pattern.compile("[89]00[.-]\\d\\d\\d[.-]\\d\\d\\d");
			//Pattern p=Pattern.compile("\\d{3}.\\d{3}.\\d{3}");
			
			//Reading Names 
			//Pattern p=Pattern.compile("Mr\\.?\\s[A-Z]\\w*");			
			//Pattern p=Pattern.compile("M(r|s|rs)\\.?\\s[A-Z]\\w*"); // grouping at Mr,Ms,Mrs
			
			//Reading emails
			//Pattern p=Pattern.compile("[A-Za-z]+@[A-Za-z]+.com");
			//Pattern p=Pattern.compile("[A-Za-z]+@[A-Za-z-]+.(com|edu|net)");
			
			//Reading urls
			Pattern p=Pattern.compile("https?://(www.)?(\\w+).(\\w+)");
			
			Matcher m=p.matcher(text_to_search);
			
			//System.out.println(Pattern.matches("https?://(www.)?(\\w+).(\\w+)", text_to_search));
			
			while(m.find()) {
				System.out.println(m.group());
			}
//			
//			System.out.println(Pattern.matches("https?://(www.)?(\\w+).(\\w+)", text_to_search));
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	void quantifiersEx() {
		
	}
	
	void findIntegers() {
		
	}
	
	void findCharactersOnly() {
		
	}
}

public class RegExpPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RegExamples re=new RegExamples();
		//re.match();
		//re.findEx();
		re.reg_from_python();	
		
	}

}
