package arrays;

import java.util.Arrays;

public class _10_Find_Longest_Shortest {
    public static void main(String[] args) {

    }

    public static void findShortestLongest (String[] strs){
        /*
        1. containers  -> one for small another for short
        2. loop -> fori, increment, two if conditions one for small another for long
        3. print
         */
        String shortest = strs[0];
        String longest = strs[0];

        for (int i = 1; i < strs.length; i++){
            if(longest.length() < strs[i].length()){
                longest = strs[i];
            }
            if (shortest.length() > strs[i].length()){
                shortest = strs[i];
            }

        }
        System.out.println("Longest = " + longest +
                "\nShortest = " + shortest);
    }
}
