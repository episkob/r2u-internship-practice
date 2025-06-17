package javaapplication;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Declares a list that can store any subclass of Number (e.g., Integer, Double, etc.).
        // Ensures type safety — unlike raw or Object-typed lists, this restricts usage to numeric types.
//        ArrayList list = new ArrayList<>();
        ArrayList<Number> list = new ArrayList<>();

        // Adding an Integer.
        list.add(2);

        // Adding a Double.
        list.add(3.6);

        // The following lines are commented out to maintain type safety — they would not compile:
//        list.add("Hello");   // String is not a subclass of Number.
//        list.add(true);      // Boolean is not a subclass of Number.

        // Adding null — legal for any reference type, but requires null-checks if used.
        list.add(null);

//        list.add(new Object()); // Object is not a subtype of Number.

        // Using enhanced for-loop to print each element in the list.
        // Only Numbers are printed; avoids runtime ClassCastExceptions.
//        for (Object obj : list) {
//            System.out.println(obj);
//        }

        for (Number num : list) {
            System.out.println(num);
        }

        // Creates a nested list structure — a list of Number-lists.
        ArrayList<ArrayList<Number>> bigList = new ArrayList<>();

        // Adds the first list to the big list.
        bigList.add(list);

        // Adds an Integer to the first sublist via bigList accessor.
        bigList.get(0).add(10);

        // Adds a second, empty sublist.
        bigList.add(new ArrayList<>());

        // Adds an Integer to the second sublist.
        bigList.get(1).add(11);

        // Iterates over each sublist and prints its elements.
        // Demonstrates handling of nested generic structures.
        for (ArrayList<Number> arrayList : bigList) {
            for (Number number : arrayList) {
                // Appends an empty string to force String context, avoids null pointer when printing nulls.
                System.out.println(number + "");
            }
            System.out.println();
        }

        // A list of Comparables — allows heterogeneous but comparable numeric types.
        ArrayList<Comparable> cList = new ArrayList<>();

        // Adding two Doubles — both implement Comparable<Double>, but as raw Comparable type,
        // compiler accepts them without complaint. Still type-unsafe if misused.
        cList.add(10.);
        cList.add(2.5);

        // Uses compareTo to compare two numbers.
        // Works because both elements implement Comparable and are of the same runtime type (Double).
        if (cList.get(0).compareTo(cList.get(1)) > 0)
            System.out.println("Ok");
    }
}
