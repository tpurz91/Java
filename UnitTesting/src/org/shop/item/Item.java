package org.shop.item;

import java.util.Objects;

public class Item {

    private Integer id;
    private static int nextId = 1;
    private String name;
    private String description;
    private Integer quantity;
    private Integer price;

    public Item() {
        id = nextId;
        nextId++;
    }

    public Item (String name, String description, Integer quantity, Integer price){
        this();
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }

    public String getItem (){
        return "\n" + this.getName() + "\n Description: " + this.getDescription() + "\n I have " + this.getQuantity() + ", they cost " + this.getPrice() + " gold.\n";
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    private void setDescription(String description) {
        this.description = description;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getPrice() {
        return price;
    }

    private void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Item)) return false;
        Item item = (Item) o;
        return id.equals(item.id) && Objects.equals(name, item.name) && Objects.equals(description, item.description) && Objects.equals(quantity, item.quantity) && Objects.equals(price, item.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, quantity, price);
    }
}
