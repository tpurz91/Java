import java.util.HashMap;
import java.util.Map;

public class HashMapSolution {
    public static void main(String[] args) {
        // 1.
        HashMap<String, Integer> inventory = new HashMap<>();
        inventory.put("Gold", 500);
        inventory.put("Flint", 1);
        inventory.put("Healing Potion", 2);
        inventory.put("Tin Whistle", 1);
        inventory.put("Dagger", 1);
        inventory.put("Rope", 1);
        inventory.put("Bedroll", 1);
        inventory.put("Loaf of Bread", 1);

        //2.
        for (Map.Entry<String,Integer> item : inventory.entrySet())
        {
            System.out.println(item.getKey() + " : " + item.getValue());
        }
        //3.
        inventory.replace("Gold", 140);

        // 4.
        inventory.put("Small Silver Key", 1);
        inventory.put("Long Sword", 1);
        inventory.replace("Loaf of Bread", 6);
        inventory.replace("Healing Potion", 4);

        HashMap<String, Integer> backpack = new HashMap<>();
        backpack.put("Ham Hock", 5);
        backpack.put("Short Bow", 1);

        // 5.
        for (Map.Entry<String, Integer> item : inventory.entrySet())
        {
            System.out.println(item.getKey() + " : " + item.getValue());
        }
        System.out.println(inventory.size());

        for (Map.Entry<String, Integer>item : backpack.entrySet())
        {
            System.out.println(item.getKey() + " : " + item.getValue());
        }

        //6.
        System.out.println("Inventory Count: " + inventory.size());
        System.out.println("Backpack Count: " + backpack.size());

        //7.
        inventory.remove("Tin Whistle");

        //8.
        inventory.replace("Gold", 150);

        //9.
        if (inventory.containsKey("Small Silver Key") || backpack.containsKey("Small Silver Key")) {
            System.out.println("You may pass.");
        } else {
            System.out.println("FIREBALL!!!");
        }
    }
}
