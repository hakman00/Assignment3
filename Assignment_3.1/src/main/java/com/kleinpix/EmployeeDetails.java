
package com.kleinpix;

/*
    Name    :   Heinrich Klein
    Student#:   195032659
    Date    :   01 March 2018
    Descript:   Create an Application that will make use of Collection,List,Set and Map
 */

public class EmployeeDetails
{
    private String empName;
    private String empSurname;
    private double empSalary;
    private int empId;
    //default constructor
    public EmployeeDetails ()
    {

    }
    //parameterized constructor
    public EmployeeDetails (String name,String surname,double salary,int id)
    {
        this.empName = name;
        this.empSurname = surname;
        this.empSalary = salary;
        this.empId = id;
    }
    //methods
    //getters
    public String getEmpName()
    {
        return empName;
    }

    public String getEmpSurname()
    {
        return empSurname;
    }

    public double getEmpSalary ()
    {
        return empSalary;
    }

    public int getEmpId()
    {
        return empId;
    }
}
