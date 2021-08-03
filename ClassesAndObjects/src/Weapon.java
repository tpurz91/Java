public class Weapon extends Item {
    private Integer attackPower;

    public Weapon(String name, String description, Integer quantity, Integer price, Integer attackPower) {
        super(name, description, quantity, price);
        this.attackPower = attackPower;
    }

    public Integer getAttackPower() {
        return attackPower;
    }


}
