package javaapplication; // Defines the package this class belongs to

/**
 * Demonstrates instantiation and usage of Test and TestPair objects.
 *
 * Author: Iaroslav Tsymbaliuk
 */
public class Main {
    public static void main(String[] args) {

        // Create a Test object with x = 10
        Test t1 = new Test(10);

        // Print the object using its overridden toString() method
        System.out.println(t1); // Output: x = 10

        // Create a TestPair object with x = -3, y = 4
        TestPair t2 = new TestPair(-3, 4);

        // Print the TestPair object using its overridden toString() method
        System.out.println(t2); // Output: x = -3 y = 4
    }
}
