package org.kras.office;

public class EmployeeVisitor implements Visitor {
    @Override
    public void visit(Manager manager) {
        manager.setSalary(5000);
    }

    @Override
    public void visit(SalesPerson employee) {
        employee.setSalary(10000);
    }

    @Override
    public void visit(StaffList staffList) {
        System.out.println("Salaries changed");
    }
}
