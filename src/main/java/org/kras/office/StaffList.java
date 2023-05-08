package org.kras.office;

import java.util.ArrayList;
import java.util.List;

public class StaffList implements Employee {


  List<Employee> employees = new ArrayList<Employee>();

  public StaffList() {
    Manager manager = new Manager();
    SalesPerson salesPerson1 = new SalesPerson();
    SalesPerson salesPerson2 = new SalesPerson();
    employees.add(manager);
    employees.add(salesPerson1);
    employees.add(salesPerson2);
  }

  public int getSalary() {
    return employees.stream().mapToInt(Employee::getSalary).sum();
  }

  @Override
  public void accept(Visitor visitor) {
    employees.forEach(e -> e.accept(visitor));
    visitor.visit(this);
  }

}
