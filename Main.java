import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the inventory game.\n");

        Scanner scnr = new Scanner(System.in);
        String userInput = "";

        // While Q isn't pressed to quit
        while (!userInput.equalsIgnoreCase("Q")) {
            userInput = DefaultMessage(scnr);

            if (userInput.equalsIgnoreCase("R")) {
                System.out.println("\nRolling for a new item...");
                String newItem = RandomItemChooser.getItemByRarity(
                    RandomItemList.getCommonItems(),
                    RandomItemList.getUncommonItems(),
                    RandomItemList.getRareItems()
                );

                // Add item to inventory and recent pickups
                Inventory.addItem(newItem, scnr);
                PickupTracker.addPickup(newItem);
            }
            else if (userInput.equalsIgnoreCase("I")) {
                InventoryActions.InventoryDisplay(Inventory.inventory);
            }
            else if (userInput.equalsIgnoreCase("H")) {
            	PickupTracker.displayRecentPickups();
            }
            else if (!userInput.equalsIgnoreCase("Q")) {
                System.out.println("Unknown command.");
            }
        }

        System.out.println("Thanks for playing!");
        scnr.close();
    }

    public static String DefaultMessage(Scanner scnr) {
        System.out.println("\nTo roll for a new item, type 'R'. To display inventory, "
            + "type 'I'. To show recent pickups, type 'H'. To quit, type 'Q'.");
        return scnr.next();
    }
}
