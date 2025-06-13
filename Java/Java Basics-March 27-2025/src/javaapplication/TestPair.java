package javaapplication; // Declares the package this class belongs to

/**
 * Extends the Test class by adding a second coordinate `y`.
 * Represents a simple 2D point or pair of integers.
 *
 * Author: Iaroslav Tsymbaliuk
 */
public class TestPair extends Test {

    // Private field to store the second coordinate (y)
    private int y;

    /**
     * Constructor initializes both x (via superclass) and y.
     *
     * @param x The x value, passed to the superclass constructor.
     * @param y The y value, assigned directly.
     */
    public TestPair(int x, int y) {
        super(x);       // Call the superclass constructor to set x
        this.y = y;     // Set y locally
    }

    /**
     * Getter for y value.
     *
     * @return Current value of y.
     */
    public int getY() {
        return y;
    }

    /**
     * Setter for y value.
     *
     * @param y New value to assign.
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * Overrides the toString method to include both x and y values.
     *
     * @return String representation in the format: "x = <x> y = <y>"
     */
    @Override
    public String toString() {
        // Call the superclass's toString() to get the x part
        return super.toString() + " y = " + y;
    }
}
