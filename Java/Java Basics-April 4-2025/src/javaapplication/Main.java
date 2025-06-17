package javaapplication;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        // Creates a File object representing "test.txt" in the current working directory.
        // Note: This does not immediately create the file on disk.
        File file = new File("test.txt");

        try {
            // Attempts to create a new file on disk.
            // Returns true if file was created, false if it already existed.
            file.createNewFile();
        } catch (IOException ex) {
            // Handles I/O errors (e.g., access denied, disk full, etc.).
            System.out.println(ex.getMessage());
            return;
        }

        // Creates a File object representing the current directory.
        File dir = new File(".");

        // Lists only regular files (not directories, symbolic links, etc.) in current directory.
        // Uses an anonymous class implementing FileFilter for filtering logic.
        File[] files = dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File currentFile) {
                // Accept the file only if it is a regular file.
                return currentFile.isFile();
            }
        });

        // Iterates over the filtered list and prints the name of each file.
        // Useful for debugging and checking file creation in the current context.
        for (File f : files) {
            System.out.println(f.getName());
        }
    }
}
