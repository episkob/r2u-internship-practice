package javaapplication; // Defines the package for this class

/**
 * Represents a point in 2D space with integer coordinates (x, y).
 * Provides standard getter and setter methods for encapsulated fields,
 * and overrides toString() for user-friendly output.
 *
 * Author: Iaroslav Tsymbaliuk
 */
public class Point2D {

    // Private fields representing the X and Y coordinates
    private int x, y;

    /**
     * Returns the X coordinate of the point.
     *
     * @return the current X value
     */
    public int getX() {
        return x;
    }

    /**
     * Sets the X coordinate of the point.
     *
     * @param x the value to assign to the X coordinate
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Returns the Y coordinate of the point.
     *
     * @return the current Y value
     */
    public int getY() {
        return y;
    }

    /**
     * Sets the Y coordinate of the point.
     *
     * @param y the value to assign to the Y coordinate
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * Returns a string representation of the point in the format "(x, y)".
     * Useful for debugging, logging, and user interfaces.
     *
     * @return a formatted string with X and Y values
     */
    @Override
    public String toString() {
        // Using StringBuilder for efficient string concatenation
        StringBuilder sb = new StringBuilder("(");
        sb.append(x);
        sb.append(", ");
        sb.append(y);
        sb.append(")");
        return sb.toString();
    }
}
