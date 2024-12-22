package Misc.Generics;

import java.util.*;

public class AnimalUtility {

    //This would not work because the method is expecting a List of Animal objects
    // whereas the List passed in could be a List of Mammal objects even though
    // Mammal is a subclass of Animal and the method should be able to handle it,
    // still it would not work because of the type mismatch.
    // Thus we use Generics to make the method more flexible


//    public static void getAnimalName(List<Animal> animals) {
//        for(Animal animal : animals){
//            System.out.println(animal.getName());
//        }
//    }

    // By doing this we are making the method more flexible and it can now
    // accept a List of any subclass of Animal
    //These are bounds and we are saying that T should be a subclass of Animal
    public static <T extends Animal> void getAnimalName(List<T> animals) {
        for(T animal : animals){
            System.out.println(animal.getName());
        }
    }

    // These are wildcards and can be used to represent any subclass of Animal
    // This method can accept a List of any subclass of Animal
    public static void printAnimal(List<? extends Animal> animals) {
        for(Animal animal : animals){
            System.out.println(animal.getName());
        }
    }
}
