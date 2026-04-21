package com.pluralsight;
import java.io.*;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args){
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("Files/employees.csv"));

            String line;

            //skip the header
            bufferedReader.readLine();

            while ((line = bufferedReader.readLine()) != null) {

                Employee e = new Employee(line);

                // Print full line just relized my \n was using the wrong slash
                System.out.printf("Employees and Gross pay: %d %s %.2f\n",e.getEmployedId(),e.getName(),e.getGrossPay());

            }

            bufferedReader.close();

        } catch (IOException e) {
            System.out.println("Error occurred:");
            System.out.println(e.getMessage());
        }
    }
}