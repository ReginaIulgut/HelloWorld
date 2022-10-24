package math_class;

import java.util.Scanner;

public class AbsoluteMethod {
    public static void main(String[] args) {
        System.out.println("Difference between yours is " + Math.abs(10-14));
        System.out.println("Difference between yours is " + Math.abs(14-10));
        System.out.println("Difference between yours is " + Math.abs(14-10));
        System.out.println("Subtraction between yours is " + (10-14));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hey user, please enter an age");
        int age = scanner.nextInt();
        System.out.println(" Please enter another age ");
        int age2 = scanner.nextInt();
        System.out.println("Difference between your ages is " + Math.abs(age - age2));
    }
}
