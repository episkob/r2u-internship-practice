package javaapplication;

/**
 * Represents a rectangle shape, extending the base Shape class.
 * Adds width (`a`) and height (`b`) dimensions to position and name.
 *
 * Author: Iaroslav Tsymbaliuk
 */
public class Rect extends Shape {

    // Width of the rectangle
    private int a;

    // Height of the rectangle
    private int b;

    /**
     * Constructs a rectangle with specified width, height, position and name.
     *
     * @param a width of the rectangle
     * @param b height of the rectangle
     * @param x x coordinate of the rectangle's position
     * @param y y coordinate of the rectangle's position
     * @param name name of the rectangle
     */
    public Rect(int a, int b, int x, int y, String name) {
        super(x, y, name);
        this.a = a;
        this.b = b;
    }

    /**
     * Returns a string representation including shape info plus width and height.
     *
     * @return formatted string like "name: x=..., y=..., a=..., b=..."
     */
    @Override
    public String toString() {
        return super.toString() + ", a=" + a + ", b = " + b;
    }
}

