package GenericsLab;

import java.util.*;
import java.util.stream.Collectors;

class Client {

    public static void main(String[] args) {
        Electronics laptop = new Electronics("E1", "Laptop", 999.99, 5, 24);
        Electronics smartphone = new Electronics("E2", "Smartphone", 499.99, 10, 12);
        Electronics tablet = new Electronics("E3", "Tablet", 299.99, 15, 12);

        Clothing tshirt = new Clothing("C1", "T-Shirt", 119.99, 20, "M");
        Clothing jeans = new Clothing("C2", "Jeans", 39.99, 15, "32");
        Clothing jacket = new Clothing("C3", "Jacket", 59.99, 10, "L");

        Book novel = new Book("B1", "Novel", 141.99, 25, "John Doe");
        Book biography = new Book("B2", "Biography", 19.99, 20, "Jane Doe");
        Book cookbook = new Book("B3", "Cookbook", 214.99, 15, "Alice Doe");

        Inventory<Item> inventory = new Inventory<>();
        inventory.addItem(laptop);
        inventory.addItem(smartphone);
        inventory.addItem(tablet);
        inventory.addItem(tshirt);
        inventory.addItem(jeans);
        inventory.addItem(jacket);
        inventory.addItem(novel);
        inventory.addItem(biography);
        inventory.addItem(cookbook);

        List<Item> itemsList = inventory.getAllItems();

        itemsList.stream()
                .map(Item::getId)
                .forEach(System.out::println);

        List<Item> itemsList2 = inventory.getAllItems();
        List<String> lowerNames = itemsList2.stream()
                .map(item -> item.getName().toLowerCase())
                .toList();

        System.out.println(lowerNames);

        List<Item> itemsList3 = inventory.getAllItems();
        List<Integer> charCount = itemsList3.stream()
                .map(item -> item.getName().length())
                .sorted()
                .toList();

        System.out.println(charCount);

        List<Item> itemsList4 = inventory.getAllItems();
        itemsList4.stream()
                .filter(item -> item.getPrice() > 100)
                .forEach(System.out::println);

        List<Item> itemsList5 = inventory.getAllItems();
        boolean quantity0 = itemsList5.stream()
                .anyMatch(item -> item.getQuantity() == 0);
        System.out.println(quantity0);

        List<Item> itemsList6 = inventory.getAllItems();
        boolean priceGreater = itemsList6.stream()
                .allMatch(item -> item.getPrice() > 0);
        System.out.println(priceGreater);

        List<Item> itemsList7 = inventory.getAllItems();
        boolean negativeQuantity = itemsList7.stream()
                .noneMatch(item -> item.getQuantity() < 0);
        System.out.println(negativeQuantity);

        List<Item> itemsList8 = inventory.getAllItems();
        List<String> result = itemsList8.stream()
                .filter(item -> item.getPrice() > 100 && item.getQuantity() > 0)
                .map(Item::getName)
                .distinct()
                .sorted()
                .limit(5)
                .collect(Collectors.toList());
        System.out.println(result);

        List<Item> itemsList9 = inventory.getAllItems();
        int totalQuantity = itemsList9.stream()
                        .map(Item::getQuantity)
                        .reduce(0, Integer::sum);
        System.out.println(totalQuantity);

        Item mostExpensive = itemsList9.stream()
                .reduce((item1, item2) -> item1.getPrice() > item2.getPrice() ? item1 : item2)
                .orElse(null);
        System.out.println(mostExpensive);

        Optional<String> commaSeparatedNames = itemsList9.stream()
                .map(Item::getName)
                        .reduce((str, name) -> {
                            if(!str.isEmpty()){
                                return str + ", " + name;
                            } else {
                                return name;
                            }
                        });
        System.out.println(commaSeparatedNames.get());

    }
}
