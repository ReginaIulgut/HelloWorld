package practice.arrayListPracticies;

import java.util.ArrayList;
import java.util.Arrays;

public class FindFirstNegativePositive {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(0, -4, -7, 0, 5, 10, 45));
        printFirstPositiveNegative(numbers);

    }
    public static void printFirstPositiveNegative (ArrayList<Integer> numbers){
        int firstPositive = 0;
        int firstNegative = 0;
/*
        for (int number: numbers){
            if(number < 0) {
                firstNegative = number;
                break;
            }
        }
        for(int number: numbers){
            if(number > 0){
                firstPositive = number;
                break;
            }
        }
        System.out.println("First positive number is " + firstPositive);
        System.out.println("First negative number is " + firstNegative);

 */
        for (Integer n : numbers){
            if (n > 0 && firstPositive == 0){
                // n > 0 current number is positive
                // firstPos == 0 did we find the positive and changed the default value
                firstPositive = n;
            }
            if (n < 0 && firstNegative == 0){
                firstNegative = n;
            }
        }
        System.out.println("First positive number is " + firstPositive);
        System.out.println("First negative number is " + firstNegative);
    }
}
