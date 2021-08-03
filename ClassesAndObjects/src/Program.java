public class Program {

    public static void main(String[] args) {

        /*  **** START IN THE ITEM CLASS ****
         - Your Shop class will show errors until you create the Item. Don't worry. Once you create your Item Class the errors will disappear.

        Now that you've created your Item class, it's time to create some instances of that class to populate your shop's inventory.
        You can always use the same items that we've been using in the other examples: Flint, Rope, Healing Potion, Dagger, Bedroll, Bread, Tin Whistle

        Take a close look at the Shop class and see what the Inventory is made of.

        Now that you have Item objects, make sure those are in the correct format to go into the Inventory of your shop.

        Now that we have an inventory for our shop, we have to make our shop! Take a look at the Shop class and create a new shop.

        We have items.We have an inventory.We have a shop...now we just have to make the shop run.
    */


        Item dagger = new Item("Dagger", "For close range combat", 15, 75);
        Item sword = new Item("Sting", "Glows blue when enemies near", 1, 100);
        Item theRing = new Item("The one true Ring", "One ring to rule", 1, 0);
        Item healingPotion = new Item("Healing Potion", "Heals Wounds", 20, 10);

        Item[] inventory = {dagger, sword, theRing, healingPotion};

        Shop prancingPony = new Shop("Prancing Pony", inventory);
        prancingPony.RunShop();


    }


}




