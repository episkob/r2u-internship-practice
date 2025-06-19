package javaapplication;

public class CancelThread implements Runnable {

    private Thread self; // The actual working thread
    private static int threadsCounter; // Static counter to assign unique IDs
    private int threadID; // This thread's unique ID
    private int counter; // Counter incremented by the thread while running
    private volatile boolean canWork = true; // Flag to control execution

    public CancelThread() {
        // Assign thread ID and create a new Thread with a meaningful name
        threadID = threadsCounter++;
        self = new Thread(this, "CancelThread-" + threadID);

        // Auto-starting the thread is disabled/commented
        // self.start();
    }

    // Starts the thread and returns current counter value (usually 0)
    public int start() {
        self.start();
        return counter;
    }

    // Signals the thread to stop by changing the flag; returns counter value at the time of call
    public int stop() {
        System.out.println("Sending stop!");
        canWork = false;
        return counter;
    }

    // Sends an interrupt signal to the thread — may break blocking operations
    public int interrupt() {
        System.out.println("Sending interrupt!");
        self.interrupt();
        return counter;
    }

    // Waits for the thread to finish for up to a given number of milliseconds
    public int join(int ms) throws InterruptedException {
        self.join(ms);
        return counter;
    }

    @Override
    public void run() {
        // Infinite loop with interrupt handling — useful when thread may be blocked
        // while (true){
        //     try {
        //         Thread.sleep(50);
        //     } catch (InterruptedException ex){
        //         System.out.println("Interrupting");
        //         break;
        //     }
        //     counter++;
        // }

        // Main execution loop controlled by the 'canWork' flag
        while (canWork){
            counter++; // Simple CPU-bound operation
        }
    }
}
