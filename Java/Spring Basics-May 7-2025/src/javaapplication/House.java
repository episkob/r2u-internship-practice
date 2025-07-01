package javaapplication;

public class House {

    private Window window;

    // Default constructor
    public House() {
        // no window is set yet
    }

    // Constructor with a window object
    public House(Window window) {
        // window = new WoodFrameWindow (); // This line is commented out
        this.window = window;
    }

    // Call the open method on the window
    public void view() {
        window.open();
    }

    // Getter for window
    public Window getWindow () {
        return window;
    }

    // Setter for window
    public void setWindow (Window window) {
        this.window = window;
    }

    public static void main (String[] args) {
        // new House().view(); // this would throw NullPointerException without a window

        // Create a window instance
        Window window = new WoodFrameWindow ();

        // Create a house
        House house = new House ();

        // Set the window
        house.setWindow (window);

        // Open the window (view through the house)
        house.view();
    }
}
