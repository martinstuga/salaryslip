package org.neomatrix369.salaryslip;

public class SalarySlipGenerator {
    public static SalarySlip generateFor(Employee employee) {
        SalarySlip salarySlip = new SalarySlip();

        salarySlip.setEmployeeId( employee.getEmployeeId() );
        salarySlip.setEmployeeName( employee.getEmployeeName() );

        return salarySlip;
    }
}
