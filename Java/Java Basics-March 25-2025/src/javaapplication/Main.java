package javaapplication; // Declares the package for the current class

/**
 * Demonstrates object instantiation and printing an object reference.
 *
 * Author: Iaroslav Tsymbaliuk
 */
public class Main {

    public static void main(String[] args) {

        // Create an instance of the Test class
        Test test = new Test();

        // Assign a value to the field 'x'
        test.x = 101;

        // Print the Test object directly.
        // Since Test does not override toString(), this will print the class name + hashcode.
        // Example output: javaapplication.Test@1b6d3586
        System.out.println(test);
    }
}

/**
 * A simple class with a single integer field 'x'.
 * Does not override toString(), so default Object.toString() behavior is used.
 */
class Test {

    int x; // Field to hold a numeric value
}
