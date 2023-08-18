package Solid_Principles.L;


// Liskov Substitution Principle (LSP)
// Objects of a superclass should be replaceable with objects of its subclasses without affecting the correctness of the program.
public class Bird {
    public void fly() {

    }
}

class Sparrow extends Bird {


}

class Ostrich extends Bird {
    public void fly() {
        throw new UnsupportedOperationException("Ostriches can't fly");
    }
}
