import java.util.ArrayList;
import java.util.Scanner;

public class Inventory {

    // Public static inventory accessible from other classes
    public static ArrayList<String> inventory = new ArrayList<>();

    // Add item method with Scanner parameter
    public static void addItem(String item, Scanner scnr) {
        if (inventory.size() >= 10) {
            System.out.println("Your inventory is full. Would you like to remove an item? Y/N");
            String choice = scnr.next();

            if (choice.equalsIgnoreCase("Y")) {
                System.out.println("Which item would you like to remove?");
                InventoryActions.InventoryDisplay(inventory);
                System.out.print("Enter index of item to remove: ");

                // Make sure to check for valid int input here if you want to be thorough
                int index = scnr.nextInt();
                InventoryActions.InventoryRemover(inventory, index);
            } else {
                System.out.println("Item not added.");
                return;  // Exit early, do not add the new item
            }
        }

        inventory.add(item);
        System.out.println(item + " has been added to your inventory.");
    }
}
