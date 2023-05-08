package org.kras.store;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GroceryListTest {

    @Test
    void givenGroceryList_whenGetSum_thenSumUpTotal() {
        GroceryList groceryList = new GroceryList();
        Assertions.assertEquals(4.0, groceryList.getPrice());
        groceryList.accept(new DiscountVisitor());
        Assertions.assertEquals(3.55, groceryList.getPrice());
    }

}