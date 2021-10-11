package ex44;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Christina Persaud
 */

import java.util.Scanner;

class App {

    public enum products {
        Widget("25.00", "5"),
        Thing("15.00", "5"),
        Doodad("5.00", "10");

        private String price;
        private String quantity;

        products(String cost, String number) {
            price = cost;
            quantity = number;
        }

        public String getPrice() {
            return price;
        }

        public String getQuantity() {
            return quantity;
        }
    }


    public static void main(String[] args) {
        products items;
        boolean repeat = true;

        Scanner proName = new Scanner(System.in);
        System.out.print("What is the product name? ");
        String response1 = proName.nextLine();

        while (repeat) {
            try {
                items = products.valueOf(response1);
                System.out.printf("Name: "+ "%s\n" + "Price: " + "%s\n" + "Quantity: " + "%s\n", items, items.getPrice(), items.getQuantity());
                repeat=false;
            } catch (IllegalArgumentException e) {
                System.out.println("Sorry, that product was not found in our inventory.");
                System.out.print("What is the product name? ");
                response1= proName.nextLine();
            }
        }
    }
}