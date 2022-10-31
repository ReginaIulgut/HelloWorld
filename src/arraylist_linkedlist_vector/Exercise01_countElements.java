package arraylist_linkedlist_vector;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise01_countElements {
    public static void main(String[] args) {

        ArrayList<String> colours = new ArrayList<>(Arrays.asList("Blue", "Brown", "Pink", "Yellow", "Red", "Purple"));
       /*
        colours.add("Blue");
        colours.add("Brown");
        colours.add("Pink");
        colours.add("Yellow");
        colours.add("Red");
        colours.add("Purple");
        */
        System.out.println(colours + "\nThe size is = " + colours.size());
        for (String colour : colours) {
            System.out.println(colour);
        }
        int counter = 0;
        for (String colour : colours) {
            if (colour.length() == 6) counter++;
        }
        System.out.println(counter);

        int countO = 0;
        for (String colour : colours) {
            if(colour.contains("o")) countO++;
        }
        System.out.println(countO);

        countO = 0;
        for (int i = 0; i < colours.size(); i++){
            if (colours.get(i).contains("o")) countO++;
        }
        System.out.println(countO);
    }
}
