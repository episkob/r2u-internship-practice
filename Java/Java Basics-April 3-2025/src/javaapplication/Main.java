package javaapplication;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        // Creates a File object representing "test.txt" in the current working directory.
        // Note: This does not create the actual file on disk yet.
        File file = new File("test.txt");

        try {
            // Attempts to create the file on the filesystem.
            // If the file already exists, createNewFile() returns false.
            file.createNewFile();
        } catch (IOException ex) {
            // Handles any I/O exception (e.g., permission denied, invalid path).
            // Prints the exception message to standard output.
            System.out.println(ex.getMessage());

            // Exits early in case of failure to prevent further execution.
            return;
        }

    }
}
