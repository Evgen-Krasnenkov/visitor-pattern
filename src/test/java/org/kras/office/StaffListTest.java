package org.kras.office;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StaffListTest {
    @Test
    void givenEmpList_whenChangeSalaries_thenVisitorApplies() {
        StaffList staffList = new StaffList();
        Assertions.assertEquals(160000, staffList.getSalary());
        staffList.accept(new EmployeeVisitor());
        Assertions.assertEquals(105000, staffList.getSalary());
    }

}