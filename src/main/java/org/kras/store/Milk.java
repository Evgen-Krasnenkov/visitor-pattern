package org.kras.store;

public class Milk implements Groceries {

  private double price = 2;

  public void setPrice(double price) {
    this.price = price;
  }

  public double getPrice() {
    return price;
  }

  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }

}
