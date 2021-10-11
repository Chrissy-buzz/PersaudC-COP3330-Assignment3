package ex46;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Christina Persaud
 */

import java.io.*;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

class App {
    static int modifyFile(String word) {
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\Christina\\OneDrive\\Desktop\\exercise46_input.txt");
            BufferedReader in = new BufferedReader(new InputStreamReader(fis));

            String readLine = "";

            int count = 0;
            while ((readLine = in.readLine()) != null) {
                String[] words = readLine.split(" ");
                for (String s : words) {
                    if (s.equals(word)) count++;
                }
            }
            return count;
        } catch (IOException e) {

        }
        return 0;
    }

    public static void main(String[] args) {
        int badger = modifyFile("badger");
        int mushroom = modifyFile("mushroom");
        int snake = modifyFile("snake");

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