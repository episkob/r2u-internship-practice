package javaapplication; // Defines the namespace for this class. In real projects, use meaningful package names like com.company.module.

/**
 * Main entry point for the application.
 *
 * This class contains the main method used by the JVM to launch the program.
 * In production systems, this would typically delegate to other services or frameworks.
 *
 * Author: Iaroslav Tsymbaliuk
 */
public class Main {

    /**
     * Standard entry point for a Java application.
     * The method signature is required by the JVM. Do not rename or remove modifiers.
     *
     * @param args Command-line arguments. Rarely used in simple programs, but often useful for configuration or input.
     */
    public static void main(String[] args){

        // Declare an integer variable and initialize it with a literal value.
        // In real-world scenarios, this value would come from user input, a config file, or business logic.
        int a = 10;

        /*
         * Using System.out.printf instead of println for formatted output.
         *
         * - "%d" is a format specifier that represents a decimal integer.
         * - "\n" adds a newline after each line — cleaner and portable line breaks.
         * - This is preferred over string concatenation (e.g., "a = " + a) for clarity and performance in complex outputs.
         *
         * printf makes it easy to scale output: if tomorrow we have 5 variables or want to align text into columns,
         * we won't need to rewrite logic — we just add format specifiers.
         */
        System.out.printf("Hello World!\na = %d\n", a);
    }
}
