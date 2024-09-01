import java.util.Scanner;

public class SumExceptIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the length of the array
        System.out.print("Enter the length of the array (N): ");
        int N = scanner.nextInt();

        int[] arr = new int[N];

        // Input the array elements
        System.out.print("Enter the array elements: ");
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        int[] result = calculateSumExceptIndex(arr);

        // Display the result
        System.out.print("Output: ");
        for (int i = 0; i < N; i++) {
            System.out.print(result[i] + " ");
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }

    private static int[] calculateSumExceptIndex(int[] arr) {
        int N = arr.length;
        int[] result = new int[N];

        for (int i = 0; i < N; i++) {
            int sum = 0;
            for (int j = 0; j < N; j++) {
                if (i != j) {
                    sum += arr[j];
                } 
            }
            result[i] = sum;
        }

        return result;
    }
}
