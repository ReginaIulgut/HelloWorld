package arraylist_linkedlist_vector;

import java.util.ArrayList;

public class _02_StringArrayList {
    public static void main(String[] args) {

        System.out.println("----------TASK-1----------");
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Chicago");
        cities.add("Berlin");
        cities.add("Miami");
        System.out.println("The length is = " + cities.size() + "\n" + cities);
        cities.set(2,"Evanston");
        System.out.println(cities);
        cities.remove(1);
        cities.remove("Chicago");
        System.out.println(cities);

        cities.add("New York");
        cities.add("Rome");
        cities.add("Ghent");
        System.out.println(cities + "\nThe size is = " + cities.size());

        cities.clear();
        System.out.println(cities + "\nThe size is = " + cities.size());
    }
}
