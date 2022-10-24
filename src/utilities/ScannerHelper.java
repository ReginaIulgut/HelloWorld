package utilities;

import java.util.Scanner;

public class ScannerHelper {
    static Scanner input = new Scanner(System.in);

    /*
    create a methods that ask user to enter the name and RETURN it
     */

    public static String getAName(){
        System.out.println("Please enter your name");
        String name = input.nextLine();

        return name;
    }
    /*
    Create a method that asks user to enter the age and RETURN it
     */

    public static int getAnAge(){
        System.out.println("Please enter your age");
        int age = input.nextInt();
        input.nextLine();

        return age;
    }
    /*
    Address
     */
    public static String getAnAddress(){
        System.out.println("Please enter your address");
        String address = input.nextLine();

        return address;
    }
    public static String getAString(){
        System.out.println("Please enter a String");
        return input.nextLine();
    }
}
