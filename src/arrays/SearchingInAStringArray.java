package arrays;

import java.util.Arrays;

public class SearchingInAStringArray {
    public static void main(String[] args) {
        String[] objects = {"Remote", "Mouse", "Mouse", "Keyboard", "iPad"};

        Arrays.sort(objects);
        if (Arrays.binarySearch(objects, "Mouse") >= 0) System.out.println(true);
        else System.out.println(false);
    }
}
