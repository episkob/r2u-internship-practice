package javaapplication; // Declares package to group related classes

/**
 * Represents a point in 2D Cartesian coordinate space.
 * Each point has integer coordinates (x, y), a calculated length from the origin,
 * a unique point ID, and static counter tracking total instances.
 *
 * Author: Iaroslav Tsymbaliuk
 */
public class Point2D {

    // Instance fields for X and Y coordinates
    private int x, y;

    // Length (magnitude) of the vector from the origin to this point
    private double length;

    // Static field tracking total number of created Point2D instances
    private static int pointsCounter;

    // Unique ID for each point, assigned at creation time
    private final int pointID;

    // Static initialization block runs once when the class is first loaded
    static {
        System.out.println("Static block!"); // Used for debugging/class load tracking
    }

    /**
     * Default constructor. Initializes point at origin (0, 0).
     */
    public Point2D() {
        this(0, 0); // Delegate to parameterized constructor
    }

    /**
     * Constructor with coordinate parameters.
     *
     * @param x initial X coordinate
     * @param y initial Y coordinate
     */
    public Point2D(int x, int y) {
        setX(x); // Setter updates both value and length
        setY(y);
        pointID = pointsCounter++; // Assign unique ID and increment global counter
    }

    /**
     * @return the current X coordinate
     */
    public int getX() {
        return x;
    }

    /**
     * Sets X coordinate and recalculates the vector length.
     *
     * @param x new X value
     */
    public final void setX(int x) {
        this.x = x;
        length(); // Update magnitude
    }

    /**
     * @return the current Y coordinate
     */
    public int getY() {
        return y;
    }

    /**
     * Sets Y coordinate and recalculates the vector length.
     *
     * @param y new Y value
     */
    public final void setY(int y) {
        this.y = y;
        length(); // Update magnitude
    }

    /**
     * @return precomputed length of the vector from origin to this point
     */
    public double getLength() {
        return length;
    }

    /**
     * Calculates Euclidean distance to another Point2D instance.
     *
     * @param rValue another point
     * @return the distance as a double
     */
    public double distanceTo(Point2D rValue) {
        return Math.sqrt(
                (this.x - rValue.x) * (this.x - rValue.x) +
                        (this.y - rValue.y) * (this.y - rValue.y)
        );
    }

    /**
     * Recalculates the length of the vector from origin to this point.
     * Called internally by setters.
     */
    private void length() {
        length = Math.sqrt(x * x + y * y);
    }

    /**
     * @return the unique ID of this point instance
     */
    public int getID() {
        return pointID;
    }

    /**
     * @return the number of Point2D instances created so far
     */
    public static int getPointsCounter() {
        return pointsCounter;
    }

    /**
     * Provides a string representation of the point in (x, y) format.
     *
     * @return formatted coordinate string
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(x);
        sb.append(", ");
        sb.append(y);
        sb.append(")");
        return sb.toString();
    }
}
