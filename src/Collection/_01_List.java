package Collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class _01_List {
    public static void main(String[] args) {

        /*
        - They preserve insertion order
        - Duplicates is allowed
        - null elements is allowed

        - Performance
        - Memory
        - Initial capacity
        - Load
        - The way they store the data

         */
        LinkedList<String> fruits = new LinkedList<>();

        fruits.add("apple");
        fruits.offer("orange");
        fruits.offerFirst("pineapple");


        System.out.println(fruits);
    }
}
