package arraylist_linkedlist_vector;

import java.util.LinkedList;
import java.util.List;

public class Exercise03_RemoveElements {
    public static void main(String[] args) {
        List<String> languages = new LinkedList<>();
        languages.add("Java");
        languages.add("JavaScript");
        languages.add("C#");
        languages.add("Python");
        languages.add("C++");
      /*
        for (String language : languages) {
            if (language.startsWith("A")) languages.remove(language);
        }


        for (int i = 0; i < languages.size(); i++) {
            if(languages.get(i).startsWith("J")) {
                languages.remove(languages.get(i));
                i--;
            }
        }
       */
        /*
        languages.removeIf(element -> element.startsWith("J"));
        System.out.println(languages);
         */
        languages.removeIf(element -> !element.startsWith("C"));
        System.out.println(languages);
    }
}
