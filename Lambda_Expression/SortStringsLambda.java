package Lambda_Expression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortStringsLambda {
    public static void main(String[] args) {
        // Create a list of strings
        List<String> strings = new ArrayList<>();
        strings.add("Orange");
        strings.add("Banana");
        strings.add("Apple");

        // Lambda expression to sort the list of strings alphabetically
        Collections.sort(strings, (s1, s2) -> s1.compareTo(s2));

        // Display the sorted list
        System.out.println("Sorted Strings: " + strings);
    }
}
