package com.shoppingcart;

import java.util.ArrayList;

public class Cart {
    ArrayList<Product> cartItems = new ArrayList<>();

    void addProduct(Product product) {
        cartItems.add(product);
        System.out.println(product.name + " added to cart.");
    }

    void removeProduct(int id) {
        for (int i = 0; i < cartItems.size(); i++) {
            if (cartItems.get(i).id == id) {
                System.out.println(cartItems.get(i).name + " removed from cart.");
                cartItems.remove(i);
                return;
            }
        }
        System.out.println("Product not found in cart.");
    }

    void viewCart() {
        if (cartItems.isEmpty()) {
            System.out.println("Cart is empty.");
            return;
        }

        double total = 0;
        for (Product p : cartItems) {
            System.out.println(p.id + " - " + p.name + " : ₹" + p.price);
            total += p.price;
        }
        System.out.println("Total Amount: ₹" + total);
    }
}