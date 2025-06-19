package javaapplication;

public class DemoThread extends Thread {

    @Override
    public void run() {
        try {
            // Loop 10 times with a delay between iterations
            for (int i = 0; i < 10; i++) {
                Thread.sleep(100); // Sleep for 100 milliseconds to simulate work
                System.out.println(Thread.currentThread().getName() + "-" + i); // Print thread name and loop counter
            }
        } catch (InterruptedException e) {
            // Swallowed exception — not recommended in production
            // Ideally, log or handle the interruption properly
        }
    }

}
