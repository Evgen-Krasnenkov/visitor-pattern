package org.kras.store;

public class DiscountVisitor implements Visitor {
    @Override
    public void visit(Bread bread) {
        bread.setPrice(0.9);
    }

    @Override
    public void visit(Milk milk) {
        milk.setPrice(1.75);
    }

    @Override
    public void visit(GroceryList groceryList) {
        System.out.println("Discounts apply");
    }
}
