package hackerrankdinesh;

public class DuplicateWords_2 {
	
	void method1() {
		String inputStr = "aaabbbcccddefffaa";

		String outputStr = "";
		char prevChar = 0;
		int charCount = 0;

		for (char c : inputStr.toCharArray()) {
		    if (c == prevChar) {
		    	charCount++;		        
		    } else {
		        if (prevChar != 0) {
		            outputStr += prevChar;
		            outputStr += charCount;
		        }
		        prevChar = c;
		        charCount = 1;
		    }
		}

		outputStr += prevChar; 
		outputStr += charCount;

		System.out.println(outputStr);
	}

	public static void main(String[] args) {
		DuplicateWords_2 obj1=new DuplicateWords_2();
		obj1.method1();
	}
}
