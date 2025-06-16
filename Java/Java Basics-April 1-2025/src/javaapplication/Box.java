package javaapplication;

// The Box class represents a 3D rectangular box defined by three dimensions: a, b, and c.
// It implements Comparable to allow sorting by volume.
public class Box implements Comparable<Box> {

    // Encapsulated dimensions of the box.
    private int a, b, c;

    // Constructor initializing all three dimensions.
    public Box(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Provides a string representation of the Box instance.
    // Useful for debugging and logging.
    @Override
    public String toString() {
        return "Box{" + "a=" + a + ", b=" + b + ", c=" + c + '}';
    }

    // Calculates the volume of the box.
    // Simple but essential piece of business logic.
    public int volume() {
        return a * b * c;
    }

    // Implements comparison logic based on volume.
    // WARNING: Subtracting two integers can overflow.
    // For production-safe code, consider using Integer.compare(volume(), rValue.volume()) instead.
    @Override
    public int compareTo(Box rValue) {
        return volume() - rValue.volume();
    }
}
