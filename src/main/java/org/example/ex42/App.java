package ex42;

import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Christina Persaud
 */


public class App {
    public static String[] convert(File fil) {
        try {
            System.out.printf("Last\t\tFirst\t\tSalary\n");
            System.out.printf("______________________________\n");
           FileReader fr = new FileReader(fil);
            BufferedReader reader = new BufferedReader(fr);

            String read = null;
            while ((read = reader.readLine()) != null) {
                String splited = read.replaceAll("\t", "\n");
                String done = splited.replaceAll(",", "\t\t");
                System.out.printf(done);
            }
            reader.close();

        }
        catch (FileNotFoundException e){
            System.out.print("f");
        }
        catch (IOException e){}

        return null;
    }

    public static void main(String[] args) {
        File myObj = new File("C:\\Users\\Christina\\OneDrive\\Desktop\\exercise42_input.txt");
        convert(myObj);
    }
}