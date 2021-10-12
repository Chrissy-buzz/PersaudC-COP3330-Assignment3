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
            //create new file
            File f = new File("program.txt");
            //empty sting for old txt
            String old = "";

            BufferedReader reader = new BufferedReader(new FileReader(filePath));

            //Reading all the lines of input text file into oldContent

            String line = reader.readLine();

            while (line != null) {
                old = old + line + System.lineSeparator();

                line = reader.readLine();
            }

            //Replacing old with newString

            String newContent = old.replaceAll("utilize", "use");
            FileWriter writer = new FileWriter(f);

            //Write the new Contect into the same file
            writer.write(newContent);
            writer.close();
            reader.close();

        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void main (String [] args){
        //Scan user input
       Scanner in = new Scanner(System.in);
       System.out.print("Enter a filename ");
       String filename = in.nextLine();

       //Please use the Location in your own Computer
        //Call modify file
        modifyFile("C:\\Users\\Christina\\OneDrive\\Desktop\\" + filename);
        System.out.println("done");
    }
}
