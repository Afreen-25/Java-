import java.util.ArrayList;
import java.util.Scanner;

public class shopping{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an ArrayList to store the shopping list
        
        ArrayList<String> shoppingList = new ArrayList<>();
        

        // Menu for operations
        while (true) {
            System.out.println("\nShopping List Operations:");
            System.out.println("1. Add item");
            System.out.println("2. Add item at a specified location");
            System.out.println("3. Delete item");
            System.out.println("4. Print shopping list");
            System.out.println("5. Exit");

            System.out.print("Enter your choice (1-5): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    // Add item
                    System.out.print("Enter the item to add: ");
                    String newItem = scanner.nextLine();
                    shoppingList.add(newItem);
                    System.out.println("'" + newItem + "' added to the shopping list.");
                    break;

                case 2:
                    // Add item at a specified location
                    System.out.print("Enter the item to add: ");
                    String itemToAdd = scanner.nextLine();

                    System.out.print("Enter the index to add the item at: ");
                    int indexToAdd = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character

                    if (indexToAdd >= 0 && indexToAdd <= shoppingList.size()) {
                        shoppingList.add(indexToAdd, itemToAdd);
                        System.out.println("'" + itemToAdd + "' added to the shopping list at index " + indexToAdd + ".");
                    } else {
                        System.out.println("Invalid index. Item not added.");
                    }
                    break;

                case 3:
                    // Delete item
                    System.out.print("Enter the item to delete: ");
                    String itemToDelete = scanner.nextLine();
                    if (shoppingList.remove(itemToDelete)) {
                        System.out.println("'" + itemToDelete + "' deleted from the shopping list.");
                    } else {
                        System.out.println("'" + itemToDelete + "' not found in the shopping list.");
                    }
                    break;

                case 4:
                    // Print shopping list
                    System.out.println("Shopping List:");
                    for (int i = 0; i < shoppingList.size(); i++) {
                        System.out.println(shoppingList.get(i));
}
                    break;

                case 5:
                    // Exit the program
                    System.out.println("Exiting the program. Thank you!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }
    }
}
