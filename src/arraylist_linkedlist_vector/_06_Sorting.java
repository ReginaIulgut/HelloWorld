package arraylist_linkedlist_vector;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class _06_Sorting {
    public static void main(String[] args) {
        /*
        Create below LinkedList to store data

        1 -> 10, -3, 5, 15
        2 -> Remote, Phone, Laptop

        Print the LinkedLists
        Sort it and print it again
         */

        LinkedList<Integer> numbers = new LinkedList<>(Arrays.asList(10, -3, 5, 15));
        LinkedList<String> objects = new LinkedList<>(Arrays.asList("Remote", "Phone", "Laptop"));
        System.out.println(numbers);
        System.out.println(objects);

        Collections.sort(numbers);
        Collections.sort(objects);

        System.out.println(numbers);
        System.out.println(objects);

    }
}
