package javaapplication;

public class GlobalData {

    // Size of the array to be summed — very large, suitable for multithreading
    public final static int ARRAY_LEIGHT = 500000000;

    // Number of threads to use
    public final static int THREAD_COUNT = 2;

    // Shared array to be summed
    public static int[] array;

    // Each thread writes its partial sum into this array
    public static long[] result;
}
