package Collection;

import java.util.*;

public class Practice03_SubSets {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3,2,7,10,15,20,5));
        TreeSet<Integer> nums = new TreeSet<>(numbers);
        SortedSet<Integer> moreThan7 = nums.tailSet(7, false);
        System.out.println(moreThan7);
        System.out.println(nums.headSet(5, true));
        System.out.println(nums.subSet(5, true, 15, true));


    }
}
