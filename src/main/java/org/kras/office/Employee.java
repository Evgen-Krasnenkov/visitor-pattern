package org.kras.office;

public interface Employee {

  int getSalary();

  void accept(Visitor visitor);

}
