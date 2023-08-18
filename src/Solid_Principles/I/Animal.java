package Solid_Principles.I;

// Interface Segregation Principle (ISP)
// Clients should not be forced to depend on interfaces they do not use.
public interface Animal {

    void feed();
//    void groom();
}


interface Pet extends Animal{
    void groom();
}
class Dog implements
//        Animal
    Pet
{

    @Override
    public void feed() {

    }

    @Override
    public void groom() {

    }
}

class Tiger implements Animal{

    @Override
    public void feed() {

    }

//    @Override
//    public void groom() {
//        // Dummy implementation to keep compiler happy
//    }
}