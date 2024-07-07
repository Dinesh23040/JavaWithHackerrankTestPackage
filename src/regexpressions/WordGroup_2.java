package regexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordGroup_2 {
    public static void main(String[] args) {
        String text = "abc123 def456";
        
        // Using \\w+
        Pattern pattern1 = Pattern.compile("\\w+");
        Matcher matcher1 = pattern1.matcher(text);
        while (matcher1.find()) {
            System.out.println("Group (\\w+): " + matcher1.group());
        }
        
        // Using \\w)+
        Pattern pattern2 = Pattern.compile("(\\w)+");
        Matcher matcher2 = pattern2.matcher(text);
        while (matcher2.find()) {
            System.out.println("Group (\\w)+: " + matcher2.group());
        }
    }
}
