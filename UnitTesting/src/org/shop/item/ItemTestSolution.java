package org.shop.item;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ItemTestSolution {

    static Item item1, item2, item3, item4;

    @BeforeAll
    static void createItemObjects(){
        item1 = new Item();
        item2 = new Item();
        item3 = new Item("Flint", "Burninating all the things.", 1, 10);
        item4 = new Item("Flint", "Burninating all the things.", 1, 10);
    }

    @Test
    void testIdCreation() {
        Integer id1 = item1.getId();
        Integer id2 = item2.getId();
        assertEquals(1, id2-id1);
    }

    @Test
    void testEquals() {
        assertFalse(item1.equals(item2));
        assertFalse(item3.equals(item4));
    }

    @Test
    void testGetItemStartsAndEndsWithNewLine(){
        char firstChar = item3.getItem().charAt(0);
        char lastChar = item3.getItem().charAt(item3.getItem().length()-1);
        assertTrue(firstChar == lastChar);
    }

    @Test
    void testGetItemReturnsExpectedFormat() {
        String actual = item3.getItem();
        String expected = String.format("\n%s\n Description: %s\n I have %d, they cost %d gold.\n", item3.getName(), item3.getDescription(), item3.getQuantity(), item3.getPrice());
        assertEquals(expected, actual);
    }
}
