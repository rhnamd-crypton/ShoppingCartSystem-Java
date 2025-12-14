package com.shoppingcart;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Cart cart = new Cart();

        Product p1 = new Product(1, "Laptop", 50000);
        Product p2 = new Product(2, "Phone", 20000);
        Product p3 = new Product(3, "Headphones", 2000);

        while (true) {
            System.out.println("\n1. Add Product");
            System.out.println("2. Remove Product");
            System.out.println("3. View Cart");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Available Products:");
                System.out.println("1. Laptop");
                System.out.println("2. Phone");
                System.out.println("3. Headphones");
                int pid = sc.nextInt();

                if (pid == 1) cart.addProduct(p1);
                else if (pid == 2) cart.addProduct(p2);
                else if (pid == 3) cart.addProduct(p3);
                else System.out.println("Invalid product.");

            } else if (choice == 2) {
                System.out.print("Enter product ID to remove: ");
                int id = sc.nextInt();
                cart.removeProduct(id);

            } else if (choice == 3) {
                cart.viewCart();

            } else if (choice == 4) {
                System.out.println("Thank you for shopping!");
                break;

            } else {
                System.out.println("Invalid choice.");
            }
        }

        sc.close();
    }
}
