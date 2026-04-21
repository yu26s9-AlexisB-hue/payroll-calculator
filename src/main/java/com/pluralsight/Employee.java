package com.pluralsight;

public class Employee {
    private long employedId;
    private String name;
    private double hoursWorked;
    private double payRate;

    public Employee(long employedId, String name, double hoursWorked, double payRate) {
        this.employedId = employedId;
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }

    public long getEmployedId() {
        return employedId;
    }

    public void setEmployedId(long employedId) {
        this.employedId = employedId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }
}
