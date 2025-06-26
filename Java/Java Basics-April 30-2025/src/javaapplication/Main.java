package javaapplication;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

    public static void main (String[] args) throws IOException {

        // Create a server socket bound to port 30333
        ServerSocket server = new ServerSocket(30333);

        // Wait for a client to connect (blocking call)
        Socket soc = server.accept();

        // Log client connection
        System.out.println("Client " + soc.getInetAddress().getHostAddress() + " connected");

        // Set up input stream to receive data from the client
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(soc.getInputStream())
        );

        // Set up output stream to send response to the client
        BufferedWriter writer = new BufferedWriter(
                new OutputStreamWriter(soc.getOutputStream())
        );

        String str;

        // Loop to handle multiple messages until "close" is received
        while (true) {
            // Read a single line of input from the client
            str = reader.readLine();
            if ("close".equals(str)) break;

            // Log the received message
            System.out.println("Client sent: " + str);

            // Send back the received message with confirmation
            writer.write(str);
            writer.write(" - accepted");
            writer.write("\n");        // Ensure client receives a full line
            writer.flush();            // Push data immediately to client
        }

        // Log connection closure
        System.out.println("Client closed connection");

        // Optional: release resources
        reader.close();
        writer.close();
        soc.close();
        server.close();
    }
}
