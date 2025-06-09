package javaapplication; // Defines the package namespace. Should follow domain convention in real-world projects.

import java.util.Arrays; // Imports utility methods for array manipulation, including sorting and conversion to string.

/**
 * Demonstrates array sorting and output using built-in Java utilities.
 *
 * Author: Iaroslav Tsymbaliuk
 */
public class Main {
    public static void main(String[] args){

        // Initialize an integer array with unsorted elements.
        // In a real-world case, such arrays may come from user input, files, or APIs.
        int[] m = {3, 2, 4, 1, 5};

        /*
         * Sort the array in ascending order using the built-in Dual-Pivot Quicksort algorithm.
         * Arrays.sort() is highly optimized and provides good performance for primitive types.
         *
         * Note: This modifies the original array in-place. No new array is created.
         */
        Arrays.sort(m);

        /*
         * Convert the array to a human-readable string and print it.
         * Arrays.toString() returns a string like "[1, 2, 3, 4, 5]".
         * Useful for debugging, logging, or display.
         */
        System.out.println(Arrays.toString(m));
    }
}
