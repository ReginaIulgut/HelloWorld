package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Homework15 {

    // TASK-1
    public static int[] fibonacciSeries1(int n){
        int[] fibonacciSeries = new int[n];
        int zero = 0, one = 1, sum;
        for (int i = 0; i < fibonacciSeries.length; i++) {
            fibonacciSeries[i] = zero;
            sum = zero + one;
            zero = one;
            one = sum;
        }
        return fibonacciSeries;
    }

    // TASK-2
    public static int fibonacciSeries2(int n){
        int[] fibonacciSeries = fibonacciSeries1(n);
        return fibonacciSeries[n-1];
    }

    // TASK-3
    public static int[] findUniques(int[] a, int[] b){
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> listA = new ArrayList<>();
        ArrayList<Integer> listB = new ArrayList<>();
        for (int element : a) {
            listA.add(element);
        }
        for (int element : b) {
            listB.add(element);
        }

        for (int i = 0; i < listA.size(); i++) {
            if (!list.contains(listA.get(i)) && !listB.contains(listA.get(i))) list.add(listA.get(i));
        }
        for (int i = 0; i < listB.size(); i++) {
            if (!list.contains(listB.get(i)) && !listA.contains(listB.get(i))) list.add(listB.get(i));
        }
        int[] uniques = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            uniques[i] = list.get(i);
        }
        return uniques;
    }
    // TASK-4
    public static boolean isPowerOf3(int n){
        if(n == 1 || n % 3 == 0);
        return true;
    }

    // TASK-5
    public static int firstDuplicate(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        int min = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (set.contains(arr[i]))
                min = i;
            else set.add(arr[i]);
        }
        if (min != -1)
            System.out.println("The first duplicate is " + arr[min]);
        else System.out.println("There are no duplicates elements");
        return min;
    }


    public static void main(String[] args) {
        System.out.println("\n-------TASK-1-------");
        System.out.println(Arrays.toString(fibonacciSeries1(5)));

        System.out.println("\n-------TASK-2-------");
        System.out.println(fibonacciSeries2(8));

        System.out.println("\n-------TASK-3-------");
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {3,4,5,5};
        System.out.println(Arrays.toString(findUniques(arr1,arr2)));

        System.out.println("\n-------TASK-4-------");
        System.out.println(isPowerOf3(1));

        System.out.println("\n-------TASK-5-------");
        System.out.println(firstDuplicate(new int[]{1, 2, 2, 3}));
    }
}
