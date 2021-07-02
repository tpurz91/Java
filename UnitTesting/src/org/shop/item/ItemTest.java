package org.shop.item;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.net.Proxy;

import static org.junit.jupiter.api.Assertions.*;

class ItemTest {
    static Item item1, item2, item3, item4;

    @BeforeAll
    static void createItemObjects(){
        item1 = new Item();
        item2 = new Item();
        item3 = new Item("Flint", "Burninating all the things.", 1, 10);
        item4 = new Item("Flint", "Burninating all the things.", 1, 10);
    }

    /* The item instances are created for you in a BeforeALl that will create these instances which can be reused in all your tests.

        For the first test, write a test that determines if the id's that are created for item1 and item2 are different,
        and that item2's id is 1 higher than the id for item1.
    */

    @Test
    void testIdCreation() {
    }

    // Test the equals method in the item class to see if item1 does not equal item2, or item3 does not equal item4.

    @Test
    void testEquals() {

    }

    // test that the getItem method returns a \n as the first character and a \n as the last character.
    @Test
    void testGetItemStartsAndEndsWithNewLine(){

    }

    // test that the getItem method returns the expected String format.  - The code to build the String.format is included
    @Test
    void testGetItemReturnsExpectedFormat() {
       String expected = String.format("\n%s\n Description: %s\n I have %d, they cost %d gold.\n", item3.getName(), item3.getDescription(), item3.getQuantity(), item3.getPrice());
    }
}





