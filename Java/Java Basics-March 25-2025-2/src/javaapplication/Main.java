package javaapplication; // Defines the package for class organization

/**
 * Demonstrates encapsulation in Java using private fields
 * and public getter/setter methods with validation logic.
 *
 * Author: Iaroslav Tsymbaliuk
 */
public class Main {

    public static void main(String[] args) {

        // Create an instance of the Test class
        Test test = new Test();

        // Attempt to set a negative value to x
        // Internal logic ensures that x remains non-negative
        test.setX(-101);

        // Retrieve the sanitized value of x and print it
        System.out.println(test.getX()); // Output: 101
    }
}

/**
 * A simple class with encapsulated field 'x'.
 * Provides getter and setter with basic input validation.
 */
class Test {

    // Field is private to enforce encapsulation
    private int x;

    /**
     * Setter method for x with validation.
     * Ensures that negative input is converted to positive.
     *
     * @param x input value to assign to the field
     */
    public void setX(int x) {
        if (x < 0) x = -x;   // Normalize negative input to positive
        this.x = x;          // Assign the validated value to the instance variable
    }

    /**
     * Getter method for x.
     *
     * @return the current value of the field x
     */
    public int getX() {
        return x;
    }
}
