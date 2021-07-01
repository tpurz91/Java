public class SolutionProgram {

    public static void main(String[] args)
    {
        SolutionItem flint = new SolutionItem("Flint", "Used to start fire", 10, 10);
        SolutionItem rope = new SolutionItem("Rope", "Ties things together, lets you climb things", 10, 10);
        SolutionItem healingPotion = new SolutionItem("Healing Potion", "Restore healths - Tastes terrible", 10, 20);

        SolutionItem[] inventory = { flint, rope, healingPotion };

        SolutionShop ourShop = new SolutionShop("Bilbo's Knicknacks", inventory);

        ourShop.RunShop();
    }

}
