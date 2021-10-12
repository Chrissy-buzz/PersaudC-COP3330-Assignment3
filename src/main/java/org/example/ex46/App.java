package ex46;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Christina Persaud
 */

import java.io.*;
import java.io.BufferedReader;

class App {
    static int countFile(String word) { //take in word: badger, mushroom or snake
        try {
            //Please use location of the file in your computer
            FileInputStream fis = new FileInputStream("C:\\Users\\Christina\\OneDrive\\Desktop\\exercise46_input.txt");
            //read file stream
            BufferedReader in = new BufferedReader(new InputStreamReader(fis));

            //Empty string initialized
            String readLine = "";

            int count = 0;
            while ((readLine = in.readLine()) != null) {
                String[] words = readLine.split(" "); //Split the string with " " and store in array
                for (String s : words) { //increase count for string in array
                    if (s.equals(word)) count++;
                }
            }
            return count;
        } catch (IOException e) {
            System.out.printf("Error")
        }
        return 0;
    }

    public static void main(String[] args) {
        //Inpt string into modifyFile function and store count in int
        int badger = countFile("badger");
        int mushroom = countFile("mushroom");
        int snake = countFile("snake");

        //To print out stars: use for loop with int
        // If ___ is the highest # of occurences will print first
        if (badger > mushroom && badger > snake) {
            System.out.printf("badger: ");
            for (int i = 0; i < badger; i++) {
                System.out.print("*");
            }
        }

        if (mushroom > badger && mushroom > snake) {
            System.out.printf("\nmushroom: ");
            for (int i = 0; i < mushroom; i++) {
                System.out.print("*");
            }
        }
        if (snake > badger && snake > mushroom) {
            System.out.printf("\nsnake: ");
            for (int i = 0; i < snake; i++) {
                System.out.print("*");
            }
        }
        // If ___ is the second highest # of occurences will print second
        if (mushroom > badger && mushroom < snake) {
            System.out.printf("\nmushroom: ");
            for (int i = 0; i < mushroom; i++) {
                System.out.print("*");
            }
        }
        if (mushroom < badger && mushroom > snake) {
            System.out.printf("\nmushroom: ");
            for (int i = 0; i < mushroom; i++) {
                System.out.print("*");
            }
        }
        if (badger < mushroom && badger > snake) {
            System.out.printf("badger: ");
            for (int i = 0; i < badger; i++) {
                System.out.print("*");
            }
        }
        if (badger > mushroom && badger < snake) {
            System.out.printf("badger: ");
            for (int i = 0; i < badger; i++) {
                System.out.print("*");
            }
        }
        if (snake < badger && snake > mushroom) {
            System.out.printf("\nsnake: ");
            for (int i = 0; i < snake; i++) {
                System.out.print("*");
            }
        }
        if (snake > badger && snake < mushroom) {
            System.out.printf("\nsnake: ");
            for (int i = 0; i < snake; i++) {
                System.out.print("*");
            }
        }
        // If ___ is the least # of occurences will print last
        if (snake < badger && snake < mushroom) {
            System.out.printf("\nsnake: ");
            for (int i = 0; i < snake; i++) {
                System.out.print("*");
            }
        }
        if (badger < mushroom && badger < snake) {
            System.out.printf("badger: ");
            for (int i = 0; i < badger; i++) {
                System.out.print("*");
            }
        }
        if (mushroom < badger && mushroom < snake) {
            System.out.printf("\nmushroom: ");
            for (int i = 0; i < mushroom; i++) {
                System.out.print("*");
            }
        }
    }
}