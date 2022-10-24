package math_class;

import java.util.Scanner;

public class square_root {
    public static void main(String[] args) {
        int num = 81;
        int num2 = 25;
        int num3 = 64;

        System.out.println("Root of number is " + Math.sqrt(num));
        System.out.println("Root of number is " + Math.sqrt(num2));
        System.out.println("Root of number is " + Math.sqrt(num3));

        Scanner scan = new Scanner(System.in);
        System.out.println("Hey user give me a number");
        int number = scan.nextInt();
        System.out.println(" Your number root is " + Math.sqrt(number));


    }
}
