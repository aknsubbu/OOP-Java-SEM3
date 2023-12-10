package Collections_Framework;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListOperations {
    public static void main(String[] args) {
        // Create an ArrayList of colors
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");

        // i) Insert an element at the first position.
        colors.add(0, "Yellow");

        // ii) Delete the third element.
        colors.remove(2);

        // iii) Search for "Red" color.
        boolean containsRed = colors.contains("Red");
        System.out.println("Contains Red: " + containsRed);

        // iv) Sort the array list.
        Collections.sort(colors);

        // v) Update the fourth element with "Yellow"
        if (colors.size() >= 4) {
            colors.set(3, "Yellow");
        }

        // Print the final ArrayList
        System.out.println(colors);
    }
}
