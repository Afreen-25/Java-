import java.util.Scanner;

public class validnos {
    public static void main(String[] args) {
        int totalValidIntegers = 0;
        int totalInvalidIntegers = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter integers (enter 'exit' to stop):");

        while (true) {
            String input = scanner.next();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            try {
                int number = Integer.parseInt(input);
                System.out.println("Valid Integer: " + number);
                totalValidIntegers++;
            } catch (NumberFormatException e) {
                System.out.println("Invalid Input: " + input);
                totalInvalidIntegers++;
            }
        }

        scanner.close();

        System.out.println("\nTotal Valid Integers: " + totalValidIntegers);
        System.out.println("Total Invalid Integers: " + totalInvalidIntegers);
    }
}
