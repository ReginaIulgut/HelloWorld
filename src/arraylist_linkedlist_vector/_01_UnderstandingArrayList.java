package arraylist_linkedlist_vector;

import java.util.ArrayList;
import java.util.Arrays;

public class _01_UnderstandingArrayList {
    public static void main(String[] args) {
        // 1. Declaring an array vs an ArrayList

        String[] names1 = new String[3];

        ArrayList<String> names2 = new ArrayList<>(); //capacity = 10 by default

        // 2. Getting the size of the array vs ArrayList

        System.out.println("The size of array = " + names1.length); // 3
        System.out.println("The size of ArrayList = " + names2.size()); // 0

        // 3. Printing an array vs ArrayList

        System.out.println("The array = " + Arrays.toString(names1)); // [null, null, null]
        System.out.println("The ArrayList = " + names2); // []

        // 4. Adding elements to specific indexes

        names1[0] = "Alex";
        names2.add(0, "John"); // names2.add("John"); would be added to next available index

        System.out.println("The array = " + Arrays.toString(names1)); // [Alex, null, null]
        System.out.println("The ArrayList = " + names2); // [John]

        //TASK
        names1[1] = "Ali";
        names1[2] = "Andrii";
        names2.add(1, "Joe");
        names2.add(2, "Jane");
        System.out.println("The array = " + Arrays.toString(names1));
        System.out.println("The ArrayList = " + names2);

        names2.add("Abdallah");
        names2.add("Vlad");
        names2.add("Saeed");
        names2.add("Suzanne");
        names2.add("Hazal");
        names2.add("Yildiz");
        names2.add("Samir");
        System.out.println("The ArrayList = " + names2);

        // 5. Updating an existing element in an array vs ArrayList
        names1[1] = "Mike";
        names2.set(1, "Olena");




    }
}
