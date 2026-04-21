package com.pluralsight;
import java.io.*;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args){
    try{
        BufferedReader bufferedReader = new BufferedReader(new FileReader("Files/employees.csv"));

        String line;
        bufferedReader.readLine();

        while((line = bufferedReader.readLine()) != null){
            System.out.println(line);
        }
        bufferedReader.close();
    }
    catch (IOException e ){
        System.out.println("error");

        //Used to print out the actual issue.
        System.out.println(e.getMessage());
    }

    }


}
