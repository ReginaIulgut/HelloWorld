package arrays;

import java.util.Arrays;

public class SearchingInArrays {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 8, 10};
        boolean has7 = false;
         for (int number : numbers){
             if(number == 7) {
                 has7 = true;
                 break;
             }
         }
        System.out.println(has7);

         boolean has5 = false;
         for (int number : numbers){
             if(number == 5) {
                 has5 = true;
                 break;
             }
        }
        System.out.println(has5);

        System.out.println("\n-----Binary search in arrays-----\n");

        //NOTE: Binary search can be used if the array is sorted ONLY, otherwise you will get wrong result
        //Binary search returns the index of the element if found
        //if it returns negative index it means the element doesn't exist
        //if two elements exist, then the method returns the last index
        Arrays.sort(numbers);
        System.out.println(Arrays.binarySearch(numbers, 10));
        System.out.println(Arrays.binarySearch(numbers, 9)); // -something
    }
}
