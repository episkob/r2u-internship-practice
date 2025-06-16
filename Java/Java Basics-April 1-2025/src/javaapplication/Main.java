package javaapplication;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // Initializing an array of boxes with various dimensions.
        // The resulting volumes are: 10, 100, and 8 respectively.
        Box[] boxes = {
                new Box(10, 1, 1),   // volume: 10
                new Box(1, 10, 10),  // volume: 100
                new Box(2, 2, 2)     // volume: 8
        };

        // Sorts the array of boxes in ascending order by volume.
        // Relies on the natural ordering defined by the Box.compareTo() method.
        Arrays.sort(boxes);

        // Iterates over the sorted array and prints each box.
        // Thanks to the overridden toString() method, output is human-readable.
        for (Box box : boxes) {
            System.out.println(box);
        }
    }
}
