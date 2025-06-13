package javaapplication; // Package declaration for grouping related classes

/**
 * Simple class encapsulating a single integer field `x`.
 * Demonstrates standard JavaBean pattern with constructor, getter, setter, and toString.
 *
 * Author: Iaroslav Tsymbaliuk
 */
public class Test {

    // Private field to store the value of x (encapsulation principle)
    private int x;

    /**
     * Constructor initializes x with the provided value.
     *
     * @param x The initial value to assign to the field.
     */
    public Test(int x) {
        this.x = x;
    }

    /**
     * Returns the current value of x.
     *
     * @return The value of x.
     */
    public int getX() {
        return x;
    }

    /**
     * Updates the value of x.
     *
     * @param x The new value to assign.
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Overrides the default toString method to provide a custom string representation.
     *
     * @return String in the format "x = value".
     */
    @Override
    public String toString() {
        return "x = " + x;
    }

}
