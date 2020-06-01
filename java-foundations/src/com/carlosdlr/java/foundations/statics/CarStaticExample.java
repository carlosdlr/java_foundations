package com.carlosdlr.java.foundations.statics;

/**
 * Static variables are created and initialized not when an object is instantiated but when the class is first loaded
 * into the JVM by the class loader, this is because the variable is associated with class not with an single instance
 * of the object.
 * the class object contains all of the details about the object type.
 * Static methods, the keyword static can also be applied to a method. A static method, like a variable, is associated
 * with the class, not the objects(instances)
 * To access a static method you need to call directly the class e.g CarStaticExample.resetCarCount();
 * Static methods don't have access to the object data
 * Static methods have 2 purposes
 * 1. They are used to access class variable data
 *    Although this can be done with and instance variable of the class, it is considered more appropriate to use class methods
 * 2. Static methods provide functionality without the need for an instance/object
 *    For example mathematical formulas are great reasons to have static methods
 *    (we don't need to store state just calculate and return a value)
 */
public class CarStaticExample {

    String color;
    String type;
    static int carCount;
    int serialNumber;

    /**
     * default constructor
     */
    CarStaticExample() {
        carCount++;
        serialNumber = carCount;
    }

    CarStaticExample(String c, String t) {
        color = c;
        type = t;
        carCount++;
        serialNumber = carCount;
    }

    static void resetCarCount() {
        carCount = 0;
    }

    public static void main(String args []) {
        CarStaticExample car1, car2, car3; // create 3 object references
        car1 = new CarStaticExample("Red", "Sedan");
        car2 = new CarStaticExample("Blue", "Station Wagon");
        car3 = new CarStaticExample("White", "Coupe");
    }
}
