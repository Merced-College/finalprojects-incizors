import java.util.LinkedList;
import java.util.Queue;

public class PickupTracker {
	// Only tracks the 5 recent items
    private static final int MAX_HISTORY = 5;
    // Declaring a queue and linkedlist
    private static Queue<String> recentItems = new LinkedList<>();

    // Add an item to the recent pickups queue
    public static void addPickup(String item) {
        if (recentItems.size() >= MAX_HISTORY) {
            recentItems.poll();  // Remove oldest item
        }
        recentItems.offer(item);
    }

    // Display recent pickups
    public static void displayRecentPickups() {
        if (recentItems.isEmpty()) {
            System.out.println("No recent pickups.");
            return;
        }
        System.out.println("Recent pickups:");
        int i = 1;
        for (String item : recentItems) {
            System.out.println(i + ": " + item);
            i++;
        }
    }
}
