package Factory_DesignPattern;

import phone.Android;
import phone.IOS;
import phone.OS;
import phone.Windows;

// The Factory Design Pattern is a creational design pattern that provides an
// interface for creating objects in a super class, but allows subclasses to
// alter the type of objects that will be created
public class FactoryMain {
    public static void main(String[] args) {
        OS os = new Android();
        OS os1 = new Windows();
        OS os2 = new IOS();
        os.spec();
        os1.spec();
        os2.spec();
    }
}
