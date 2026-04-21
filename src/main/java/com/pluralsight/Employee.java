package com.pluralsight;

import java.util.regex.Pattern;

public class Employee {
    private int employedId;
    private String name;
    private double hoursWorked;
    private double payRate;

    public Employee(int employedId, String name, double hoursWorked, double payRate) {
        this.employedId = employedId;
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }
    public Employee(String line){
        String[] employee = line.split(Pattern.quote("|"));
        this.employedId = Integer.parseInt(employee[0]);
        this.name = employee[1];
        this.hoursWorked = Double.parseDouble(employee[2]);
        this.payRate = Double.parseDouble(employee[3]);
    }



    public int getEmployedId() {
        return employedId;
    }

    public void setEmployedId(int employedId) {
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
    public double getGrossPay(){
        if (this.hoursWorked > 40){
            double basePay = 40 * payRate;
            double overTime = (hoursWorked - 40) * (payRate * 1.20);
            return basePay + overTime;

        }else{
            return hoursWorked * payRate;
        }
    }
}
