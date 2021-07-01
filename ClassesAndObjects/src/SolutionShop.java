import java.util.Locale;
import java.util.Scanner;

public class SolutionShop {

    private String name;
    private SolutionItem[] inventory;

    public SolutionShop(String name, SolutionItem[] inventory){
        this.name = name;
        this.inventory = inventory;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public void getInventory() {
        for (SolutionItem item : inventory)
        {
            System.out.println(item.getName() + "\n Description: " + item.getDescription() + "\n I have " + item.getQuantity() + ", they cost " + item.getPrice() + " gold.\n");
        }
    }

    public void RunShop()
    {
        System.out.println("Welcome to " + this.getName() + ". Purveyors of the highest quality goods from across the realm.\n Would you like to see our current stock? Yes or No");
        Scanner input = new Scanner(System.in);
        String response = input.nextLine();

        if (response.toLowerCase().equals("yes"))
        {
            this.getInventory();
            this.SellItem(this.inventory);
        }
        else
        {
            System.out.println("Well go away then!");
        }
        input.close();
    }


    public void SellItem(SolutionItem[] inventory)
    {
        System.out.println("Would you like to buy something? Yes or No");
        Scanner input = new Scanner(System.in);
        String buyIt = input.nextLine();

        while (buyIt.toLowerCase().equals("yes"))
        {
            System.out.println("What would you like to purchase? (or press Enter when done buying)");
            String response = input.nextLine();

            if (response != "")
            {

                for (SolutionItem item : inventory)
                {
                    if (item.getName().toLowerCase().contains(response.toLowerCase()))
                    {
                        System.out.println("How many would you like to buy?");
                        int amount = Integer.parseInt(input.nextLine());

                        if (amount <= item.getQuantity() && amount != 0)
                        {
                            int newQuantity = item.getQuantity() - amount;
                            item.setQuantity(newQuantity);
                            System.out.println(item.getName() + " now has "  + item.getQuantity() + " left.");
                        }
                    }
                }
            }
            else
            {
                System.out.println("Thanks for visiting!");
                break;
            }
        }
    }
}
