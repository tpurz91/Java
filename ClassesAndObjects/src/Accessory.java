public class Accessory extends Item{
    private Integer protectionLevel;

    public Accessory(String name, String description, Integer quantity, Integer price, Integer protectionLevel) {
        super(name, description, quantity, price);
        this.protectionLevel = protectionLevel;
    }

    public Integer getProtectionLevel() {
        return protectionLevel;
    }
}
