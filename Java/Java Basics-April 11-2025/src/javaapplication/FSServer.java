package javaapplication;

import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;

public class FSServer {

    private String dir; // Directory to monitor
    private ArrayList<FSMonitor> clients; // List of registered clients
    private boolean canWork; // Control flag for main loop

    public FSServer(String dir) {
        this.dir = dir;
        clients = new ArrayList<>();
    }

    // Adds a client to the notification list
    public void addClient(FSMonitor client) {
        clients.add(client);
    }

    // Removes a client
    public void removeClient(FSMonitor client) {
        clients.remove(client);
    }

    // Starts monitoring (synchronously)
    public void start(){
        canWork = true;
        run(); // Blocking call
    }

    // Stops the server (will exit after current loop iteration)
    public void stop(){
        canWork = false;
    }

    // Core monitoring logic
    private void run(){
        try {
            // Create a WatchService to monitor file system events
            WatchService watch = FileSystems.getDefault().newWatchService();

            // Register the directory and specify which events to watch
            Paths.get(dir).register(
                    watch,
                    StandardWatchEventKinds.ENTRY_CREATE,
                    StandardWatchEventKinds.ENTRY_DELETE
            );

            // Main event loop
            while (canWork) {
                WatchKey key = watch.take(); // Blocks until an event is available

                // Process all events
                for (WatchEvent event : key.pollEvents()) {
                    String fName = event.context().toString(); // Get file name from event
                    int kind = 0;

                    // Determine event type
                    if (event.kind() == StandardWatchEventKinds.ENTRY_CREATE) {
                        kind = FSMonitor.CREATE;
                    } else kind = kind = FSMonitor.DELETE; { // <- redundant assignment, but unchanged
                        kind = FSMonitor.DELETE;
                    }

                    // Notify all clients
                    for (FSMonitor client : clients) {
                        client.event(fName, kind);
                    }
                }

                // Reset key to receive further events
                key.reset();
            }

            // Close the watch service after loop ends
            watch.close();

        } catch (IOException ex) {
            // Handle I/O exception (e.g., if directory is invalid)
        } catch (InterruptedException ex) {
            // Handle interruption (e.g., thread stop)
        }
    }
}
