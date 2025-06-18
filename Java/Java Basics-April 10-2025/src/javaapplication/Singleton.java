package javaapplication;

public class Singleton {

    // Volatile ensures visibility across threads.
    private static volatile Singleton instance;

    // Private constructor prevents external instantiation.
    private Singleton() {}

    // Synchronized accessor ensures thread-safe lazy initialization.
    public static synchronized Singleton getInstance () {
        if (instance == null) instance = new Singleton();
        return instance;
    }

}
