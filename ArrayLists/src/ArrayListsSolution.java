import java.util.ArrayList;

public class ArrayListsSolution {
    public static void main(String[] args) {
        //1.
        ArrayList<String> inventory = new ArrayList<String>();
        inventory.add("Gold");
        inventory.add("Flint");
        inventory.add("Rope");
        inventory.add("Healing Potion");
        inventory.add("Dagger");
        inventory.add("Bedroll");
        inventory.add("Loaf of Bread");
        inventory.add("Tin Whistle");

        //2.
        //indexed for loop
        for (int i = 0; i < inventory.size(); i++) {
            System.out.println(inventory.get(i));
        }
        // because the inventory is an ArrayList we have to use a method called get to return the value that is at that index.

        // for each
//         for (String item : inventory){
//           System.out.println(item);
//       }

        //3.
        inventory.add("Loaf of Bread");
        inventory.add("Ham Hock");

        //you do NOT have to put the "String" in the type on the right side. Java is smart enough to know that if you
        // create an ArrayList of <String> type that when you're calling the constructor, that's what you want it to make.
        ArrayList<String> backpack = new ArrayList<>();
        backpack.add("Long Sword");
        backpack.add("Short Bow");
        backpack.add("Healing Potion");
        backpack.add("Small Silver Key");

        //4.
        // indexed for loop for backpack
        for (int i = 0; i < backpack.size(); i++) {
            System.out.println((backpack.get(i)));
        }

        // for each for backpack
//        for (String item : backpack){
//            System.out.println(item);
//        }

        System.out.println("Your inventory currently has " + inventory.size() + " items in your main inventory and " + backpack.size() + " items in your backpack.");

        //6.
        // with variable to hold index
//        int index = inventory.indexOf("Tin Whistle");
//        inventory.remove(index);
//
        // inline solution - both do the same thing
//        inventory.remove(inventory.indexOf("Tin Whistle"));

        //7.
        if (inventory.contains("Small Silver Key") || backpack.contains("Small Silver Key")) {
            System.out.println("You may pass.");
        } else {
            System.out.println("Fireball!");
        }
    }
}
