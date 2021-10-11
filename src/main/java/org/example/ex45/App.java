package ex45;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Christina Persaud
 */

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

class App {
    static void modifyFile(String filePath) {

        try {
            File f = new File("program.txt");
            String oldContent = "";

            BufferedReader reader = new BufferedReader(new FileReader(filePath));

            //Reading all the lines of input text file into oldContent

            String line = reader.readLine();

            while (line != null) {
                oldContent = oldContent + line + System.lineSeparator();

                line = reader.readLine();
            }

            //Replacing oldString with newString in the oldContent

            String newContent = oldContent.replaceAll("utilize", "use");
            FileWriter writer = new FileWriter(f);

            //Rewriting the input text file with newContent
            writer.write(newContent);
            writer.close();
            reader.close();

        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void main (String [] args){
       Scanner in = new Scanner(System.in);
       System.out.print("Enter a filename ");
       String filename = in.nextLine();

        modifyFile("C:\\Users\\Christina\\OneDrive\\Desktop\\" + filename);
        System.out.println("done");
    }
}
