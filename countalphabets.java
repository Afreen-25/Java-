import java.util.Scanner;

public class countalphabets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the sentence
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Call the method to analyze the sentence
        analyzeSentence(sentence);

        // Close the scanner to prevent resource leak
        scanner.close();
    }

    private static void analyzeSentence(String sentence) {
        int alphabetCount = 0;
        int digitCount = 0;
        int specialSymbolCount = 0;
        int blankSpaceCount = 0;
        int wordCount = 0;
        int vowelCount = 0;
        int consonantCount = 0;

        // Convert the sentence to lowercase for easier vowel checking
        String lowercaseSentence = sentence.toLowerCase();
        

        // Analyze each character in the sentence
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            //for every character
            if (Character.isAlphabetic(ch)) {
                alphabetCount++;
                if (isVowel(lowercaseSentence.charAt(i))) {
                    vowelCount++; 
                } else {
                    consonantCount++;
                }
            } else if (Character.isDigit(ch)) { 
                digitCount++;
            } else if (Character.isWhitespace(ch)) {
                blankSpaceCount++;
            } else {
                specialSymbolCount++;
            }
        }  

        // Count the number of words
        String[] words = sentence.split("\\s+");
        wordCount = words.length;


        // Display the results
        System.out.println("Alphabets: " + alphabetCount);
        System.out.println("Digits: " + digitCount);
        System.out.println("Special Symbols: " + specialSymbolCount);
        System.out.println("Blank Spaces: " + blankSpaceCount);
        System.out.println("Words: " + wordCount);
        System.out.println("Vowels: " + vowelCount);
        System.out.println("Consonants: " + consonantCount);
    }

    private static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}

