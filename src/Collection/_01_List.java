package Collection;

import java.util.ArrayList;

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
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("apple");
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("");
        fruits.add("");
        fruits.add(null);
        fruits.add(null);

        System.out.println(fruits);
    }
}
