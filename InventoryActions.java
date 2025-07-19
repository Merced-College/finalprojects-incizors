import java.util.ArrayList;

public class InventoryActions {
	
	// Inventory display fetcher
	public static void InventoryDisplay(ArrayList<String> inventory) {
    for (int i = 0; i < inventory.size(); ++i) {
        System.out.println(i + ": " + inventory.get(i));
    	}
	}
	
	public static void InventoryRemover(ArrayList<String> inventory, int index) {
    if (index >= 0 && index < inventory.size()) {
        inventory.remove(index);
        System.out.println("\nItem removed.");
    } 
    else {
        System.out.println("\nInvalid index.");
    	 }
	}
	
}
