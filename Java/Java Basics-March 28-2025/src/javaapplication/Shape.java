package javaapplication;

/**
 * Represents a basic geometric shape with position coordinates and a name.
 * Encapsulates x and y coordinates and a shape name.
 *
 * Author: Iaroslav Tsymbaliuk
 */
public class Shape {

    // X coordinate of the shape's position
    private int x;

    // Y coordinate of the shape's position
    private int y;

    // Name of the shape (default access modifier)
    String name;

    /**
     * Constructs a Shape instance with specified coordinates and name.
     *
     * @param x the x coordinate
     * @param y the y coordinate
     * @param name the name of the shape
     */
    public Shape(int x, int y, String name) {
        this.x = x;
        this.y = y;
        this.name = name;
    }

    /**
     * Returns string representation of the shape in format:
     * "name: x =<x>, y = <y>"
     *
     * @return formatted string representing the shape
     */
    @Override
    public String toString() {
        return name + ": x =" + x + ", y = " + y;
    }
}

