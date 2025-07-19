import java.util.ArrayList;
import java.util.Random;

public class RandomItemList {

    private static ArrayList<String> commonItems = new ArrayList<>();
    private static ArrayList<String> uncommonItems = new ArrayList<>();
    private static ArrayList<String> rareItems = new ArrayList<>();

    static {
        // Add items directly to the static fields
        commonItems.add("Apple");
        commonItems.add("Rusty Sword");
        commonItems.add("Wooden Bow");
        commonItems.add("Copper Ingot");
        commonItems.add("Leather Armor");
        commonItems.add("Cobwebs");
        commonItems.add("Bread Loaf");
        commonItems.add("Stone Arrow");
        commonItems.add("Old Bandage");
        commonItems.add("Frog Leg");

        uncommonItems.add("Cooked Meat");
        uncommonItems.add("Iron Longsword");
        uncommonItems.add("Iron Crossbow");
        uncommonItems.add("Gold Ingot");
        uncommonItems.add("Iron Plate Armor");
        uncommonItems.add("Coin Purse");
        uncommonItems.add("Field Rations");
        uncommonItems.add("Iron Bolt");
        uncommonItems.add("Medkit");
        uncommonItems.add("Health Potion");

        rareItems.add("Cake");
        rareItems.add("Lightsaber");
        rareItems.add("Sniper Rifle");
        rareItems.add("Valyrian Ingot");
        rareItems.add("Stormtrooper Armor");
        rareItems.add("Magic Carpet");
        rareItems.add("Unicorn Horn");
        rareItems.add("Bullet");
        rareItems.add("Surgical Kit");
        rareItems.add("Ferrari");
    }

    public static String RandomItemRoller(ArrayList<String> itemList) {
        Random random = new Random();
        return itemList.get(random.nextInt(itemList.size()));
    }

    public static ArrayList<String> getCommonItems() {
        return commonItems;
    }

    public static ArrayList<String> getUncommonItems() {
        return uncommonItems;
    }

    public static ArrayList<String> getRareItems() {
        return rareItems;
    }
}
