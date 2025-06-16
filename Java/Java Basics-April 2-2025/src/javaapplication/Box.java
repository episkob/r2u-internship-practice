package javaapplication;

import java.util.Comparator;

// The Box class represents a rectangular box with dimensions a, b, and c.
// Implements Comparable<Box> to allow sorting by volume.
public class Box implements Comparable<Box> {

    private int a, b, c;

    // Accessor for 'a' to allow sorting by this field externally
    public int getA() {
        return a;
    }

    public Box(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return "Box{" + "a=" + a + ", b=" + b + ", c=" + c + '}';
    }

    // Returns the volume of the box.
    public int volume() {
        return a * b * c;
    }

    // Default comparison logic based on volume.
    // NOTE: May overflow — use Integer.compare() in critical systems.
    @Override
    public int compareTo(Box rValue) {
        return volume() - rValue.volume();
    }

    // ===== Comparator implementations =====

    // Variant 1: Non-static inner class (commented out).
    // This would require a Box instance to instantiate.

    /*
    public class ComreByA implements Comparator<Box> {
        @Override
        public int compare(Box b1, Box b2) {
            return b1.a - b2.a;
        }
    }
    */

    // Variant 2: Static nested class — allows sorting by 'a' without an instance of Box.
    public static class ComreByA implements Comparator<Box> {
        @Override
        public int compare(Box b1, Box b2) {
            return b1.a - b2.a;
        }
    }

    // Variant 3: Static method returning a Comparator (via anonymous inner class).
    // This allows flexible inline sorting strategies.
    public static Comparator<Box> compareByA() {
        return new Comparator<Box>() {
            @Override
            public int compare(Box b1, Box b2) {
                return b1.a - b2.a;
            }
        };
    }
}
