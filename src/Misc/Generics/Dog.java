package Misc.Generics;

public class Dog extends Mammal{
    int age;

    public Dog(String name, int numLegs, int age) {
        super(name, numLegs);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
