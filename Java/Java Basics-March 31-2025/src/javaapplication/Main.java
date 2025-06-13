package javaapplication;

/**
 * Main class demonstrating usage of Shape subclasses Rect and Circle.
 * Creates instances of Rect and Circle with given dimensions and positions,
 * prints their string representations, and calculates areas.
 *
 * Also demonstrates:
 * - Polymorphism using a Shape array
 * - Runtime type identification with instanceof
 * - Explicit casting to access subclass-specific methods
 *
 * Author: Iaroslav Tsymbaliuk
 */
public class Main {

    public static void main(String[] args) {
        // Create a rectangle with width=2, height=3, position (-3, 2), and name "Rectangle-0"
        final Shape[] shapes = getShapes ();

        // Iterate over the shapes array and print each shape
        // Demonstrates polymorphic behavior of toString()
        for (Shape shape : shapes) {
            System.out.println(shape);
        }

        printAreas(shapes);

        // Alternative loop to print areas (commented)
//        for (Shape shape : shapes) {
//            System.out.println(shape.area());
//        }

    }

    private static Shape[] getShapes () {
        Rect r1 = new Rect(2, 3, -3, 2, "Rectangle-0");

        // Create a circle with radius=10, position (2, -1), and name "Circle-0"
        Circle c1 = new Circle(10, 2, -1, "Circle-0");

        // Print the rectangle's info
//        System.out.println(r1);

        // Print the circle's info
//        System.out.println(c1);

        // Create an array of Shape references holding different shape instances
        Shape[] shapes = {
                r1, c1, new Rect(1, 2, 3, 4, "Rect-1")
        };
        return shapes;
    }

    /**
     * Iterates over an array of Shape objects and prints the area of each.
     * Uses instanceof to determine the actual subclass type and casts accordingly.
     *
     * @param shapes an array of Shape objects (Rect or Circle instances)
     */
    private static void printAreas(Shape[] shapes) {
        for (Shape shape : shapes) {
            if (shape instanceof Rect)
                System.out.println(((Rect) shape).area());
            else if (shape instanceof Circle)
                System.out.println(((Circle) shape).area());
        }
    }

}
