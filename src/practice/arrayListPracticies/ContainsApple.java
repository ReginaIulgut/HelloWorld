package practice.arrayListPracticies;

import java.util.ArrayList;
import java.util.Arrays;

public class ContainsApple {
    public static void main(String[] args) {
        ArrayList<String> elements = new ArrayList<>(Arrays.asList("Apple", "Orange"));
        System.out.println(containApple(elements));
    }
    public static boolean containApple (ArrayList<String> elements){
        boolean apple = false;
        for (String element : elements) {
            element.equalsIgnoreCase("apple");
            apple = true;
        }
        return apple;
        /*
        return elements.contains("apple") || fruits.contains("Apple");
         */
    }
}
