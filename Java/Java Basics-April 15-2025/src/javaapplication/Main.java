package javaapplication;

public class Main {

    public static void main(String[] args) {

        // Instantiate two threads using the custom DemoThread class
        DemoThread th1 = new DemoThread();
        DemoThread th2 = new DemoThread();

        // Start both threads — they will run concurrently
        th1.start();
        th2.start();

        // Wait for the first thread to finish
        try {
            th1.join();
        } catch (InterruptedException e) {
            // If the main thread is interrupted while waiting, rethrow as unchecked
            throw new RuntimeException(e);
        }

        // Wait for the second thread to finish
        try {
            th2.join();
        } catch (InterruptedException e) {
            // Again, convert checked exception to unchecked for simplicity
            throw new RuntimeException(e);
        }

        // This message is printed only after both threads have completed
        System.out.println("End of main()");
    }

}
