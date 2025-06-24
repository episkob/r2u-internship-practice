package javaapplication;

import java.util.Random;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        // Allocate array and result container based on constants
        GlobalData.array = new int[GlobalData.ARRAY_LEIGHT];
        GlobalData.result = new long[GlobalData.THREAD_COUNT];
        int i;

        // Fill the array with random integers in range [0, 9]
        Random rdn = new Random();
        for (i = 0; i < GlobalData.ARRAY_LEIGHT; i++) {
            GlobalData.array[i] = rdn.nextInt(10);
        }

        // Sequential summation (baseline performance measurement)
        long sum1 = 0;
        long t1 = System.currentTimeMillis();
        for (i = 0; i < GlobalData.ARRAY_LEIGHT; i++) {
            sum1 += GlobalData.array[i];
        }
        long t2 = System.currentTimeMillis();
        System.out.println("Sum1: " + sum1 + " Time: " + (t2 - t1));

        // Multithreaded summation
        SumThread[] threads = new SumThread[GlobalData.THREAD_COUNT];
        for (i = 0; i < GlobalData.THREAD_COUNT; i++) {
            threads[i] = new SumThread(i); // Create a thread for each slice
        }

        long sum2 = 0;
        long t3 = System.currentTimeMillis();

        // Start all threads
        for (i = 0; i < GlobalData.THREAD_COUNT; i++) {
            threads[i].start();
        }

        // Wait for all threads to finish
        for (i = 0; i < GlobalData.THREAD_COUNT; i++) {
            threads[i].join();
        }

        // Aggregate partial results from all threads
        for (i = 0; i < GlobalData.THREAD_COUNT; i++) {
            sum2 += GlobalData.result[i];
        }

        long t4 = System.currentTimeMillis();
        System.out.println("Sum2: " + sum2 + " Time: " + (t4 - t3));
    }
}
