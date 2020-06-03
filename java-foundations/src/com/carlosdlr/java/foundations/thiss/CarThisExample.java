package com.carlosdlr.java.foundations.thiss;

/**
 * When we call a method on the stack a new frame is created and that will contains all the variables that were
 * declared in the method (local variables)
 *
 * this reserved word tells to the frame go and find the variable or method directly in the object
 * in the heap (instance variable), avoids and unnecessary search inside the frame.
 * Also helps to remove ambiguity when instance variables and local variables when has the same name
 * and allows to the developer tell to the compiler to which instance variable is referring to when has the same name,
 * this is known as hiding
 */
public class CarThisExample {

    String color;
    String type;
    double serialNumber;

    // these blocks area called before the constructors
    {
        this.color = "Red";
        this.type = "Celica";
    }

    String getDescription() {
        String desc = "This is a " + this.color + " " + this.type;
        return desc;
    }

    CarThisExample() {
        this.serialNumber = Math.random();
    }

    //avoid ambiguity in constructors variable names
    CarThisExample(String color, String type) {
        this(); // chaining constructors using this and parenthesis to refer to the no args constructor
               // if you refer to a constructor inside another one always needs to be invoked in the first line
               // you cannot invoke constructors from other methods that are not constructors
        this.color = color;
        this.type = type;
    }

    //customize frame has 2 local variables color and newType
    void customize(String color, String type) {
        this.color = color;
        this.type = type + " "+ this.type;
        System.out.println(this.getDescription());
    }
}
