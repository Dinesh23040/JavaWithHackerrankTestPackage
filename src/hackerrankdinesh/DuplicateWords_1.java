package hackerrankdinesh;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Sample Input : 
 * 
 * 5
 * Goodbye bye bye world world world
 * Sam went went to to to his business
 * Reya is is the the best player in eye eye game
 * in inthe
 * Hello hello Ab aB
 * 
 */

/*
 * explain this regular expression used in java
 *    \\b(\\w+)(\\s+\\1\\b)
 * 
 * 
 * This regular expression in Java is used to match repeated words in a text. Let's break it down:

- `\\b`: This matches a word boundary, ensuring that the word being matched is a whole word and not part of a larger word.

- `(\\w+)`: This is a capturing group that matches one or more word characters (letters, digits, or underscores). The `+` quantifier means it must match at least one character.

- `(\\s+\\1\\b)+`: This part matches one or more occurrences of a whitespace character followed by the same word as captured in the first group (`\\1` refers to the first capturing group), followed by a word boundary. Here's what each part does:
  - `\\s+`: Matches one or more whitespace characters (spaces, tabs, etc.).
  - `\\1`: Refers back to the first capturing group, which is the word captured by `(\\w+)`.
  - `\\b`: Matches a word boundary, ensuring that the repeated word is a whole word.

Putting it all together, this regular expression matches patterns like "word word", "hello hello", "123 123", etc., where the same word is repeated consecutively with whitespace in between.
 * 
 */
public class DuplicateWords_1 {

    public static void main(String[] args) {

        String regex = "\\b(\\w+)(\\s+\\1\\b)+";
        //String regex = "\\b(\\w+\\s)(\\1)*\\b"; // this is just to try something new
        Pattern p = Pattern.compile(regex,  2);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());
        
        while (numSentences-- > 0) {
            String input = in.nextLine();
            
            Matcher m = p.matcher(input);
            
            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
            	System.out.println("m.group(): "+m.group());
            	System.out.println("m.group(1): "+m.group(1));
                input = input.replaceAll(m.group(), m.group(1));
            }
            
            // Prints the modified sentence.
            System.out.println("input : "+input);
        }
        
        in.close();
    }
}
