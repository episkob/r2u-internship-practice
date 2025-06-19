package javaapplication;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        // Instantiate a new CancelThread wrapper object
        CancelThread thread = new CancelThread();

        // Starts the internal thread; returns current counter value (likely 0 at this point)
        System.out.println("start() - : " + thread.start());

        // Waits up to 1000ms for the thread to finish; prints current counter value
        System.out.println("join() - " + thread.join(1000));

        // Optionally sends an interrupt signal to the thread — commented out by author
        // System.out.println("interrupt() - " + thread.interrupt());

        // Sends a soft stop request by setting canWork to false; prints counter again
        System.out.println("stop() - " + thread.stop());

    }

}
