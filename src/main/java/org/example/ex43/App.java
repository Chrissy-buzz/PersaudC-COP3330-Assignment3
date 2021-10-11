package ex43;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Christina Persaud
 */

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;


class App {

    public static String createFile(String webN, String auth) {
        try {
            File myObj = new File(webN);
            File myObj2 = new File(webN, webN + ".html");
            if (myObj.mkdir() && myObj2.createNewFile()) {
                FileWriter myObj3 = new FileWriter(myObj2);
                myObj3.write("<title>" + webN + "</title>");
                myObj3.write("<meta name= " + auth + ">");
                myObj3.close();
                return "Created " + "/website/" + webN + "\n" + "Created " + "/website/" + webN + "/index.html" + "\n";
            } else {
                return "File already exists.";
            }
        } catch (Exception e) {
            return "An error occurred.";
        }
    }

   public static String createJava (String web) {
       try {
           File myObj4 = new File(web, "/js/");
           if (myObj4.mkdir()) {
               return null;
           } else {
               return "File already exists.";
           }
       } catch (Exception e) {
           return "An error occurred.";
       }
   }

    public static String createCSS (String web2) {
        try {
            File myObj5 = new File(web2, "/css/");
            if (myObj5.mkdir()) {
                return null;
            } else {
                return "File already exists.";
            }
        } catch (Exception e) {
            return "An error occurred.";
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Site name: ");
        String webName = scan.nextLine();
        System.out.print("Author name: ");
        String authName = scan.nextLine();

        System.out.print("Do you want a folder for JavaScript? ");
        String response1 = scan.nextLine();

        System.out.print("Do you want a folder for CSS? ");
        String response2 = scan.nextLine();

        System.out.print(createFile(webName, authName));

        if(response1.equals("y")){
            createJava(webName);
            System.out.print("Created " + "/website/" + webName + "/js/" + "\n");
        }
        if(response2.equals("y")){
            createCSS(webName);
            System.out.print("Created " + "/website/" + webName + "/css/" + "\n");
        }
    }
}