package javaapplication;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {

    public static void main(String[] args){

        // Calls a helper method to write "Hello World!" into a file named "hello.txt".
        // Simple example of file output; content will be overwritten if file exists.
        writeHelloToFile("hello.txt");

        try {
            // Reads the first line from "string.txt" and prints it to stdout.
            // A basic file read example with proper exception handling.
            String str = readFromFile ("string.txt");
            System.out.println (str);
        } catch ( IOException ex ) {
            // Outputs the exception message; minimalistic error handling.
            // For production-grade code, consider using a proper logging framework.
            System.out.println (ex.getMessage ());
        }

    }

    /**
     * Writes the string "Hello World!" to the specified file.
     * If the file already exists, its contents will be overwritten.
     *
     * @param fileName The name (or path) of the file to write to.
     */
    private static void writeHelloToFile(String fileName) {

        // Uses try-with-resources to automatically close the FileWriter.
        // Prevents potential resource leaks or file descriptor exhaustion.
        try (FileWriter writer = new FileWriter(fileName)) {

            // Writes a single string to the file.
            writer.write("Hello World!");

        } catch (IOException ex) {
            // Prints any IOException message — useful for debugging small examples.
            System.out.println(ex.getMessage());
        }
    }

    private static String readFromFile (String stringtxt)

            throws IOException{

        // Constructs a BufferedReader that reads the file using UTF-8 encoding.
        // InputStreamReader + FileInputStream allows for explicit encoding specification.
        BufferedReader reader = new BufferedReader
                ( new InputStreamReader (new FileInputStream (stringtxt), StandardCharsets.UTF_8));
//                new BufferedReader(new FileReader(stringtxt));

        // Reads the first line only; does not iterate over the full file.
        String str = reader.readLine ();

        // NOTE: The reader is not closed here — this may lead to resource leaks.
        // In long-running apps, this should be enclosed in try-with-resources.
        return str;

    }

}
