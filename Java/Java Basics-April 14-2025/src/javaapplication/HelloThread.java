package javaapplication;

public class HelloThread extends Thread {

    @Override
    public void run() {
        // All three versions below are equivalent — they print the current thread's name.
        // They are commented out, possibly for testing or demonstration purposes.

        // System.out.println("Hello from " + getName() + " thread!");
        // ^ Uses the inherited getName() from Thread class — straightforward and readable.

        // System.out.println("Hello from " + this.getName() + " thread!");
        // ^ Equivalent to the above, but explicit use of "this" — same behavior.

        // Preferred version, especially in more complex contexts:
        System.out.println("Hello from " + Thread.currentThread().getName());
        // ^ This is the most explicit and robust — especially if used inside Runnable or nested logic.
    }
}
