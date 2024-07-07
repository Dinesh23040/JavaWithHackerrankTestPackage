package interviewprograms;

import java.util.Scanner;

// input : "abc      def        xyz"

public class CountSpaceBetweenWords {
	
	static String input=null;
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user to input the string
        System.out.println("Enter a sentence:");
        input = scanner.nextLine();
        
        // Define the three words
        String[] words = input.split("\\s+");
        
//        input.indexOf(words[1], 0, input.length());
//        
//        System.out.println("length : "+input.indexOf(words[1], 0, input.length()));
        
        // Check if there are three words
        if (words.length < 3) {
            System.out.println("Input should contain at least three words separated by spaces.");
            scanner.close();
            return;
        }
        
        // Count the spaces between the first two words
        int spaceCount1 = countSpacesBetweenWords(words[0], words[1]);
        System.out.println("Number of spaces between '" + words[0] + "' and '" + words[1] + "': " + spaceCount1);
        
        // Count the spaces between the second two words
        int spaceCount2 = countSpacesBetweenWords(words[1], words[2]);
        System.out.println("Number of spaces between '" + words[1] + "' and '" + words[2] + "': " + spaceCount2);
        
        scanner.close();
    }
    
 // Function to count spaces between two words
    public static int countSpacesBetweenWords(String firstWord, String secondWord) {
        // Find the index of the first word
        int firstIndex = firstWord.length();
        
        // Find the index of the second word
        int secondIndex = secondWord.length();
        
        // Determine the substring between the two words
        String substring = input.substring(secondIndex);
        
        
        
        // Count the spaces in the substring
        int spaceCount = 0;
        for (int i = 0; i < substring.length(); i++) {
            if (substring.charAt(i) == ' ') {
                spaceCount++;
            }
        }
        
        return spaceCount;
    }
}
