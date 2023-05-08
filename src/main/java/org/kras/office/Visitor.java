package org.kras.office;

public interface Visitor {
    void visit(Manager employee);

    void visit(SalesPerson employee);

    void visit(StaffList staffList);
}
