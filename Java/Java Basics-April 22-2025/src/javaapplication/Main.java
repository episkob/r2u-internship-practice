package javaapplication;

import java.util.ArrayList;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args)
            throws InterruptedException, ExecutionException {

        // Create a thread pool with a fixed number of 5 threads
        ExecutorService exec = Executors.newFixedThreadPool(5);

        // List to store Future objects representing pending results of tasks
        ArrayList<Future<String>> results = new ArrayList<>();

        // Submit 12 tasks to the executor service
        // Since the pool has only 5 threads, tasks will be queued
        for (int i = 0; i < 12; i++) {
            results.add(exec.submit(new Callable<String>() {
                @Override
                public String call() throws Exception {
                    // Simulate workload by sleeping
                    Thread.sleep(1000);

                    // Print the name of the thread that completed the task
                    System.out.println(Thread.currentThread().getName() + " is done");

                    // Return thread name as the result of the task
                    return Thread.currentThread().getName();
                }
            }));
        }

        // Signal the executor to stop accepting new tasks,
        // but continue executing existing ones
        exec.shutdown();

        // Wait for each future result and print it
        for (Future<String> result : results) {
            // .get() blocks until the result is available
            System.out.println("Go result: " + result.get());
        }

        // Final confirmation that main thread has completed execution
        System.out.println("Main thread is done");
    }
}
