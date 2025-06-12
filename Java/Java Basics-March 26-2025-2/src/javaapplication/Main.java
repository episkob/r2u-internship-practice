package javaapplication; // Defines the package namespace for grouping related classes

/**
 * Demonstrates usage of the Point2D class.
 * Creates points, manipulates coordinates, calculates distance, and prints metadata.
 *
 * Author: Iaroslav Tsymbaliuk
 */
public class Main {

    public static void main(String[] args) {

        // Print current number of created Point2D instances (should be 0 at start)
        System.out.println("Total points: " + Point2D.getPointsCounter());

        // Create a new point at origin and set coordinates manually
        Point2D p1 = new Point2D();
        p1.setX(1);
        p1.setY(1);

        // Output the point's ID, coordinates, and calculated length
        System.out.println(p1.getID() + ": " + p1 + " length = " + p1.getLength());

        // Create a second point directly with the constructor
        Point2D p2 = new Point2D(3, 4);
        System.out.println(p2.getID() + ": " + p2 + " length = " + p2.getLength());

        // Display updated total number of Point2D instances
        System.out.println("Total points: " + Point2D.getPointsCounter());

        // Calculate and print the Euclidean distance between two points
        System.out.println("Distance between = " + p1.distanceTo(p2));

        // Force class loading if needed (optional, typically for reflection or static init debugging)
        // Class.forName("javaapplication.Point2D");
    }
}
