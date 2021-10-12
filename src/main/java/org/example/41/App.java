package ex41;

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
            FileReader fr = new FileReader(fil);
            BufferedReader reader = new BufferedReader(fr); //read file

            ArrayList<String> str = new ArrayList<>(); //create empty array
            String line = ""; //create empty str
            while((line=reader.readLine())!=null){
                str.add(line); //add what is read to array
            }
            Collections.sort(str);
            FileWriter writer = new FileWriter("exercise41_output.txt");//create output file
            for(String s: str){
                writer.write(s);
                writer.write("\n");//write what is in array to new file
            }
            writer.close();
            reader.close();
        }
        //catch errors
        catch (FileNotFoundException e){
            System.out.printf("Error");
        }
        catch (IOException e){
            System.out.printf("Error");
        }
        return null;
    }

    public static void main(String[] args) {
        //create object
        File myObj = new File("C:\\Users\\Christina\\OneDrive\\Desktop\\exercise41_input.txt");//use your own location for the input text
        convert(myObj);//call convert function
    }
}