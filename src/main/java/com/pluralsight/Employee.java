package com.pluralsight;

public class Employee {

    // fields
    int employeeId;
    String name;
    String department;
    double payRate;
    double hoursWorked;


    // constructors

    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }


    // getters setters

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }


    // derived getters
    public double getRegularHours() {
        return (hoursWorked > 40) ? 40 : hoursWorked;
    }

    public double getOvertimeHours() {
        return (hoursWorked > 40) ? hoursWorked - 40 : 0;
    }

    public double getTotalPay() {
        return ( getRegularHours()*payRate ) + ( getOvertimeHours()*(payRate*1.5) );
    }


    // punching
    public void punchTimeCard(double checkInTime, double checkOutTime) {
        this.hoursWorked += (checkOutTime - checkInTime);
    }

    public void logHours(double hours) {
        this.hoursWorked += hours;
    }


    // overrides?



} // closes Employee class
