package Ecommerce;

import java.util.ArrayList;
import java.util.List;

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    public void display_name() {
    	System.out.println(name);
    }
    
    public void display_price() {
    	System.out.println(price);
    }
}

public class ShoppingCart {
    public static void main(String[] args) {
        List<Product> cart = new ArrayList<>();

        
        cart.add(new Product("Apple", 1.5));
        cart.add(new Product("Banana", 0.75));
        cart.add(new Product("Orange", 1.25));

        double total = 0;
        for (Product p : cart) {
            System.out.println(p.name + " - $" + p.price);
            total += p.price;
        }

        System.out.println("Total Price: $" + total);
    }
}
