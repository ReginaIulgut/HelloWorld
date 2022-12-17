package Collection;

import apple.laf.JRSUIUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class Practice02_FindClosestToN {
    public static void main(String[] args) {
        System.out.println(findClosest(new ArrayList<>(Arrays.asList(3,5,10)), 7));
    }

    public static int findClosest (List<Integer> numbers, int n){
        TreeSet<Integer> set = new TreeSet<>(numbers);
        if(set.isEmpty() || (set.size() == 1 && set.first() == n)) throw new RuntimeException("There is not number close to " + n);

        else if (set.size() == 1) return set.first();
        else {
            try{
                int lowerNumber = set.lower(n);
            }
            catch (NullPointerException e){
                return set.higher(n);
            }

            try{
                int higherNumber = set.higher(n);
            }
            catch (NullPointerException e){
                return set.lower(n);
            }

            int lower = set.lower(n), higher = set.higher(n);
            return n - lower <= higher - n ? lower : higher;
        }
    }
}
