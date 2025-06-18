package javaapplication;

import java.text.DateFormat;
import java.util.Calendar;

public class Main {

    public static void main(String[] args) {

        // Gets the singleton instance. Ensures only one object is ever created.
        Singleton s = Singleton.getInstance();

        // Retrieves the instance again; should return the exact same object.
        Singleton s2 = Singleton.getInstance();

        // Verifies that both references point to the same object (singleton).
        if (s == s2) System.out.println("Ok");

        // Gets current date and time from system calendar.
        Calendar sys = Calendar.getInstance();
        System.out.println(sys.getTime());

        // Uses default locale-specific date formatting to print the date.
        DateFormat format = DateFormat.getDateInstance();
        System.out.println(format.format(sys.getTime()));

    }

}
