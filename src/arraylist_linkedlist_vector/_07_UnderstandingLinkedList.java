package arraylist_linkedlist_vector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.TreeSet;

public class _07_UnderstandingLinkedList {
    public static void main(String[] args) {
        LinkedList<Double> number = new LinkedList<>(Arrays.asList(10.5, 5.5, 20.0));
        System.out.println(number.getFirst()); // 10.5
        System.out.println(number.getLast()); // 20.0
    }
}
