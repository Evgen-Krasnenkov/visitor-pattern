package org.kras.office;

public class Manager implements Employee {

  private int salary = 60000;

  public void setSalary(int salary) {
    this.salary = salary;
  }

  public int getSalary() {
    return salary;
  }

  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }

}
