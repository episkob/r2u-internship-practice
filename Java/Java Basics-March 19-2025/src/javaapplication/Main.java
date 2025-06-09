package javaapplication; // Package declaration. In production, should follow domain-based naming (e.g., com.company.module).

/**
 * Entry point of the application.
 * Demonstrates arithmetic operations, type casting, floating-point behavior, and comparisons.
 *
 * Author: Iaroslav Tsymbaliuk
 */
public class Main {
    public static void main (String[] args) {

        // Declare and initialize an integer variable
        int a = 5;

        // Post-increment: increases a by 1. a becomes 6.
        a++;
        System.out.println("a = " + a); // Output: a = 6

        // Add a to itself. Equivalent to: a = a * 2.
        a = a + a;
        System.out.println("a = " + a); // Output: a = 12

        // Declare a float. The literal .5 is implicitly double, so we cast it to float.
        float b = (float) .5; // Could also be written as 0.5f for clarity.

        // Division by zero using float — DOES NOT throw an exception.
        // Instead, Java returns positive infinity (Infinity) per IEEE 754 standard.
        b = 1.f / 0;
        System.out.println("b = " + b); // Output: b = Infinity

        // Comparison: checks if integer a (12) is less than float b (Infinity).
        // Will print "Ok" because any finite number is less than positive infinity.
        if (a < b) System.out.println("Ok");

        // 10e+20 is treated as a double literal. It is implicitly cast to float during comparison.
        // Note: float has limited precision, so this comparison may be lossy or inaccurate in other cases.
        if (10e+20 < b) System.out.println("Ok"); // Still true, Infinity > any finite float
    }
}
