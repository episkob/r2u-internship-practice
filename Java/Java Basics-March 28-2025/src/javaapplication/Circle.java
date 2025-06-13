package javaapplication;

/**
 * Represents a circle shape, extending the base Shape class.
 * Adds a radius (`r`) field to the position and name.
 *
 * Author: Iaroslav Tsymbaliuk
 */
public class Circle extends Shape {

    // Radius of the circle
    private int r;

    /**
     * Constructs a Circle with specified radius, position, and name.
     *
     * @param r radius of the circle
     * @param x x coordinate of the circle's position
     * @param y y coordinate of the circle's position
     * @param name name of the circle
     */
    public Circle(int r, int x, int y, String name) {
        super(x, y, name);
        this.r = r;
    }

    /**
     * Returns string representation including shape info plus radius.
     *
     * @return formatted string like "name: x=..., y=..., r=..."
     */
    @Override
    public String toString() {
        return super.toString() + ", r = " + r;
    }

}

