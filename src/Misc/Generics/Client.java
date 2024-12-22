package Misc.Generics;

import java.util.ArrayList;
import java.util.List;

class Client {
    public static void main(String[] args) {
        System.out.println("Without Generics");
        Pair pair = new Pair();
        pair.setFirst("first");
        pair.setSecond(300);

        System.out.println("\nFirst item: " + pair.getFirst());
        pair.setFirst(10);
        // No type safety

        System.out.println("\nModified first item: " + pair.getFirst());
        System.out.println("Second item: " + pair.getSecond());

        System.out.println("\n-----------------------------------------------\n");
        System.out.println("With Generics");
        GenericPair<String, Integer> genericPair = new GenericPair<>();
        genericPair.setFirst("first");
        genericPair.setSecond(20);

        System.out.println("\nFirst item: " + genericPair.getFirst());
//        genericPair.setFirst(10); -> Error: Added Type Safety

        genericPair.setFirst("FirstModded");
        System.out.println("\nModified item: " + genericPair.getFirst());
        System.out.println("Second item: " + genericPair.getSecond());

        System.out.println("\n-----------------------------------------------\n");

        Animal animal = new Animal("animal");
        Mammal mammal = new Mammal("mammal", 4);
        Dog dog = new Dog("dog", 4, 5);
        Cat cat = new Cat("cat", 4, 10);

        List<Animal> animals = new ArrayList<>();
        animals.add(animal);
        animals.add(mammal);
        animals.add(dog);
        animals.add(cat);

        AnimalUtility.getAnimalName(animals);

    }
}
