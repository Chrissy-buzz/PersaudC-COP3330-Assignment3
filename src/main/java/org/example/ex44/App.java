package ex44;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Christina Persaud
 */

import java.util.Scanner;

class App {

    public enum products { //Create Enum
        //Thing Price Quantity
        Widget("25.00", "5"),
        Thing("15.00", "5"),
        Doodad("5.00", "10");

        private String price;
        private String quantity;

        products(String cost, String number) { //initialize constructor
            price = cost;
            quantity = number;
        }

        public String getPrice() {
            return price;
        } //Get Price

        public String getQuantity() {
            return quantity;
        } //Get Quantity
    }


    public static void main(String[] args) {
        products items; //enum Thing
        boolean repeat = true;

        //Scan user input
        Scanner proName = new Scanner(System.in);
        System.out.print("What is the product name? ");
        String response1 = proName.nextLine();

        while (repeat) { //while user does not enter valid input
            try {
                items = products.valueOf(response1); //Obtain info on Thing and print
                System.out.printf("Name: "+ "%s\n" + "Price: " + "%s\n" + "Quantity: " + "%s\n", items, items.getPrice(), items.getQuantity());
                repeat=false;
            } catch (IllegalArgumentException e) { //If Thing not found repeat
                System.out.println("Sorry, that product was not found in our inventory.");
                System.out.print("What is the product name? ");
                response1= proName.nextLine();
            }
        }
    }
}