package loops.fori_loops;

import java.util.Scanner;

public class Exercise05_PrintOddNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int b = input.nextInt();
        for (int i = 0; i <= b; i++){
            if (i % 2 == 1) System.out.println(i);
        }
    }
}
