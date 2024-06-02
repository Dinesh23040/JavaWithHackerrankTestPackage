package stringpractice;
public class ReverseWordsPreservingSpaces {
	
    public static void main(String[] args) {
        String inputString = "My       name     is  Dinesh";
        String result = reverseWordsPreservingSpaces(inputString);
        System.out.println("Original String: " + inputString);
        System.out.println("String with reversed words (preserving spaces): " + result);
    }

    private static String reverseWordsPreservingSpaces(String input) {
        String[] words = input.split("\\s+");
        int wordIndex = words.length - 1;

        StringBuilder reversedString = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            if (Character.isWhitespace(input.charAt(i))) {
                reversedString.append(input.charAt(i));
            } else {
                int wordStart = i;
                while (i < input.length() && !Character.isWhitespace(input.charAt(i))) {
                    i++;
                }
                int wordEnd = i;

                // Reverse the word and append to the result
                reversedString.append(reverseWord(input.substring(wordStart, wordEnd)));
                i--; // Move the index back to the last character of the word
            }
        }

        return reversedString.toString();
    }

    private static String reverseWord(String word) {
        StringBuilder reversedWord = new StringBuilder(word);
        return reversedWord.reverse().toString();
    }
}
