package org.neomatrix369.salaryslip;

public class SalarySlipGenerator
{

    /**
     * Employee ID: 12345
     * Employee Name: John J Doe
     * Gross Salary: £2000.00
     * National Insurance contributions: £159.40
     * Tax-free allowance: £916.67
     * Taxable income: £1083.33
     * Tax payable: £216.67
     *
     * @param employee
     * @return
     */
    public static SalarySlip generateFor( Employee employee )
    {

        float monthlySalary = employee.getAnnualGrossSalary() / 12;
        float annualGrossSalary = employee.getAnnualGrossSalary();

        SalarySlip salarySlip = new SalarySlip();
        salarySlip.setEmployeeId( employee.getEmployeeId() );
        salarySlip.setEmployeeName( employee.getEmployeeName() );
        salarySlip.setSalary( monthlySalary );

        float taxFreeAllowance = 11000;
        float nationalInranceDeductibleAllowance = 8060;
        float nationalInsuranceTaxble = Math.max( 0, annualGrossSalary-nationalInranceDeductibleAllowance);

        float taxableIncome = Math.max( 0, annualGrossSalary - taxFreeAllowance );
        float taxFreeIncome = annualGrossSalary - taxableIncome;
        float taxPayable = taxableIncome * 0.2f;
        float nationalInsuranceTax = nationalInsuranceTaxble * 0.12f;



        salarySlip.setSalary( monthlySalary );
        salarySlip.setPayable( taxPayable / 12f );
        salarySlip.setTaxableIncome( taxableIncome / 12f );
        salarySlip.setTaxFreeAllowance( taxFreeAllowance / 12f );
        salarySlip.setNationalInsuranceContributions( nationalInsuranceTax / 12f );


        return salarySlip;
    }
}


