package javaapplication;

public class Main {

    public static void main(String[] args) {

        // Print the name of the current thread (usually "main")
        System.out.println("Start of " + Thread.currentThread().getName());

        // Create a new instance of HelloThread (a subclass of Thread)
        HelloThread thread = new HelloThread();

        // Start the new thread. This invokes its run() method asynchronously.
        thread.start();

        try {
            // Wait for the HelloThread to finish before continuing.
            // Ensures that the main thread will not print its final line before the child thread finishes.
            thread.join();
        } catch (InterruptedException ex) {
            // If the current thread is interrupted while waiting, rethrow as unchecked exception.
            throw new RuntimeException(ex);
        }

        // Indicates that the main thread has finished execution.
        System.out.println("End of main ()");
    }
}
