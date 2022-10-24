package loops.fori_loops;

import java.util.Scanner;
import java.util.SortedMap;

public class Exercise06_PrintEvenNumbersUsingScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 2 number");
        int a = input.nextInt();
        int b = input.nextInt();
        if (a > b){
            for (int i = b ; i <= a; i++){
                if (i % 2 == 0) System.out.println(i);
            }
        }
        if (a < b){
            for (int i = a ; i <= b; i++){
                if (i % 2 == 0) System.out.println(i);
            }
        }
        /*
        for ( int i = Math.min(a,b); i <= Math.max(a,b); i++) {
        if (i % 2 == 0) System.out.println(i);
         */
    }
}
