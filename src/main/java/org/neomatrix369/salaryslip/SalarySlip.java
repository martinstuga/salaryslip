package org.neomatrix369.salaryslip;

public class SalarySlip
{
    String employeeId;
    String employeeName;
    float salary;
    float nationalInsuranceContributions;
    float taxFreeAllowance;
    float taxableIncome;
    float payable;

    public String getEmployeeId()
    {
        return employeeId;
    }

    public void setEmployeeId( String employeeId )
    {
        this.employeeId = employeeId;
    }

    public String getEmployeeName()
    {
        return employeeName;
    }

    public void setEmployeeName( String employeeName )
    {
        this.employeeName = employeeName;
    }

    public float getSalary()
    {
        return salary;
    }

    public void setSalary( float salary )
    {
        this.salary = salary;
    }

    public float getNationalInsuranceContributions()
    {
        return nationalInsuranceContributions;
    }

    public void setNationalInsuranceContributions( float nationalInsuranceContributions )
    {
        this.nationalInsuranceContributions = nationalInsuranceContributions;
    }

    public float getTaxFreeAllowance()
    {
        return taxFreeAllowance;
    }

    public void setTaxFreeAllowance( float taxFreeAllowance )
    {
        this.taxFreeAllowance = taxFreeAllowance;
    }

    public float getTaxableIncome()
    {
        return taxableIncome;
    }

    public void setTaxableIncome( float taxableIncome )
    {
        this.taxableIncome = taxableIncome;
    }

    public float getTaxPayable()
    {
        return payable;
    }

    public void setPayable( float payable )
    {
        this.payable = payable;
    }
}
