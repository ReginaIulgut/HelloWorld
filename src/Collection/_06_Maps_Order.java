package Collection;

import java.util.*;

public class _06_Maps_Order {
    public static void main(String[] args) {
        HashMap<String, String> capital = new HashMap<>();
        capital.put("France","Paris");
        capital.put("Germany","Berlin");
        capital.put("Italy","Rome");
        capital.put("Spain","Madrid");

        System.out.println(capital);

        System.out.println(capital.get("Spain"));
        System.out.println(capital.get("Belgium")); // null
        System.out.println(capital.getOrDefault("Belgium", "Does not exist!"));

        System.out.println("\nContains Key\n");
        System.out.println(capital.containsKey("Germany"));
        System.out.println(capital.containsKey("Portugal"));

        System.out.println("\nContains Value\n");
        System.out.println(capital.containsValue("Ankara"));
        System.out.println(capital.containsValue("Berlin"));

        System.out.println("\nUpdate value\n");
        System.out.println(capital.replace("Canada", "Ottawa")); // null
        System.out.println(capital.replace("Germany", "BerLin", "Munich")); // false
        System.out.println(capital.replace("Germany", "Berlin", "Munich")); // true

        capital.put("Turkey", "Ankara");
        System.out.println(capital);

        capital.put("Turkey", "Istanbul");
        System.out.println(capital);

        System.out.println("\nRemove entries\n");
        capital.remove("France");
        System.out.println(capital);

        System.out.println(capital.remove("US")); // null
        System.out.println(capital);

        System.out.println(capital.remove("Germany", "Stuttgart")); // false
        System.out.println(capital);

        System.out.println(capital.remove("Germany", "Munich"));
        System.out.println(capital);

        System.out.println("\nAdvanced Map methods\n");
        // Keys: Turkey Italy Spain
        // Values: Istanbul Rome Madrid

        Set<String> set = capital.keySet();
        System.out.println(set);

        TreeSet<String> myTreeSet = new TreeSet<>(capital.keySet());
        System.out.println(myTreeSet);

        Collection<String> collection = capital.values();
        System.out.println(collection);

        ArrayList<String> list = new ArrayList<>(capital.values());
        System.out.println(list);

        for (String s : capital.keySet()) {
            System.out.println(s);
        }

        System.out.println("\nGetting all entries\n");
        Set<Map.Entry<String, String>> entries = capital.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry);
            System.out.println("Key = " + entry.getKey() + ". Value = " + entry.getKey());
        }

    }
}
