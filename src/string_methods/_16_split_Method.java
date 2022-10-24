package string_methods;

import java.util.Arrays;

public class _16_split_Method {
    public static void main(String[] args) {
        /*
        - return
        - return a Syting array
        - non-static
        - takes regex as argument
         */
        String s = "Today is Sunday and the weather is nice";

        String[] arr1 = s.split(" ");
        System.out.println(Arrays.toString(arr1));

        System.out.println(Arrays.toString(s.split("is")));

    }
}
