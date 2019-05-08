package org.neomatrix369.salaryslip;

import org.junit.Assert;
import org.junit.Test;

public class SalarySlipGeneratorShould
{

    @Test
    public void test24KSalary()
    {
        Employee employee = new Employee();
        employee.setEmployeeId( "12345" );
        employee.setEmployeeName( "John J Doe" );
        employee.setAnnualGrossSalary( 24000f );
        SalarySlip salarySlip = SalarySlipGenerator.generateFor( employee );

        Assert.assertEquals( "12345", salarySlip.getEmployeeId() );
        Assert.assertEquals( "John J Doe", salarySlip.getEmployeeName() );
        double delta = 0.01;
        Assert.assertEquals( 159.40f, salarySlip.getNationalInsuranceContributions(), delta );
        Assert.assertEquals( 916.67f, salarySlip.getTaxFreeAllowance(), delta );
        Assert.assertEquals( 1083.33f, salarySlip.getTaxableIncome(), delta );
        Assert.assertEquals( 216.67f, salarySlip.getTaxPayable(), delta );

    }
}
