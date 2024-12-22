package Misc.Generics;

public class Cat extends Mammal{
    int age;

    public Cat(String name, int numLegs, int age) {
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
