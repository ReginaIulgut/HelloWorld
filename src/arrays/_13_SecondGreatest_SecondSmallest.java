package arrays;

import java.util.Arrays;

public class _13_SecondGreatest_SecondSmallest {
    public static void main(String[] args) {

    }
    public static void secondMaxAndSecondMin (int[] numbers){
        int secondMax = 0;
        int secondMin = 0;
        Arrays.sort(numbers);
        for (int i = numbers.length - 2; i > numbers[0]; i--){
            if (numbers[i] != numbers[numbers.length-1])
                secondMax = numbers[i];
        }
        for(int i = 0; i < numbers.length-1; i++){
            if(numbers[i] != numbers[i+1])
                secondMin = numbers[i];
        }
        System.out.println("The max number is = " + numbers[numbers.length -1] +
                "\nThe second max is = " + secondMax +
                "\nThe min is = " + numbers[0] +
                "\nThe second min is = " + secondMin);
    }
}
