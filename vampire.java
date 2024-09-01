import java.util.Scanner;

public class vampire {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a 4-digit number
        System.out.print("Enter a 4-digit number: ");
        int number = scanner.nextInt();

        // Check if the number is a 4-digit number
        if (number >= 1000 && number <= 9999) {
            // Convert the number to an array of digits
            int[] digits = new int[4];
            for (int i = 3; i >= 0; i--) {
                digits[i] = number % 10;
                number /= 10;
            }

            // Generate all possible 2-digit combinations and check for vampire number
            boolean isVampire = checkForVampire(digits);
            
            // Display the result
            if (isVampire) {
                System.out.println("The entered number is a Vampire Number!");
            } else {
                System.out.println("The entered number is NOT a Vampire Number.");
            }
        } else {
            System.out.println("Please enter a valid 4-digit number.");
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }

    // Method to check for Vampire Number
    private static boolean checkForVampire(int[] digits) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i != j) {
                    int fangs1 = digits[i] * 10 + digits[j];
                    int fangs2 = 0;

                    for (int k = 0; k < 4; k++) {
                        if (k != i && k != j) {
                            fangs2 = fangs2 * 10 + digits[k];
                        }
                    }

                    if (fangs1 * fangs2 == digitsToNumber(digits)) {
                        System.out.println(digitsToNumber(digits) + " = " + fangs1 + " * " + fangs2);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    // Method to convert an array of digits to a number
    private static int digitsToNumber(int[] digits) {
        int number = 0;
        for (int i = 0; i < 4; i++) {
            number = number * 10 + digits[i];
        }
        return number;
    }
}
