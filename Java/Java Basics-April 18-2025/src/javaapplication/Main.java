package javaapplication;

public class Main {

    // Shared monitor object used for synchronization and signaling
    static Monitor mon = new Monitor();

    public static void main(String[] args) throws InterruptedException {

        // Thread 1: prints messages and notifies thread 2 once i >= 50
        Thread th1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("Hello from thread 1 - " + i);

                    // When i reaches 50 or higher, notify waiting thread
                    if (i >= 50) {
                        synchronized (mon) {
                            mon.x = i;      // Update shared state
                            mon.notify();   // Wake up any thread waiting on 'mon'
                        }
                    }
                }
            }
        });

        // Thread 2: waits until mon.x >= 50, then proceeds
        Thread th2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    synchronized (mon) {
                        // Wait while condition is not yet satisfied
                        while (mon.x < 50) {
                            mon.wait();  // Releases the monitor and blocks
                        }
                    }

                    // Once signaled and condition met, proceed with work
                    for (int i = 0; i < 100; i++) {
                        System.out.println("Hello from thread 2 - " + i);
                    }

                } catch (InterruptedException ex) {
                    // Interrupted during wait — handled silently here
                }
            }
        });

        // Start thread 1
        th1.start();

        // Slight delay to increase chances that thread 2 hits wait() before notify() occurs
        Thread.sleep(5);

        // Start thread 2
        th2.start();

        // Wait for both threads to complete
        th1.join();
        th2.join();
    }
}

// Monitor class used for coordination between threads
class Monitor {
    int x;  // Shared state variable for condition checking
}
