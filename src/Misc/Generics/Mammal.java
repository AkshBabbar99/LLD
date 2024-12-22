package Misc.Generics;

public class Mammal extends Animal{
    int numLegs;

    public Mammal(String name, int numLegs) {
        super(name);
        this.numLegs = numLegs;
    }

    public int getNumLegs() {
        return numLegs;
    }

    public void setNumLegs(int numLegs) {
        this.numLegs = numLegs;
    }
}
