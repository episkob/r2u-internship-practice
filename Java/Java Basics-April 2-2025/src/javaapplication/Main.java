package javaapplication;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // Array of boxes with varying dimensions.
        // Volumes: 10, 100, 8 respectively.
        Box[] boxes = {
                new Box(10, 1, 1),
                new Box(1, 10, 10),
                new Box(2, 2, 2)
        };

        // Sort by natural ordering (volume) via Comparable interface.
        Arrays.sort(boxes);

        System.out.println("Sorted by volume:");
        for (Box box : boxes) {
            System.out.println(box);
        }

        // Several alternative ways to sort by field 'a':

        // 1. Using non-static inner class — commented out due to needing enclosing instance.
        // Box.ComreByA cmp = new Box(0, 0, 0).new ComreByA();
        // Arrays.sort(boxes, cmp);

        // 2. Using static nested class
        // Arrays.sort(boxes, new Box.ComreByA());

        // 3. Using static method returning a Comparator
        // Arrays.sort(boxes, Box.compareByA());

        // 4. Using anonymous inner class
        // Arrays.sort(boxes, new Comparator<Box>() {
        //     @Override
        //     public int compare(Box b1, Box b2) {
        //         return b1.getA() - b2.getA();
        //     }
        // });

        // 5. Using lambda expression (modern and concise)
        Arrays.sort(boxes, (b1, b2) -> b1.getA() - b2.getA());

        System.out.println("Sorted by field 'a':");
        for (Box box : boxes) {
            System.out.println(box);
        }
    }
}
