import java.util.Scanner;
import java.util.Vector;

public class ElementFrequencyCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a Vector to store elements
        Vector<Integer> vector = new Vector<>();
        

        // Input the size of the Vector
        System.out.print("Enter the size of the Vector: ");
        int size = scanner.nextInt();

        // Input the elements of the Vector
        System.out.println("Enter the elements of the Vector:");
        for (int i = 0; i < size; i++) {
            vector.add(scanner.nextInt());
        }

        // Input the element to find its frequency
        System.out.print("Enter the element to find its frequency: ");
        int elementToFind = scanner.nextInt();

        // Calculate and print the frequency of the element
        int frequency = findElementFrequency(vector, elementToFind);
        System.out.println("Frequency of " + elementToFind + " in the Vector: " + frequency);

        // Close the scanner to prevent resource leak
        scanner.close();
    }

    private static int findElementFrequency(Vector<Integer> vector, int element) {
        int frequency = 0;

        // Iterate through the Vector and count occurrences of the element
        for (int i = 0; i < vector.size(); i++) {
            if (vector.get(i) == element) {
                frequency++;
            }
        }

        return frequency;
    }
}
