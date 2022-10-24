package math_class;

import java.util.Scanner;

public class MinAndMaxWithScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Hey User,give me a number ");
        int number1 = input.nextInt();
        System.out.println("Hey User, give me another number ");
        int number2 = input.nextInt();
        System.out.println("Max of your numbers is " + Math.max(number1, number2));
        System.out.println("Min of your numbers is " + Math.min(number1, number2));

        System.out.println("Hey User, give me a number ");
        int num1 = input.nextInt();
        System.out.println("Hey User, give me another number ");
        int num2 = input.nextInt();
        System.out.println("Hey User, give the last number ");
        int num3 = input.nextInt();
        System.out.println(" Max of your numbers is " + Math.max(Math.max(num1, num2), num3));
        System.out.println(" Min of your numbers is " + Math.min(Math.min(num1, num2), num3));
    }
}
