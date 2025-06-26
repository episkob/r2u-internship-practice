package javaapplication;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

    public static void main (String[] args) throws IOException {

        // Create a server socket bound to port 30333
        ServerSocket server = new ServerSocket(30333);

        // Wait for a client to connect (this is a blocking call)
        Socket soc = server.accept();

        // Output the client's IP address to the console
        System.out.println("Client " + soc.getInetAddress().getHostAddress() + " connected");

        // Create a buffered reader to read text input from the client
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(soc.getInputStream())
        );

        // Read one line sent by the client
        String str = reader.readLine();

        // Print received data
        System.out.println("Client sent: " + str);

        // Create a buffered writer to send a response to the client
        BufferedWriter writer = new BufferedWriter(
                new OutputStreamWriter(soc.getOutputStream())
        );

        // Write the response back to the client
        writer.write(str);
        writer.write(" - accepted");

    }

}
