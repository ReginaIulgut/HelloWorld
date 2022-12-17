package Collection;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Practice01_RemoveDuplicates {
    public static void main(String[] args) {

       // int[] numbers = {-5, 10, -5, 10, 1, 2, 5};
        System.out.println(Arrays.toString(removeDuplicates(new Integer[]{-5, 10, -5, 10, 1, 2, 5})));
        System.out.println(Arrays.toString(removeDuplicates(new Integer[]{-5, 10, 1, 2, 5})));
        System.out.println(Arrays.toString(removeDuplicates(new Integer[]{})));
    }

    public static Integer[] removeDuplicates (Integer[] arr){
        return new LinkedHashSet<>(Arrays.asList(arr)).toArray(new Integer[0]);
        // Integer array -> Integer List -> LinkedHashSet -> Object array -> Integer array

        /*
        ArrayList<Integer> uniques = new ArrayList<>();
    for (Integer i : arr) {
        if(!uniques.contains(i)) uniques.add(i);
    }

    return uniques.toArray(new Integer[0]);
         */
    }


}
