package arrays;

import java.util.Arrays;

public class _03_doubleArray_ForEachLoop {
    public static void main(String[] args) {
        double[] numbers = {5.5, 6, 10.3, 25};
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers.length);

        for(double number : numbers){
            System.out.println(number);
        }
    }
}
