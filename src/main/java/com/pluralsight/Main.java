package com.pluralsight;
import java.io.*;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args){
        try {

            //new scanner
            Scanner scanner = new Scanner(System.in);

            //prompting the user
            System.out.println("Enter the name of the file to process: ");
            String wantedFile = "Files/" + scanner.nextLine();
            System.out.println("Enter the name of the payroll file to create: ");
            String pRollFile = "Files/" + scanner.nextLine();


            BufferedReader bufferedReader = new BufferedReader(new FileReader(wantedFile));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(pRollFile));

            String line;

            //skip the header
            bufferedReader.readLine();

            while ((line = bufferedReader.readLine()) != null) {

                Employee e = new Employee(line);

                // Print full line just relised my \n was using the wrong slash
                System.out.printf("Employees and Gross pay: %d %s %.2f\n",e.getEmployedId(),e.getName(),e.getGrossPay());

            }
            bufferedReader.close();
            bufferedWriter.close();

        } catch (IOException e) {
            System.out.println("Error occurred:");
            System.out.println(e.getMessage());
        }
    }
}