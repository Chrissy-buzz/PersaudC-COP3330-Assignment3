package ex42;

import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Christina Persaud
 */


public class App {
    public static String[] convert(File fil) {
        try {
            System.out.printf("Last\t\tFirst\t\tSalary\n");
            System.out.printf("______________________________\n");
            //read file
            FileReader fr = new FileReader(fil);
            BufferedReader reader = new BufferedReader(fr);

            String read = null; //create string to store file text
            while ((read = reader.readLine()) != null) {
                //Split the text so that you can output it as a table
                String splited = read.replaceAll("\t", "\n");
                String done = splited.replaceAll(",", "\t\t");
                System.out.printf(done);
            }
            reader.close();

        }
        //Catch errors
        catch (FileNotFoundException e){
            System.out.printf("Error");
        }
        catch (IOException e){
            System.out.printf("Error");
        }

        return null;
    }

    public static void main(String[] args) {
        //create obj for file
        File myObj = new File("C:\\Users\\Christina\\OneDrive\\Desktop\\exercise42_input.txt");//please use the location of your file
        //call convert function
        convert(myObj);
    }
}