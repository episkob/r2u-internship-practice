package javaapplication; // Defines the package namespace for this class. Used to group related classes.

/**
 * Main class of the application.
 * Acts as the entry point when the program is executed.
 *
 * Typically used to initialize and launch the core logic or delegate to a framework.
 *
 * Author: Iaroslav Tsymbaliuk
 */
public class Main {

    /**
     * Entry point of any standalone Java application.
     * The JVM looks for this method to begin execution.
     *
     * @param args Command-line arguments passed to the application.
     */
    public static void main(String[] args){

        // Prints "Hello World!" to the console.
        // printf is used instead of println to allow for formatted output in the future.
        // For now, it's functionally identical, but makes it easy to introduce variables later.
        System.out.printf("Hello World!");

    }
}
