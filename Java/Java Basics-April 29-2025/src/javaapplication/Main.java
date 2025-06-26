package javaapplication;

import java.sql.*;
import java.util.Enumeration;

public class Main {

    // JDBC Driver class name for MySQL 8.x
    public static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";

    // Connection string with host, port, credentials and connection parameters
    public static final String CONN_STRING = "jdbc:mysql://localhost:3306/?user=root&password=&userLegacyDatetimeCode=false&serverTimezone=UTC&useSSL=false";

    public static void main (String[] args) {

        // Print all currently loaded JDBC drivers (for diagnostic purposes)
        Enumeration<Driver> driver = DriverManager.getDrivers ();
        while (driver.hasMoreElements ())
            System.out.println (driver.nextElement ());

        try {
            // Load the MySQL JDBC driver dynamically
            Class.forName (DRIVER_NAME);
        } catch ( ClassNotFoundException ex ) {
            System.out.println ("MySQL driver not found!");
            return;
        }

        Connection conn = null;
        try {
            // Attempt to establish a connection using the connection string
            conn = DriverManager.getConnection (CONN_STRING);
        } catch ( SQLException ex ) {
            System.out.println ("Cannot open connection!" + ex.getMessage ());
        }

        try {
            // Create a SQL statement
            Statement st = conn.createStatement ();

            // Uncomment the following lines as needed for schema setup
            // st.executeUpdate("CREATE DATABASE db");
            st.executeUpdate("USE db");

            // st.executeUpdate("CREATE TABLE persons (name varchar(32), age int(3))");
            // st.executeUpdate("INSERT INTO persons (name, age) VALUES ('fds', 13)");

            // Query persons with age = 32 and order results by name
            ResultSet rs = st.executeQuery("SELECT * FROM persons WHERE age=32 ORDER BY name");

            // Iterate through the result set and print each record
            while (rs.next ()) {
                System.out.println (rs.getString ("name") + " - " + rs.getString ("age"));
            }

        } catch ( SQLException ex ) {
            System.out.println (ex.getMessage ());
        }

    }
}
