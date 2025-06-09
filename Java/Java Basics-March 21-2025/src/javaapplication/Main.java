package javaapplication; // Package declaration. Used for logical class grouping.

/**
 * Demonstrates the use of varargs and method overloading for integer summation.
 * Shows how varargs can replace multiple overloaded methods.
 *
 * Author: Iaroslav Tsymbaliuk
 */
public class Main {
    public static void main(String[] args){

        int a, b;

        // Calls sum(int... x) with 2 arguments
        a = sum(1, 2);

        // Calls sum(int... x) with 3 arguments: a, 1, 2
        b = sum(a, 1, 2);

        // Outputs result to the console
        System.out.println("a = " + a + ", b = " + b);
    }

    /**
     * Sums an arbitrary number of integers using Java varargs.
     *
     * @param x one or more integers to sum. Internally treated as int[].
     * @return the total sum of the arguments.
     */
    private static int sum(int... x) {
        int s = 0; // Accumulator for the sum
        // int s = 0, i; // Alternative declaration with index (commented for comparison)

        // Traditional for-loop example (commented):
        // for (i = 0; i < x.length; i++) {
        //     s += x[i];
        // }

        // Enhanced for-loop — modern, cleaner alternative
        for (int xi : x) s += xi;

        return s;
    }

    /*
     * These are example overloads that varargs can replace.
     * Left here for comparison and educational purposes.
     */

    /**
     * Sums exactly two integers.
     * Replaced by sum(int... x).
     */
//    private static int sum(int a, int b) {
//        return a + b;
//    }

    /**
     * Sums exactly three integers.
     * Could be customized to do more than just sum.
     * For example, see the commented variations inside.
     */
//    private static int sum(int a, int b, int c) {
//        return a + b + c;
//        // return a + b * c;
//        // return a - c;
//        // return a / c;
//    }
}
