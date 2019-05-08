package org.neomatrix369.salaryslip;

public class Employee
{
    private String employeeId;
    private String employeeName;
    private float annualGrossSalary;

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

    public float getAnnualGrossSalary()
    {
        return annualGrossSalary;
    }

    public void setAnnualGrossSalary( float annualGrossSalary )
    {
        this.annualGrossSalary = annualGrossSalary;
    }
}
