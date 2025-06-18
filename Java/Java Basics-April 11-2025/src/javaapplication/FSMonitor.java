package javaapplication;

public interface FSMonitor {

    // Event type constants
    static final int CREATE = 1;
    static final int DELETE = 2;

    // Callback method to be called when an event occurs
    void event(String fName, int kind);
}
