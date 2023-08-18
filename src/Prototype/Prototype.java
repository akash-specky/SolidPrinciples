package Prototype;

// The Prototype pattern is a creational design pattern that allows you
// to create new objects by copying an existing object


public interface Prototype {
    Prototype clone();
}

class Car implements Prototype{
   private int value;

    public Car(int value) {
        this.value = value;
    }


    public Prototype clone() {
        return new Car(this.value);
    }
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public static void main(String[] args) {
        Car prototype = new Car(10);

        // Clone the prototype
        Car clone1 = (Car) prototype.clone();
        clone1.setValue(20);

        // Clone again
        Car clone2 = (Car) prototype.clone();
//        clone2.setValue(30);

        System.out.println("Original prototype value: " + prototype.getValue());
        System.out.println("Clone 1 value: " + clone1.getValue());
        System.out.println("Clone 2 value: " + clone2.getValue());
    }
}
