package com.pluralsight;
import java.io.*;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args){
        try {
            BufferedReader bufferedReader = new BufferedReader(
                    new FileReader("Files/employees.csv"));

            String line;

            //skip the header
            bufferedReader.readLine();

            while ((line = bufferedReader.readLine()) != null) {
                String[] employee = line.split(Pattern.quote("|"));
                int Id = Integer.parseInt(employee[0]);
                String n = employee[1];
                double hoursWorked = Double.parseDouble(employee[2]);
                double payRate = Double.parseDouble(employee[3]);

                Employee e = new Employee();

                e.setEmployedId(Id);
                e.setName(n);
                e.setHoursWorked(hoursWorked);
                e.setPayRate(payRate);

                // Print full line
                System.out.printf("These are your employees %d %s %.2f/n",e.getEmployedId(),e.getName(),e.getGrossPay());

            }

            bufferedReader.close();

        } catch (IOException e) {
            System.out.println("Error occurred:");
            System.out.println(e.getMessage());
        }
    }
}