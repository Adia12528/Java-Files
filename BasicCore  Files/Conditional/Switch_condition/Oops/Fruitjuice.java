package Oops;

import java.util.Scanner;

public class Fruitjuice {
    int product_code;
    String flavour;
    String pack_type;
    int pack_size;
    int product_price;

    void input() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the product code: ");
            product_code = sc.nextInt();
            System.out.print("Enter the flavour: ");
            flavour = sc.next();
            System.out.print("Enter the product type: ");
            pack_type = sc.next();
            System.out.print("Enter the pack size: ");
            pack_size = sc.nextInt();
            System.out.print("Enter the product price: ");
            product_price = sc.nextInt();
        }
    }

    void discount() {
        product_price = product_price - 10;
    }

    void display() {
        System.out.println("The flavour of product_code: " + product_code);
        System.out.println("The flavour of flavour: " + flavour);
        System.out.println("The flavour of pack type: " + pack_type);
        System.out.println("The flavour of pack size: " + pack_size);
        System.out.println("The flavour of product prize: " + product_price);
    }

    public static void main(String[] args) {
        Fruitjuice juice = new Fruitjuice();
        juice.input();
        juice.discount();
        juice.display();
    }
}
