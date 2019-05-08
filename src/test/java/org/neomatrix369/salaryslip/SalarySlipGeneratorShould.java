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
        employee.setAnnualGrossSalary( 8416.67f );
        SalarySlip salarySlip = SalarySlipGenerator.generateFor( employee );

        Assert.assertEquals( "12345", salarySlip.getEmployeeId() );
        Assert.assertEquals( "John J Doe", salarySlip.getEmployeeName() );
        Assert.assertEquals( 446.07f, salarySlip.getNationalInsuranceContributions(), 0 );
        Assert.assertEquals( 875f, salarySlip.getTaxFreeAllowance(), 0 );
        Assert.assertEquals( 7541.67f, salarySlip.getTaxableIncome(), 0 );
        Assert.assertEquals( 2483.33f, salarySlip.getTaxPayable(), 0 );

    }

}
