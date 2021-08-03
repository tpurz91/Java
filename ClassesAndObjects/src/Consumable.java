public class Consumable extends Item{
    private Integer durationInSec;

    public Consumable(String name, String description, Integer quantity, Integer price, Integer durationInSec) {
        super(name, description, quantity, price);
        this.durationInSec = durationInSec;
    }

    public Integer getDurationInSec() {
        return durationInSec;
    }
}
