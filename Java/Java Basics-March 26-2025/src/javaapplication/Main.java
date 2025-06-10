package javaapplication; // Declares the package for organizational structure

/**
 * Demonstrates the usage of the Point2D class:
 * - Object instantiation
 * - Setting coordinates
 * - Printing the point using overridden toString()
 *
 * Author: Iaroslav Tsymbaliuk
 */
public class Main {

    public static void main(String[] args) {

        // Create a new Point2D instance using the default constructor
        Point2D p1 = new Point2D();

        // Set X and Y coordinates using setter methods
        // Negative X is allowed — no input validation is enforced in Point2D
        p1.setX(-1);
        p1.setY(2);

        // Print the point. The toString() method formats output as "(x, y)"
        System.out.println(p1); // Expected output: (-1, 2)
    }
}
