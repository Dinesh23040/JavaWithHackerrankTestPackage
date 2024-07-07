package interviewprograms;

public class NumberToWords {
   // private static final
	static String[] digitWords = {
        "zero", "one", "two", "three", "four",
        "five", "six", "seven", "eight", "nine"
    };

    public static void main(String[] args) {
        int number = 919; // Example number
        String words = convertNumberToWords(number);
        System.out.println(words);
    }

    public static String convertNumberToWords(int number) {
        String numberStr = String.valueOf(number);
        StringBuilder words = new StringBuilder();

        for (int i = 0; i < numberStr.length(); i++) {
            char digit = numberStr.charAt(i);
            int digitValue = Character.getNumericValue(digit);
            String word = digitWords[digitValue];
            words.append(word);
        }

        return words.toString();
    }
}

