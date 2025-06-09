package javaapplication; // Defines the namespace for the class

/**
 * Demonstrates efficient string construction using StringBuilder.
 * Preferred over string concatenation when building strings dynamically.
 *
 * Author: Iaroslav Tsymbaliuk
 */
public class Main {
    public static void main(String[] args){

        // StringBuilder is a mutable sequence of characters — more efficient than using immutable Strings in concatenation
        StringBuilder sb = new StringBuilder();

        // Append multiple components to build the full string
        sb.append("Hello");   // Appends the word "Hello"
        sb.append(' ');       // Appends a space character
        sb.append("World");   // Appends the word "World"
        sb.append('!');       // Appends an exclamation mark

        // Output the constructed string
        // Note: println(sb) would implicitly call sb.toString(), but explicit is better than implicit
//        System.out.println(sb);            // This works too, because println calls toString() implicitly
        System.out.println(sb.toString());  // Explicitly converts StringBuilder to String and prints it
    }
}