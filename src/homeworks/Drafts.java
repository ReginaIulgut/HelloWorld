package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Drafts {

    public static void main(String[] args) {
        /*

         */
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(3, 8, 34, 1, 6, 99));

        int largest = 0;
        int secondLargest = 0;

        for (int i = 0; i < nums.size(); i++){
            if (nums.get(i) > largest){
                secondLargest = largest;
                largest = nums.get(i);
            }
            else if (nums.get(i) > secondLargest){
                secondLargest = nums.get(i);
            }
        }
        System.out.println("Largest is 99 = " + largest +
                "\nSecond Largest is 34 = " + secondLargest);

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < nums.size(); i++){
            if (nums.get(i) < smallest){
                secondSmallest = smallest;
                smallest = nums.get(i);
            }
            else if (nums.get(i) < secondSmallest && nums.get(i) != smallest){
                secondSmallest = nums.get(i);
            }
        }

        System.out.println("Smallest is 1 = " + smallest +
                "\nSecond smallest is 3 = " + secondSmallest);

        int firstTerm = 0;
        int secondTerm = 1;

        for (int i = 1; i <= 10; i++){
            System.out.print(firstTerm + " ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }



    }
}
