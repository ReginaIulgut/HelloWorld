package operators.arithmetic_operators;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Hey user, how much you make yearly?");
        double yearlySalary = input.nextDouble();
        System.out.println("Your monthly payment is $" + yearlySalary / 12 + " then!");


    }
}
