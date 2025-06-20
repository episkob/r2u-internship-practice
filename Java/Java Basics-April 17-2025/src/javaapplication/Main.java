package javaapplication;

public class Main {

    // Shared static variable to be incremented by multiple threads
    static int x;

    public static void main(String[] args) throws InterruptedException {

        // Monitor object used for synchronization (lock)
        Object monitor = new Object();

        // Define a Runnable that increments x 1000 times,
        // synchronizing on the shared monitor to avoid race conditions
        var runner = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    synchronized (monitor) {
                        x++; // Critical section: safely increment shared variable
                    }
                }
            }
        };

        // Create an array of 5 threads that will run the same logic concurrently
        Thread[] threads = new Thread[5];

        // Instantiate and start each thread
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(runner);
            threads[i].start();
        }

        // Wait for all threads to finish before proceeding
        for (int i = 0; i < threads.length; i++) {
            threads[i].join();
        }

        // Output the final value of x; expected to be 5000 (5 threads × 1000 iterations)
        System.out.println("x = " + x);
    }
}
