import java.util.Random;
import java.util.ArrayList;

public class RandomItemChooser {

    private static final Random random = new Random(); // single Random instance

    // This method selects an item based on rarity chance
    public static String getItemByRarity(ArrayList<String> commonItems, ArrayList<String> uncommonItems, 
            ArrayList<String> rareItems) {

    	int randomNumber = random.nextInt(100) + 1;  // 1 to 100
    	String selectedItem;
    	String rarity;

    	if (randomNumber > 30) {
    		selectedItem = getRandomItem(commonItems);
    		rarity = "Common";
    	} 
    	else if (randomNumber > 20) {
    		selectedItem = getRandomItem(uncommonItems);
    		rarity = "Uncommon";
    	} 
    	else {
    		selectedItem = getRandomItem(rareItems);
    		rarity = "Rare";
    	}

    	return selectedItem + " (" + rarity + ")";
    }

    // Helper method to get a random item from a list
    public static String getRandomItem(ArrayList<String> items) {
        return items.get(random.nextInt(items.size())); // use the shared Random
    }
}
