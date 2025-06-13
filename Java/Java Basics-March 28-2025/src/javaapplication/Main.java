package javaapplication;

/**
 * Main class demonstrating usage of Shape subclasses Rect and Circle.
 * Creates instances of Rect and Circle with given dimensions and positions,
 * then prints their string representations to the console.
 *
 * Author: Iaroslav Tsymbaliuk
 */
public class Main {

    public static void main(String[] args) {
        // Create a rectangle with width=2, height=3, position (-3, 2) and name "Rectangle-0"
        Rect r1 = new Rect(2, 3, -3, 2, "Rectangle-0");

        // Create a circle with radius=10, position (2, -1) and name "Circle-0"
        Circle c1 = new Circle(10, 2, -1, "Circle-0");

        // Print the rectangle's info
        System.out.println(r1);

        // Print the circle's info
        System.out.println(c1);
    }
}

