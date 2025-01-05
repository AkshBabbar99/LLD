package GenericsLab;

import java.util.*;

class Client {

    public static void main(String[] args) {
        Electronics laptop = new Electronics("E1", "Laptop", 999.99, 5, 24);
        Electronics smartphone = new Electronics("E2", "Smartphone", 499.99, 10, 12);
        Electronics tablet = new Electronics("E3", "Tablet", 299.99, 15, 12);

        Clothing tshirt = new Clothing("C1", "T-Shirt", 19.99, 20, "M");
        Clothing jeans = new Clothing("C2", "Jeans", 39.99, 15, "32");
        Clothing jacket = new Clothing("C3", "Jacket", 59.99, 10, "L");

        Book novel = new Book("B1", "Novel", 14.99, 25, "John Doe");
        Book biography = new Book("B2", "Biography", 19.99, 20, "Jane Doe");
        Book cookbook = new Book("B3", "Cookbook", 24.99, 15, "Alice Doe");

        Inventory<Electronics> inventory = new Inventory<>();
        inventory.addItem(laptop);
        inventory.addItem(smartphone);
        inventory.addItem(tablet);


    }
}
