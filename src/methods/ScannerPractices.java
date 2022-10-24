package methods;

import utilities.ScannerHelper;

import java.util.Scanner;

public class ScannerPractices {
    public static void main(String[] args) {

       /*
        Scanner input = new Scanner(System.in);


        System.out.println("Please enter your name ");
        String name = input.nextLine();

        System.out.println("Please enter your age");
        int age = input.nextInt();

        System.out.println(name + "'s age is " + age);
        */

        /*String name = ScannerHelper.getAName();
        System.out.println("The name is = " + name);

        int age = ScannerHelper.getAnAge();
        System.out.println(name + "'s age is" + age);

         */
        System.out.println(ScannerHelper.getAName() + "'s age is " + ScannerHelper.getAName() +
                "\n and address is " + ScannerHelper.getAnAddress()) ;




    }
}
