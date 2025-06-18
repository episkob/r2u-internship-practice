package javaapplication;

public class Main {

    public static void main (String[] args) {

        // Initialize file system monitoring server, observing the current directory (".")
        FSServer server = new FSServer(".");

        // Add a client using an anonymous class that implements FSMonitor interface
        // It reacts to CREATE and DELETE events
        server.addClient(new FSMonitor() {
            @Override
            public void event(String fName, int kind) {
                switch (kind) {
                    case FSMonitor.CREATE:
                        System.out.println("File " + fName + " created");
                        break;
                    case FSMonitor.DELETE:
                        System.out.println("File " + fName + " deleted");
                        break;
                    default:
                        System.out.println("Unknown event");
                }
            }
        });

        // Start monitoring (this will block since run() is called directly)
        server.start();
    }
}
