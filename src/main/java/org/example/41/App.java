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
            BufferedReader reader = new BufferedReader(fr);

            ArrayList<String> str = new ArrayList<>();
            String line = "";
            while((line=reader.readLine())!=null){
                str.add(line);
            }
            Collections.sort(str);
            FileWriter writer = new FileWriter("exercise41_output.txt");
            for(String s: str){
                writer.write(s);
                writer.write("\n");
            }
            writer.close();
            reader.close();
        }
        catch (FileNotFoundException e){}
        catch (IOException e){}

        return null;
    }

    public static void main(String[] args) {
        File myObj = new File("C:\\Users\\Christina\\OneDrive\\Desktop\\exercise41_input.txt");
        convert(myObj);
    }
}