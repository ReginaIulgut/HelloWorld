package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class Practice04_MinMaxValues {
    public static void main(String[] args) {
        System.out.println(max(new Integer[]{10, 100, 123, 507, 25}));
        System.out.println(min(new Integer[]{10, 100, 123, 507, 25}));
        System.out.println(min(new Integer[]{10}));
        System.out.println(min(new Integer[]{}));

        System.out.println("SECOND MAX");

        System.out.println(secondMax(new Integer[]{10, 100, 123, 507, 25}));
        System.out.println(secondMax(new Integer[]{10}));
        System.out.println(secondMax(new Integer[]{10,10,10,10}));
        System.out.println(secondMax(new Integer[]{}));

        System.out.println("SECOND MIN");
        System.out.println(secondMin(new Integer[]{10,100,123,507,25}));
        System.out.println(secondMin(new Integer[]{5,5,5,5}));
        System.out.println(secondMin(new Integer[]{}));

        System.out.println("NTH MAX");
        System.out.println(nthMax(new ArrayList<>(Arrays.asList(10, 100, 123, 507, 25)), 3));
        System.out.println(nthMax(new ArrayList<>(Arrays.asList(10,10,10,10,10,10)), 3));
        System.out.println(nthMax(new ArrayList<>(Arrays.asList(10,3)), 3));

    }


    public static Integer max(Integer[] arr){
        return new TreeSet<>(Arrays.asList(arr)).pollLast();
    }

    public static Integer min (Integer[] arr){
       // return new TreeSet<>(Arrays.asList(arr)).pollFirst();
        try{
            return new TreeSet<>(Arrays.asList(arr)).first();
        }catch (Exception e){
            return null;
        }
    }

    public static Integer secondMax (Integer[] arr){
        TreeSet<Integer> set = new TreeSet<>(Arrays.asList(arr));
        if(set.size() < 2) return null;

        set.pollLast(); // max - removed
        return set.last();
    }

    public static Integer secondMin (Integer[] arr){
        TreeSet<Integer> set = new TreeSet<>(Arrays.asList(arr));
        if(set.size() < 2) return null;

        set.pollFirst(); // min - removed
        return set.first();
    }

    public static Integer nthMax(List<Integer> numbers, int number){
        TreeSet<Integer> set = new TreeSet<>(numbers);
        if(set.size() < number) return null;
        for (int i = 0; i < number - 1; i++) {
            set.pollLast();
        }
        return set.last();
    }

    public static Integer nthMin(List<Integer> numbers, int number){
        TreeSet<Integer> set = new TreeSet<>(numbers);
        if(set.size() < number) return null;
        for (int i = 0; i < number - 1; i++) {
            set.pollFirst();
        }
        return set.first();
    }
}
