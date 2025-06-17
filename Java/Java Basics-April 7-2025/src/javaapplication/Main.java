package javaapplication;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        // Invokes method to write "Hello World!" to a text file named "hello.txt".
        writeHelloToFile("hello.txt");
    }

    /**
     * Writes the string "Hello World!" to the specified file.
     * If the file already exists, its contents will be overwritten.
     *
     * @param fileName The name (or path) of the file to write to.
     */
    private static void writeHelloToFile(String fileName) {

        // Try-with-resources ensures FileWriter is closed automatically,
        // even if an exception is thrown.
        try (FileWriter writer = new FileWriter(fileName)) {

            // Writes a single line to the file.
            writer.write("Hello World!");

        } catch (IOException ex) {
            // Catches and logs any I/O errors (e.g., permission issues, disk full).
            System.out.println(ex.getMessage());
        }
    }
}
