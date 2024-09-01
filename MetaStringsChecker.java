import java.util.Scanner;

public class MetaStringsChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two strings
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        // Check if the strings are Meta strings or not
        if (areMetaStrings(str1, str2)) {
            System.out.println("The given strings are Meta strings.");
        } else {
            System.out.println("The given strings are NOT Meta strings.");
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }

    private static boolean areMetaStrings(String str1, String str2) {
        // Check if both strings are of equal length
        if (str1.length() != str2.length()) {
            return false;
        }

        int n = str1.length();
        int count = 0;
        int firstIndex = -1, secondIndex = -1;

        // Count the number of unmatched characters and store their indices
        for (int i = 0; i < n; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                count++;

                if (count == 1) {
                    firstIndex = i;
                } else if (count == 2) {
                    secondIndex = i;
                } else {
                    return false; // More than 2 unmatched characters
                }
            }
        }

        // If only 2 unmatched characters, check if swapping makes the strings equal
        return (count == 2 && str1.charAt(firstIndex) == str2.charAt(secondIndex) &&
                str1.charAt(secondIndex) == str2.charAt(firstIndex));
    }
}
