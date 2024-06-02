package hackerrankdinesh;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCompressor {

    public static String compressString(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        StringBuilder compressed = new StringBuilder();
        int count = 1;
        char prevChar = input.charAt(0);

        for (int i = 1; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (currentChar == prevChar) {
                count++;
            } else {
                compressed.append(prevChar);
                compressed.append(count);
                count = 1;
                prevChar = currentChar;
            }
        }

        compressed.append(prevChar);
        compressed.append(count);

        return compressed.length() < input.length() ? compressed.toString() : input;
    }
    
    public static String compressString_regex(String input) {
    	
    	StringBuilder compressed = new StringBuilder();
    	//Pattern p=Pattern.compile("(.)\\1+");
    	Pattern p=Pattern.compile("([a-z])\\1+");
    	Matcher m=p.matcher(input);
    	
    	while(m.find()) {
    		String group=m.group();
    		compressed.append(group.charAt(0));
            compressed.append(group.length());
    	}
    	 return compressed.toString();
    }
    
    public static void main(String[] args) {
        String input = "abaaabbccccddddeeee";
//        String compressed = compressString(input);
//        System.out.println("Original string: " + input);
//        System.out.println("Compressed string: " + compressed);
        String compressed = compressString_regex(input);
        System.out.println("Original string: " + input);
        System.out.println("Compressed string: " + compressed);
    }
}
